package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//设置页面显示的编码
		request.setCharacterEncoding("utf-8");//设置数据传输过来的编码
		/*
		 * 数据接受
		 * */
		String user = request.getParameter("user");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		PrintWriter out = response.getWriter();
		/*
		 * 数据显示
		 * */
		out.println("<html>");
		out.println("<body>");
		out.println("姓名："+user+"<br>");
		out.println("年龄："+age+"<br>");
		out.println("地址："+address+"<br>");
		//将数据用get方式进行传递
		out.println("<a href= 'getServlet?user="+user+"&age="+age+"&address="+address+"'>点击我传递数据</a>");
		out.println("</body>");
		out.println("</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}