package com.neuedu.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServletB extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("yy"));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //可以 做逻辑判断 在数据库中获取数据
        //jsp 显示页面


        //转发 特点
        /*
        * 服务器端的行为 一次请求
        * 请求对象的方法
        * 转发的是文件
        * 转发后地址栏上的地址不会变化
        * 转发的文件的路径 只能在当前项目中
        * 可以公用同一个request 和response对象  通过setAttribute()
        *
        * */

        /*
        * 重定向
        * 浏览器的行为
        * 相当于两次请求
        * 响应对象的方法
        * 重定向的是地址
        * 地址栏的地址发生变化
        *
        *
        *
        *
        * */
        req.setAttribute("req","value");
        resp.sendRedirect("http://www.baidu.com");










       /*req.setAttribute("key","value");
       req.getRequestDispatcher("jsp/aindex.jsp").forward(req,resp);*/
       /*HttpSession session = req.getSession();
       session.setAttribute("session","session");
       req.getRequestDispatcher("jsp/aindex.jsp").forward(req,resp);*/
      /* req.getServletContext().setAttribute("servletContext","servletContext" );
        req.getRequestDispatcher("jsp/aindex.jsp").forward(req,resp);*/


        /*resp.setCharacterEncoding("utf-8");*/
       /* resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.write("中文");*/
       /* pw.write("<div style='background-color:#00ff00'>1234</div>");*/
        /*System.out.println(req.getContextPath());
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println( req.getServletPath());
        System.out.println(req.getCharacterEncoding());
        System.out.println(req.getContentType());
        System.out.println(req.getScheme());
        System.out.println(req.getServerName());
        System.out.println(req.getServerPort());*/










    }
}
