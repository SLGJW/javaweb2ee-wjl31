package student.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.domain.Student;
import student.service.StudentService;

public class StudentListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentService();
		//调用Service查询所有客户
		List<Student> student = service.getAllStudent();
		//将客户列表放入request域中
		request.setAttribute("student", student);
		//转发到student list.jsp中
		request.getRequestDispatcher("studentlist.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}