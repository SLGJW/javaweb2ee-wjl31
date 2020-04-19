package sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BSessionDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		String password = (String)session.getAttribute("password");
		if(username.equals("123")) {
			if(password.equals("123")) {
				RequestDispatcher a = request.getRequestDispatcher("/protect.html");
				a.forward(request, response);
			}else {
				RequestDispatcher b = request.getRequestDispatcher("/index.html");
				b.forward(request, response);
			}
		}else {
			RequestDispatcher c = request.getRequestDispatcher("/index.html");
			c.forward(request, response);
		}
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}