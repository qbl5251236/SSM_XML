<%--
  Created by IntelliJ IDEA.
  User: 小邱
  Date: 2022/2/25
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("ctx", request.getContextPath()); %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    更新
    <form action="${ctx}/Users/save" method="post">
        <input name="id" placeholder="id">
        <input name="name" placeholder="name">
        <input name="age" placeholder="age">
        <button type="submit">保存</button>
    </form>
</div>
<div>
    删除
    <form action="${ctx}/Users/remove" method="post">
        <input name="id" placeholder="id">
        <button type="submit">删除</button>
    </form>
</div>


</body>
</html>
