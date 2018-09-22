<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>

    <meta charset="utf-8">
    <title>写文章</title>
    <link rel="icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="/css/common.css">
    <link rel="stylesheet" type="text/css" href="/css/head.css">
    <link rel="stylesheet" type="text/css" href="/css/personalpage.css">
    <link rel="stylesheet" type="text/css" href="/css/writeArticle.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script src="/js/jquery-1.12.4.min.js"></script>
    <script charset="utf-8" src="/kindeditor/kindeditor-all-min.js"></script>
    <script charset="utf-8" src="/kindeditor/lang/zh-CN.js"></script>
    <script>
        $(function () {
            KindEditor.ready(function(K) {
                window.editor = K.create('.acontent', {
                    cssPath : '/kindeditor/plugins/code/prettify.css',
                    uploadJson : '/kindeditor/jsp/upload_json.jsp',
                    fileManagerJson : '/kindeditor/jsp/file_manager_json.jsp',
                    allowFileManager : true,
                    afterBlur : function() {
                        this.sync();
                    }
                });
            });
            $(".art_submit").click(function () {
                editor.sync();
                if($(".art_title").val()==""){
                    alert("标题不能为空");
                    return false;
                };
                if($(".acontent").val()==""){
                    alert("正文不能为空");
                    return false;
                };
                $(".writeArtForm").submit();
            })
        })

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
        <li><a href="/user/go/personalPage/${users.id}/1">博客主页</a></li>
        <li><a href="/user/go/personalPage/${users.id}/1">文章目录</a></li>
        <li><a href="/user/go/personalPage/${users.id}/1">个人资料</a></li>
    </ul>
</div>

<div class="midbody">
    <form class="writeArtForm" action="/article/articleSubmit" method="post">
        <input type="text" name="title" class="art_title" placeholder="请输入标题"><br>
        <span class="font1">请选择分类：</span>
        <select name="artclass">
            <option value="娱乐">娱乐</option>
            <option value="文史">文史</option>
            <option value="教育">教育</option>
            <option value="体育">体育</option>
            <option value="美食">美食</option>
            <option value="旅游">旅游</option>
            <option value="新闻">新闻</option>
            <option value="其他">其他</option>
        </select><br>
        <div class="con_editor"><textarea name="acontent" class="acontent" style="width:800px;height:700px;"></textarea></div>
    </form>
    <div class="art_submit">发布</div>
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
