package teacher.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.domain.Student;
import student.service.StudentService;
import teacher.domian.Teacher;
import teacher.service.TeacherService;

public class TeacherServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getAttribute("username");
		TeacherService service = new TeacherService();
		List<Teacher> teacherlist = null;
		try {
			teacherlist =  service.SelectTeacher(username);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		request.setAttribute("teacherlist", teacherlist);
		request.getRequestDispatcher("teacher.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}