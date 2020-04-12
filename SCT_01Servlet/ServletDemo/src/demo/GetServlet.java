package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//转换页面显示的编码
		String user = request.getParameter("user") ;
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		/*
		 * 转换数据接受的编码
		 * */
		user = new String(user.getBytes("iso-8859-1"),"utf-8");
		age = new String(age.getBytes("iso-8859-1"),"utf-8");
		address = new String(address.getBytes("iso-8859-1"),"utf-8");
		PrintWriter out = response.getWriter();
		/*
		 * 数据显示
		 * */
		out.println("<html>");
		out.println("<body>");
		out.println("姓名："+user+"<br>");
		out.println("年龄："+age+"<br>");
		out.println("地址："+address+"<br>");
		out.println("</body>");
		out.println("</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}