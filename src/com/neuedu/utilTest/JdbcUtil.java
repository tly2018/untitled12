package com.neuedu.utilTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL ="jdbc:mysql://127.0.0.1:3306/user?useUnicode=true&characterEncoding=utf8";
    private static final String USER="root";
    private static final String PWD ="1234";
    static{

        try {
            new com.mysql.jdbc.Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //专门定义一个方法 创建链接
    //按着自己的需求 封装方法 给自己使用
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn= DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //定义方法 增删改
    public static int executeUpdate(String sql,Object... obj){
        int a = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn=getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            if(obj!=null){
                for(int i=0;i<obj.length;i++){
                    pstmt.setObject(i+1,obj[i]);
                }
            }
            a = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(null,pstmt,conn);
        }
        return a;
    }
    public static <T> List<T> executeQuery(String sql,RowMap<T> rm,Object... obj){
        List<T> lists = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn=getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            if(obj!=null){
                for(int i=0;i<obj.length;i++){
                    pstmt.setObject(i+1,obj[i]);
                }
            }
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                T t = rm.RowMapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }
    public static <T> T queryOne(String sql,RowMap<T> rm,Object... obj){
        T t =null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn=getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            if(obj!=null){
                for(int i=0;i<obj.length;i++){
                    pstmt.setObject(i+1,obj[i]);
                }
            }
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                t= rm.RowMapping(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }





}