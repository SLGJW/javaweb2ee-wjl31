package student.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.domain.Student;
import student.sevice.StudentService;

public class UpdateStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String sbirthday = request.getParameter("sbirthday");
		StudentService service = new StudentService();
		try {
			service.updatestudent(sname,sid);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		response.getWriter().write("更新成功!!!<a href='studentlist'>返回信息列表页面</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}