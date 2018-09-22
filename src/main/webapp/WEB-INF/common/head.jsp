<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         isELIgnored="false" %>
<meta charset="utf-8">
<div class="headimg">
    <div class="mypic">
        <img src="/pic/${user.headphoto}" width="220px" height="220px">
    </div>
    <div class="nickname">
        ${user.nickname}
    </div>
    <div class="myword">${user.signature}
    </div>
    <div class="picsource">
        <a href="https://www.pexels.com" target="_blank">背景图片来源：Pexels</a>
    </div>
</div>

