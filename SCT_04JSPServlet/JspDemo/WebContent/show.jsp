<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String address = request.getParameter("address");
	name = new String(name.getBytes("iso-8859-1"),"utf-8");
	age = new String(age.getBytes("iso-8859-1"),"utf-8");
	address = new String(address.getBytes("iso-8859-1"),"utf-8");
	%>
	姓名：<%=name %><br>
	年龄：<%=age %><br>
	地址：<%=address %><br>
</body>
</html>