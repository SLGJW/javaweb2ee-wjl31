<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addstudent" method="post">
<h1>学生信息录入</h1>
ID:<input type="text" name="sid"><br>
姓名：<input type="text" name="sname"><br>
生日：<input type="text" name="sbirthday"><br>
性别：男<input type="radio" name="ssex" value="0"  checked onclick="show();">　　
　　　女<input type="radio" name="ssex" value="1"  onclick="hidd();"><br>
<input type="submit" value="提交"><input type="reset" value="重置">
</form>
</body>
</html>