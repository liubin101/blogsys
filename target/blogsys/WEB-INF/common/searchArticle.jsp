<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--<%@ taglib uri="/WEB-INF/myTag.dtd" prefix="fl"%>--%>
<html>
<head>

    <meta charset="utf-8">
    <title>博客首页</title>
    <link rel="icon" href="/img/favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="/img/favicon.ico" type="image/x-icon" />
    <link href="/css/common.css" rel="stylesheet" type="text/css">
    <link href="/css/index.css" rel="stylesheet" type="text/css">
    <link href="/css/style.css" rel="stylesheet" type="text/css">
    <script src="/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".icon-search").click(function () {
                var title=$(".searchtext").val();
                if(title==""){
                    alert("搜索条件不能为空");
                    return false;
                };
                window.location.href="/searchArticle/"+title+"/1";
            });
            $(".btn_login").click(function () {
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
            if("${sessionScope.users.id}"==""){
                $(".userhead").css("display","none");
                $(".headnavi").css("display","inline-block");
                $(".logined").css("display","none");
                $(".nologin").css("display","block");
            }else{
                $(".userhead").css("display","inline-block");
                $(".headnavi").css("display","none");
                $(".logined").css("display","block");
                $(".nologin").css("display","none");
            }
        });

    </script>
</head>
<body>
<div class="headimg">
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
</div>
<div class="navi">
    <ul>
        <a href="/classes/娱乐/1"><li>娱乐</li></a>
        <a href="/classes/文史/1"><li>文史</li></a>
        <a href="/classes/教育/1"><li>教育</li></a>
        <a href="/classes/体育/1"><li>体育</li></a>
        <a href="/classes/美食/1"><li>美食</li></a>
        <a href="/classes/旅游/1"><li>旅游</li></a>
        <a href="/classes/新闻/1"><li>新闻</li></a>
        <a href="/classes/其他/1"><li>其他</li></a>
    </ul>
    <div class="search">
        <input class="searchtext" type="text" name="" placeholder="输入搜索文章">
        <span class="icon-search"></span>
    </div>
</div>
<div class="midbody">
    <div class="articles">
        <div class="class">
            <span class="font1">文章</span>
        </div>
        <c:forEach items="${pageBean.list}" var="article">
            <div class="article">
                <div class="author">
                    <a href="/user/go/personalPage/${article.userid}/1"><img src="/pic/${article.headphoto}" width="100px" height="100px"></a>
                    <a href="/user/go/personalPage/${article.userid}/1">${article.nickname}</a>
                </div>
                <div class="articleinfo">
                    <a href="/article/articleDetail/${article.id}/1"><span class="art_title">${article.title}</span></a>
                        <%--<p class="artinfo_p">${article.acontent}"></p>--%>
                    <div class="articlefoot">
                        <span class="icon-price-tag"></span> ${article.artclass}
                        <span class="icon-clock"></span> <fmt:formatDate value="${article.createtime}" pattern="yyyy-MM-dd HH:mm:ss" />
                        <span class="icon-eye"></span> 浏览(${article.looknum})
                        <span class="icon-bubble2"></span> 评论(${article.commentsnum})
                        <span class="icon-heart"></span> 喜欢(${article.likenum})
                    </div>
                </div>
            </div>
        </c:forEach>
        <div class="pagenum">
            共 ${pageBean.total} 篇
            <a href="">上一页</a>
            <c:forEach varStatus="i" begin="1" end="${pageBean.pages}">
                <c:choose>
                    <c:when test="${pageBean.pageNow==i.count}">
                        ${pageBean.pageNow}
                    </c:when>
                    <c:otherwise>
                        <a href="/${i.count}">${i.count}</a>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <a href="">下一页</a>
        </div>

    </div>
    <div class="rank">
        <h1>文章热度排行</h1>
        <ul>
            <li><i>1</i><a href="/article/articleDetail/10/1">让瑞典警方道歉，咋就这么难？</a></li>
            <li><i>2</i><a href="/article/articleDetail/9/1">酒中仙多作怪</a></li>
            <li><i>3</i><a href="/article/articleDetail/8/1">项目也可以学习到很多东西</a></li>
            <li><i>4</i><a href="/article/articleDetail/5/1">秩者</a></li>
            <li><i>5</i><a href="/article/articleDetail/7/1">不秀</a></li>
            <li><i>6</i><a href="/article/articleDetail/6/1">讲笑</a></li>
            <li><i>7</i><a href="/article/articleDetail/4/1">小孤独</a></li>
            <li><i>8</i><a href="/article/articleDetail/3/1">极伪</a></li>
            <li><i>9</i><a href="/article/articleDetail/14/1">C罗遭遇红牌引发诸多疑问</a></li>
            <li><i>10</i><a href="/article/articleDetail/11/1">他才是中国最牛企业家</a></li>
        </ul>
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
