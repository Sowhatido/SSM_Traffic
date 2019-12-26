<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>个人信息查看</h1>
	
		<form action="user/UpdateDriverInfo.do" method="post">
			姓名：<input type="text" name="username" value="${info.username }" readonly="readonly"><br>
			身份：<input type="text" name="permission" value="${info.permission }" readonly="readonly"><br>	
			年龄：<input type="text" name="age" value="${info.age }"><br>
			性别：<input type="text" name="sex" value="${info.sex }"><br>
			电话：<input type="text" name="phone" value="${info.phone }"><br>
			<input type="submit" value="修改"> 
		
		</form>

</body>
</html>