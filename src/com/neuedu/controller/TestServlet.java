package com.neuedu.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    /*
    * 处理请求的流程
    * 1 创建类 成为servlet组件 extends HttpServlet
    * 2 组件处理什么请求 web.xml中进行配置 servlet--servlet-Mapping
    * 3 重写 service 方法
    *
    *
    * servlet 生命周期   从创建到销毁*
    *
    * 加载类
    * 创建一个servlet实例
    * init      load-on-startup
    * service
    * destroy
    *
    *
    *
    * */

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("t"));

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {








    }

    @Override
    public void destroy() {

        System.out.println("destroy");
    }
}
