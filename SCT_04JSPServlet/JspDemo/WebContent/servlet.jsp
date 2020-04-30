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
		response.setContentType("text/html;charset=UTF-8");//设置页面显示的编码
		request.setCharacterEncoding("utf-8");
		String name =  request.getParameter("name");
		String age =  request.getParameter("age");
		String address =  request.getParameter("address");
	%>
	<a href= "show.jsp?name='<%=name %>'&age='<%=age %>'&address='<%=address %>'">点击我传递数据</a>
</body>
</html>