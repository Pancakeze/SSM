<%--
  Created by IntelliJ IDEA.
  User: zhibingze
  Date: 2018/8/1
  Time: 上午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file upload</title>
</head>
<body>
<form action="upload/fileupload" method="post" enctype="multipart/form-data">
    请选择图片：<input id="myfile"  name="myfile" type="file" />
              <input value="提交" type="submit">
</form>
</body>
</html>
