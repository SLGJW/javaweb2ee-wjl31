package student.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import student.domain.Student;
import student.service.StudentService;

public class SelectStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentService();
		String sname = request.getParameter("sname");
		DetachedCriteria dc = DetachedCriteria.forClass(Student.class);
		if(sname!=null && !" ".equals(sname)) {
			dc.add(Restrictions.like("sname", "%"+sname+"%"));
		}
		//调用Service查询所有客户
		List<Student> student = service.selectStudent(dc);
		//将客户列表放入request域中
		request.setAttribute("student", student);
		//转发到student list.jsp中
		for(Student s : student) {
			  System.out.println(student);
			}
		request.getRequestDispatcher("selectstudent.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}