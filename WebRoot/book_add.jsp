<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>添加图书</h1>
	<form action="${pageContext.request.contextPath}/book_save.action" method="post">
	图书名称:<input type="text" name="name"><br>
	图书价钱:<input type="text" name="price"><br>
	<input type="submit" value="添加">
	
	
	</form>
	
</body>
</html>