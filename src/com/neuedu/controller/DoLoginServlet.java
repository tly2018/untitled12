package com.neuedu.controller;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoLoginServlet extends HttpServlet {
    /*
    * 登陆----表单提交
    * method get/post
    * 区别
    * get 参数在地址栏上进行拼接
    * post 不会在地址栏上拼接 （数据包的形式进行传送）
     * post相对安全-----表单提交 post   文件上传 file
     * 浏览器的地址栏 最多容纳2M
    *   get 获取数据
    *
    * */



    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("pwd");
        System.out.println(username+"   "+password);
        User u = service.getOne(username);
        if(u==null){
             resp.sendRedirect("register");
        }else{
          if(u.getPassword().equals(password)){
                resp.sendRedirect("list");
          }
        }


    }
}
