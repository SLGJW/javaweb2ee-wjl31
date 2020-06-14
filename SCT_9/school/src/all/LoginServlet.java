package all;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =  request.getParameter("username");
		if(username.startsWith("t")) {
			request.setAttribute("username", username);
			request.getRequestDispatcher("teacher").forward(request, response);
		}else if(username.startsWith("s")) {
			request.setAttribute("username", username);
			request.getRequestDispatcher("student").forward(request, response);
		}else{
			String error = "你的用户名或者密码错误";
			request.setAttribute("error", error);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		};
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}