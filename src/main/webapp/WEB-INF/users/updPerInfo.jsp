<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>

    <meta charset="utf-8">
    <title>修改个人资料</title>
    <link rel="icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="/css/common.css">
    <link rel="stylesheet" type="text/css" href="/css/head.css">
    <link rel="stylesheet" type="text/css" href="/css/personalpage.css">
    <link rel="stylesheet" type="text/css" href="/css/updPerInfo.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script src="/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".btn_changeinfo").click(function () {
                if($(".upd_nickname").val()==""){
                    alert("昵称不能为空");
                    return false;
                };
                $(".updForm").submit();
            });
            if("${sessionScope.users.sex}"!=null){
                if("${sessionScope.users.sex}"==1){
                    $("input[name='sex']").eq(0).prop("checked","checked");
                };
                if("${sessionScope.users.sex}"==0){
                    $("input[name='sex']").eq(1).prop("checked","checked");
                };
            };
        });
    </script>
</head>
<body>
<div class="head">
    <div class="headicon">
        <a href="/"><img src="/img/lb.png"></a>
        <a href="/"><span>刘斌博客</span></a>
    </div>
    <div class="userhead">
        <div class="userphoto">
            <img src="/pic/${sessionScope.users.headphoto}">
        </div>
        <div class="usernavi">
            <ul>
                <a href="/user/go/personalPage/${sessionScope.users.id}/1"><li>个人中心</li></a>
                <a href="/user/go/personalPage/${sessionScope.users.id}/1"><li>我的文章</li></a>
                <a href="/user/outLogin"><li>退出登录</li></a>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../common/head.jsp" flush="true"></jsp:include>

<div class="navi">
    <ul>
        <li><a href="/user/go/personalPage/${sessionScope.users.id}/1">博客主页</a></li>
        <li><a href="/user/go/personalPage/${sessionScope.users.id}/1">文章目录</a></li>
        <li><a href="/user/go/personalPage/${sessionScope.users.id}/1">个人资料</a></li>
    </ul>
</div>

<div class="midbody">
    <div class="class">
        <span class="font1">修改个人资料</span>
    </div>
    <img src="/pic/${sessionScope.users.headphoto}" width="200px" height="200px">
    <ul>
        <form class="updForm" action="/user/updPerInfo" method="post" enctype="multipart/form-data">
            <input type="hidden" name="id" value="${sessionScope.users.id }">
            <li><input type="file" name="u_headphoto" class="uploadhead"></li>
            <li><span>昵称：</span><input class="upd_nickname" type="text" name="nickname" value="${sessionScope.users.nickname }"></li>
            <li><span>个性签名：</span><input type="text" name="signature" value="${sessionScope.users.signature }"></li>
		<li><span>性别：</span>
		        <input class="sex" type="radio" name="sex" value="1">男
                <input class="sex" type="radio" name="sex" value="0">女</li>
            <li><span>出生日期：</span><input type="text" name="birth" value="<fmt:formatDate value="${sessionScope.users.birth }" pattern="yyyy-MM-dd"/>"></li>
            <li><span>QQ：</span><input type="text" name="qq" value="${sessionScope.users.qq }"></li>
            <li><span>邮箱：</span><input type="text" name="email" value="${sessionScope.users.email }"></li>
            <li><span>地址：</span><input type="text" name="address" value="${sessionScope.users.address }"></li>
        </form>
    </ul>
    <button class="btn_changeinfo">保存</button>
</div>

<div class="bottom">
    <ul>
        <li><a href="https://liubin101.github.io/aboutme/aboutme.html" target="_blank">关于我</a>　｜　</li>
        <li><a href="https://liubin101.github.io/aboutme/aboutme.html" target="_blank">意见反馈</a>　｜　</li>
        <li><a href="https://liubin101.github.io/aboutme/aboutme.html" target="_blank">联系我</a>　｜　</li>
        <li><a href="">刘斌个人博客version 1.0</a></li>
    </ul>
</div>
</body>
</html>
