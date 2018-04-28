<%--
  Created by IntelliJ IDEA.
  User: ZLS
  Date: 2018/4/28
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>865171.cn后台管理工作平台</title>
</head>

<frameset rows="127,*,11" frameborder="no" border="0" framespacing="0">
    <frame src="${pageContext.request.contextPath}/admin/top" name="topFrame" scrolling="No"
           noresize="noresize" id="topFrame" />
    <frame src="${pageContext.request.contextPath}/admin/center" name="mainFrame" id="mainFrame" />
    <frame src="${pageContext.request.contextPath}/admin/down" name="bottomFrame" scrolling="No"
           noresize="noresize" id="bottomFrame" />
</frameset>
<noframes>
    <body>
    </body>
</noframes>
</html>