<%--
  Created by IntelliJ IDEA.
  User: ZLS
  Date: 2018/4/28
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/chili-1.7.pack.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easing.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dimensions.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.accordion.js"></script>
    <script language="javascript">
        jQuery().ready(function(){
            jQuery('#navigation').accordion({
                header: '.head',
                navigation1: true,
                event: 'click',
                fillSpace: true,
                animated: 'bounceslide'
            });
        });
    </script>
    <style type="text/css">
        <!--
        body {
            margin:0px;
            padding:0px;
            font-size: 12px;
        }
        #navigation {
            margin:0px;
            padding:0px;
            width:147px;
        }
        #navigation a.head {
            cursor:pointer;
            background:url(${pageContext.request.contextPath}/images/admin/main_34.gif) no-repeat scroll;
            display:block;
            font-weight:bold;
            margin:0px;
            padding:5px 0 5px;
            text-align:center;
            font-size:12px;
            text-decoration:none;
        }
        #navigation ul {
            border-width:0px;
            margin:0px;
            padding:0px;
            text-indent:0px;
        }
        #navigation li {
            list-style:none; display:inline;
        }
        #navigation li li a {
            display:block;
            font-size:12px;
            text-decoration: none;
            text-align:center;
            padding:3px;
        }
        #navigation li li a:hover {
            background:url(${pageContext.request.contextPath}/images/admin/tab_bg.gif) repeat-x;
            border:solid 1px #adb9c2;
        }
        -->
    </style>
</head>
<body>
<div  style="height:100%;">
    <ul id="navigation">
        <li> <a class="head">日志管理</a>
            <ul>
                <li><a href="AddArticle.php" target="rightFrame">添加日志</a></li>
                <li><a href="Articles.php" target="rightFrame">查看/修改日志</a></li>
            </ul>
        </li>
        <li> <a class="head">分类管理</a>
            <ul>
                <li><a href="AddKind.php" target="rightFrame">添加分类</a></li>
                <li><a href="Kinds.php" target="rightFrame">查看/删除分类</a></li>
            </ul>
        </li>
        <li> <a class="head">留言评论管理</a>
            <ul>
                <li><a href="messages.php" target="rightFrame">查看/删除留言</a></li>
                <li><a href="comments.php" target="rightFrame">查看/删除评论</a></li>
            </ul>
        </li>
        <li> <a class="head">友情链接管理</a>
            <ul>
                <li><a href="AddLink.php" target="rightFrame">添加友情链接</a></li>
                <li><a href="Links.php" target="rightFrame">查看/修改友情链接</a></li>
            </ul>
        </li>
        <li> <a class="head">版本信息</a>
            <ul>
                <li><a href="http://Www.865171.cn" target="_blank">by Jessica(865171.cn)</a></li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>

