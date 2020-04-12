package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");//设置数据传输过来的编码
		String user = request.getParameter("user");
		String old = request.getParameter("old");
		String password = request.getParameter("address");
		response.getWriter().write("姓名："+user+"<br>");
		response.getWriter().write("年龄："+old+"<br>");
		response.getWriter().write("地址："+password+"<br>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
}