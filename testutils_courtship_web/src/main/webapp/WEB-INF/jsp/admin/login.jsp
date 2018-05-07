<%--
  Created by IntelliJ IDEA.
  User: ZLS
  Date: 2018/4/28
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>后台管理</title>

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1/jquery-3.2.1.min.js"></script>
    <!-- Loading Bootstrap -->
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/admin/login.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<div class="login_box">
    <div class="login_l_img"><img src="${pageContext.request.contextPath}/images/admin/login-img.png"/></div>
    <div class="login">
        <div class="login_logo"><a href="#"  style="margin-top: 80px;"><img src="${pageContext.request.contextPath}/images/admin/login_logo.png" /></a>
        </div>
        <div class="login_name">
            <p>后台管理系统</p>
        </div>
        <form method="post">
            <input name="username" type="text" placeholder="用户名">
            <input name="password" type="password" id="password" placeholder="密码"/>
            <div>
                <input name="checkcode" type="text" id="checkcode" style="width:50%;" placeholder="验证码"/>
                <img id="logincheckimg" src="${pageContext.request.contextPath }/admin/changeimg"/>
            </div>
            <input value="登录" style="width:100%;" type="submit">
            <span id="msg"  class="span_msg" style="display: none"/>
        </form>
    </div>
    <div class="copyright"> 版权所有©2018</div>
</div>
</body>
<script type="text/javascript">
    $(function () {
        $("input[name='username']").blur(function () {
            $("#msg") .css('display','none'); $("#msg")[0].value='';
            $.post("${pageContext.request.contextPath}/admin/checkname", {
                "username": $("input[name='username']")[0].value
            }, function (data) {
                if(data.status==400){
                    $("#msg").css('display','block'); $("#msg")[0].innerHTML=data.msg;
                }
            }, "json");
        });
        $("#logincheckimg"). click(function () {
            $("#checkcode").val("");
            $("#logincheckimg")[0].src='${pageContext.request.contextPath}/admin/changeimg?date='+new Date().getTime();
        });
    });


</script>
</html>
