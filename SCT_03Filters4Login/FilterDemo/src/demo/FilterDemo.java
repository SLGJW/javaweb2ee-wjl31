package demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;

public class FilterDemo implements Filter{

	private String charSet; 
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.charSet =  arg0.getInitParameter("charset");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(this.charSet);
		response.setContentType("text/html;charset="+this.charSet);
		String username =  request.getParameter("username");
		String password =  request.getParameter("password");
		if(!username.equals("123")&&!password.equals("123")) {
			response.getWriter().write("你的权限不够不能访问");
		}else {
			chain.doFilter(request, response);
		}
	}
	@Override
	public void destroy() {
		
	}
}
