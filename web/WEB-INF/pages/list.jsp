<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.pojo.Product" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guoke
  Date: 2018/12/12
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border:solid 1px #000;
            border-collapse: collapse;
        }
        table thead tr th,table tbody tr td{
            border: solid 1px #000 ;
            padding: 5px 10px;
        }
        table tbody tr:nth-child(odd){
            background-color: blanchedalmond;
        }
    </style>
</head>
<body>
    <a href="add">添加</a>
    <table>
        <thead>
            <tr>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品图片</th>
                <th>商品描述</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        <%--el表达式--%>

      <%--  <%
            List<Product> list = (List<Product>) request.getAttribute("lists");
            for (Product p:list
            ) {%>
                <tr>
                    <td><%=p.getProductId()%></td>
                    <td><%=p.getProductName()%></td>
                    <td><%=p.getPrice()%></td>
                    <td><%=p.getUrl()%></td>
                    <td><%=p.getProductDes()%></td>
                </tr>


           <% }

        %>--%>
        <c:forEach items="${lists}" var="p">
            <tr>
                <td>${p.productId}</td>
                <td>${p.productName}</td>
                <td>${p.price}</td>
                <td>${p.url}</td>
                <td>${p.productDes}</td>
                <td><a href="delete?productId=${p.productId}">删除</a>&nbsp;|&nbsp;<a href="update?productId=${p.productId}">修改</a></td>
            </tr>


        </c:forEach>
        </tbody>
    </table>







</body>
</html>
