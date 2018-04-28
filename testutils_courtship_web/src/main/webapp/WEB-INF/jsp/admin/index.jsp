<%--
  Created by IntelliJ IDEA.
  User: ZLS
  Date: 2018/4/28
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Skiyo 后台管理工作平台 by Jessica</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/js.js"></script>
</head>
<body>
<div id="top"> </div>
<form id="login" name="login" action="main.php" method="post">
    <div id="center">
        <div id="center_left"></div>
        <div id="center_middle">
            <div class="user">
                <label>用户名：
                    <input type="text" name="user" id="user" />
                </label>
            </div>
            <div class="user">
                <label>密　码：
                    <input type="password" name="pwd" id="pwd" />
                </label>
            </div>
            <div class="chknumber">
                <label>验证码：
                    <input name="chknumber" type="text" id="chknumber" maxlength="4" class="chknumber_input" />
                </label>
                <img src="${pageContext.request.contextPath}/images/admin/checkcode.png" id="safecode" />
            </div>
        </div>
        <div id="center_middle_right"></div>
        <div id="center_submit">
            <div class="button"> <img src="${pageContext.request.contextPath}/images/admin/dl.gif" width="57" height="20" onclick="form_submit()" > </div>
            <div class="button"> <img src="${pageContext.request.contextPath}/images/admin/cz.gif" width="57" height="20" onclick="form_reset()"> </div>
        </div>
        <div id="center_right"></div>
    </div>
</form>
<div id="footer"></div>
</body>
</html>

