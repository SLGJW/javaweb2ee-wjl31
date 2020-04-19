package cookiedemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BCookieDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out =  response.getWriter();
		Cookie[] cookie= request.getCookies();
		String username = cookie[0].getValue();
		String password = cookie[1].getValue();
		if(username.equals("123")&&password.equals("123")) {
			RequestDispatcher a = request.getRequestDispatcher("/protect.html");
			a.forward(request, response);
		}else {
			RequestDispatcher b = request.getRequestDispatcher("/index.html");
			b.forward(request, response);
		}
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}