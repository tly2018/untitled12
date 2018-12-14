<%--
  Created by IntelliJ IDEA.
  User: guoke
  Date: 2018/12/12
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doRegister" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="pwd"><br>
        确认密码：<input type="password" name="pwds"><br>
        电话：<input type="text" name="tele"><br>
        <input type="submit" value="注册">
        <span>${message}</span>
    </form>
    <script type="text/javascript" src="js/test.js" >

    </script>

</body>
</html>
