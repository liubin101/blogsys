<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>

    <meta charset="utf-8">
    <title>登录</title>
    <link rel="icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link href="/css/common.css" rel="stylesheet" type="text/css">
    <link href="/css/userReg.css" rel="stylesheet" type="text/css">
    <script src="/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".btn_reg").click(function () {

                if($(".username").val()==""){
                    alert("用户名不能为空");
                    return false;
                };
                if($(".userpw").val()==""){
                    alert("密码不能为空");
                    return false;
                };
                $(".logForm").submit();
            });
        });

    </script>
</head>
<body>
<div class="midbody">
    <a href="/">返回首页</a>
    <p>欢迎登录</p>
    <ul>
        <form class="logForm" action="/user/userLogin" method="post">
            <li><span>用户名：</span><input type="text" name="username" class="username"></li>
            <li><span>密码：</span><input type="password" name="userpw" class="userpw"></li>
        </form>
        <c:if test="${errinfo!=null}">
            ${errinfo}
        </c:if>
    </ul>
    <button class="btn_reg">登录</button>没有账号，<a href="/go/userReg">立即注册</a>
</div>
</body>
</html>
