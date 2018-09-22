<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>正文</title>
    <link rel="icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="/css/common.css">
    <link rel="stylesheet" type="text/css" href="/css/head.css">
    <link rel="stylesheet" type="text/css" href="/css/personalpage.css">
    <link rel="stylesheet" type="text/css" href="/css/articleDetail.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<script src="/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".com_submit").click(function () {
            if($(".com_area").val()==""){
                alert("评论内容不能为空");
                return false;
            };
            $(".commentForm").submit();
        });
        if("${sessionScope.users.id}"==""){
            $(".userhead").css("display","none");
            $(".headnavi").css("display","inline-block");
            $(".wrt_comment").css("display","none");
        }else{
            $(".userhead").css("display","inline-block");
            $(".headnavi").css("display","none");
        };
        if("${sessionScope.users.id}"!="${user.id}"){
            $(".userinfo a").css("display","none");
        };

    })
</script>
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
    <div class="headnavi">
        <ul>
            <li><a href="/go/userLogin">登录</a></li>
            <li><a href="/go/userReg">注册</a></li>
        </ul>
    </div>
</div>
<jsp:include page="head.jsp" flush="true"></jsp:include>

<div class="navi">
    <ul>
        <li><a href="/user/go/personalPage/${user.id}/1">博客主页</a></li>
        <li><a href="/user/go/personalPage/${user.id}/1">文章目录</a></li>
        <li><a href="/user/go/personalPage/${user.id}/1">个人资料</a></li>
    </ul>
</div>
<div class="midbody">
    <div class="userinfo">
        <ul class="info1">
            <li>文章<span class="font2">${user.articlenum}</span></li>
            <li>关注<span class="font2">${user.focusnum}</span></li>
            <li>粉丝<span class="font2">${user.fansnum}</span></li>
        </ul>
        <ul class="info2">
            <li><span>性别：<c:if test="${user.sex==1}">男</c:if>
            <c:if test="${user.sex==0}">女</c:if></span></li>
            <li><span>出生日期：<fmt:formatDate value="${user.birth}" pattern="yyyy-MM-dd"></fmt:formatDate></span></li>
            <li><span>QQ：${user.qq}</span></li>
            <li><span>邮箱：${user.email}</span></li>
            <li><span>地址：${user.address}</span></li>
        </ul>
        <a href="/user/go/updPerInfo"><span class="changeinfo">修改个人资料</span></a>
    </div>
    <div class="articles">
        <div class="class">
            <span class="font1">正文</span>
        </div>
        <div class="art_title">${article.title}</div>
        <div class="art_info">
            <span class="icon-price-tag"></span> ${article.artclass}　
            <span class="icon-user"></span>${user.nickname}　
            <span class="icon-clock"></span><fmt:formatDate value="${article.createtime}" pattern="yyyy-MM-dd HH:mm:ss" />
        </div>
        <div class="acontent">
            ${article.acontent}
        </div>
        <div class="art_foot">
            <span class="icon-eye"></span> 浏览(${article.looknum})
            <span class="icon-bubble2"></span> 评论(${article.commentsnum})
            <span class="icon-heart"></span> 喜欢(${article.likenum})
        </div>
        <div class="comments">
            <div class="commenthead">
                <ul>
                    <a href=""><li class="allcoms">全部评论</li></a>
                    <a href=""><li>按热度排序</li></a>
                </ul>
                <div class="com_pagenum">
                    <span>共 ${pageBean.total} 条 </span>
                    <c:if test="${pageBean.pageNow!=1}">
                        <a href="/article/articleDetail/${article.id}/${pageBean.pageNow-1}">上一页</a>
                    </c:if>
                    <c:forEach varStatus="i" begin="1" end="${pageBean.pages}">
                        <c:choose>
                            <c:when test="${pageBean.pageNow==i.count}">
                                ${i.count}
                            </c:when>
                            <c:otherwise>
                                <a href="/article/articleDetail/${article.id}/${i.count}">${i.count}</a>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:if test="${pageBean.pageNow!=1}">
                        <a href="/article/articleDetail/${article.id}/${pageBean.pageNow+1}">下一页</a>
                    </c:if>
                </div>
            </div>
            <div class="wrt_comment">
                <div class="author">
                    <a href="/user/go/personalPage/${sessionScope.users.id}/1"><img src="/pic/${sessionScope.users.headphoto}" width="50px" height="50px"></a>
                </div>
                <form class="commentForm" action="/article/commentSubmit" method="post">
                    <input type="hidden" name="artid" value="${article.id}">
                    <textarea class="com_area" name="ccontent" cols="70" rows="5"></textarea>
                    <button class="com_submit">发表评论</button>
                </form>
            </div>
            <c:forEach items="${pageBean.list}" var="acomment">
                <div class="commentlist">
                    <div class="com_author">
                        <a href="/user/go/personalPage/${acomment.userid}/1"><img src="/pic/${acomment.headphoto}" width="50px" height="50px"></a>
                    </div>
                    <div class="com_content">
                        <a href="/user/go/personalPage/${acomment.userid}/1">${acomment.nickname}</a>
                        <p>${acomment.ccontent}</p>
                        <div class="com_foot">
                            <span class="icon-clock"></span> <fmt:formatDate value="${acomment.createtime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
                            <span class="icon-heart"></span> 喜欢(${acomment.likenum})
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

    </div>
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
