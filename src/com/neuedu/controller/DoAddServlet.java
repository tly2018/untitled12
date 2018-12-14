package com.neuedu.controller;

import com.neuedu.pojo.Product;
import com.neuedu.service.IProductService;
import com.neuedu.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doAdd")
public class DoAddServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =  req.getParameter("name");
       double price = Double.parseDouble(req.getParameter("price"));
       String des = req.getParameter("des");
       String url = req.getParameter("url");
        Product p = new Product();
        p.setUrl(url);
        p.setProductName(name);
        p.setProductDes(des);
        p.setPrice(price);
       service.add(p);
       resp.sendRedirect("list");
    }
}
