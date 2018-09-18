<%--
  Created by IntelliJ IDEA.
  User: zhibingze
  Date: 2018/7/3
  Time: 下午5:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>--%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
    <meta name="content-type" content="text/html; charset=UTF-8">
    <title>first</title>
    <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
    <script>
        $(function(){
            // 给每一个小图片绑定一个点击事件
            $("p a").click(function(){
                var lagrePath = $(this).attr("href");
                var title = $(this).attr("title");

                // 将小图片中大图片请求，替换当前大图片。
                $("#largeImg").attr({
                    src:lagrePath,
                    alt:title
                });
                // 不返回的话，将会跳转页面显示图片
                return false;
            })

            $("#myfile").change(function(){
                console.log($("#myfile"));
                $("#previewImg").attr("src","file:///"+$("#myfile").val())
            });

            var lag = $("#large");
            lag.hide();

            // 添加图片预览样式
            // 鼠标y鼠标移上事件
            $("#previewImg").mousemove(function(e){
                console.log(e);
                lag.css({
                    left: e.pageX
                }).html("<img src='" + this.src + "'/>").show();
            // 鼠标移除事件
            }).mouseout(function(){
                lag.hide();
            })
        })

        // 使用js的方式实现文件上传预览
        function showPreview(obj) {

            var src = obj.value;
            console.log(src)
            $("#previewImg").html("<img src='"+src+"'/>");
        }
    </script>
</head>
<body>
    <%--<form action="">
        请选择图片：<input id="myfile"  name="myfile" type="file" onchange="showPreview(this)"/>
        <div id="previewImg"></div>

    </form>--%>

    <img id="previewImg" src="../images/1.jpg" width="80px;" height="80px"/>
    <form action="">
        请选择图片：<input id="myfile"  name="myfile" type="file" />

    </form>
    <div id="large"></div>
<h1>Hello  World!</h1>
    ${msg}
    <p><img id="largeImg" src="../images/1.jpg" alt="Large Image1"/></p>

    <p ><a href="../images/2.jpg" title="Large Image2"><img style="width:50px;hieght:50px;" src="../images/2.jpg" alt="Image1"/></a></p>
    <p ><a href="../images/3.jpg" title="Large Image3"><img style="width:50px;hieght:50px;" src="../images/3.jpg" alt="Image2"/></a></p>
    <p ><a href="../images/4.jpg" title="Large Image4"><img style="width:50px;hieght:50px;" src="../images/4.jpg" alt="Image3"/></a></p>
    <p ><a href="../images/5.jpg" title="Large Image5"><img style="width:50px;hieght:50px;" src="../images/5.jpg" alt="Image4"/></a></p>
    <p ><a href="../images/6.jpg" title="Large Image6"><img style="width:50px;hieght:50px;" src="../images/6.jpg" alt="Image5"/></a></p>

    <%--目前get请求，使用idea开发工具数据传到后台乱码--%>
    <form action="/springweb/receive" method="get">
        <input type="text" name="name">
        <input type="submit">
    </form>
</body>
</html>
