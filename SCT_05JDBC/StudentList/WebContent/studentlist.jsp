<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="JavaScript">
function test(){
var k=window.confirm("你确定要删除该学生信息？");
if(k){
event.returnValue=true;
}
else{
event.returnValue=false;
}
}
</script>
</head>
<body>

	<h1>学生列表</h1>
	<a href="addstudent.jsp">添加学生</a> <a href="selectstudent.jsp">查找学生</a><br>
	<span>学号 &nbsp  &nbsp  &nbsp  &nbsp  &nbsp 姓名 &nbsp  &nbsp  &nbsp  &nbsp  &nbsp 生日</span>
	<c:forEach items="${studentlist}" var="student">
	<p>${student.sid}  ${student.sname}  ${student.sbirthday} 
		<a href="delstudent?sid=${student.sid}&sname=${student.sname}&sbirthday=${student.sbirthday}" onclick="test()">删除</a> 
		<a href="updatestudent.jsp?sid=${student.sid}&sname=${student.sname}&sbirthday=${student.sbirthday}">修改</a>	
	</p>
	</c:forEach>
</body>
</html>