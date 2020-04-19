package cookiedemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Cookie cookie = new Cookie("name",username);
		Cookie cookie1 = new Cookie("password",password);
		response.addCookie(cookie);
		response.addCookie(cookie1);
		//20秒后将忘记用户名和密码
		cookie.setMaxAge(20);
		RequestDispatcher a = request.getRequestDispatcher("/bcookiedemo");
		a.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}