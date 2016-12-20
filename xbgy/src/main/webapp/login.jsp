<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="">
<title>Insert title here</title>
</head>
<body>
这是登录页面q
<form action = "${pageContext.request.contextPath}/login.action" method = "post">
	<input type = "text" name = "username">
	<input type = "text" name = "password">
	<input type="submit" value="tijiao">
</form>
</body>
</html>