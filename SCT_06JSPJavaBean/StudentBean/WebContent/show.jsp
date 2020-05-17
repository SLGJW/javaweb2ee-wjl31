<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class="student.Student" scope="page"></jsp:useBean>  
	      
	<hr/>  
	<jsp:setProperty property="*" name="student"/>  
	ID：<jsp:getProperty property="sid" name="student"/><br/>  
	姓名：<jsp:getProperty property="sname" name="student"/> <br/> 
	生日： <jsp:getProperty property="sbirthday" name="student"/> <br/>
	性别：<jsp:getProperty property="ssex" name="student"/> <br/>

</body>
</html>