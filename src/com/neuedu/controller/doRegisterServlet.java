package com.neuedu.controller;

import com.neuedu.dao.IUserDao;
import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class doRegisterServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username =  req.getParameter("username");
       String pwd = req.getParameter("pwd");
       String pwds = req.getParameter("pwds");
       String tele = req.getParameter("tele");
       User u = new User();
       u.setUsername(username);
       u.setPassword(pwd);
       u.setTele(tele);
       if(pwd.equals(pwds)){
            service.insert(u);
            resp.sendRedirect("login");
       }else{
           req.setAttribute("message","输入有误");

       }




    }
}
