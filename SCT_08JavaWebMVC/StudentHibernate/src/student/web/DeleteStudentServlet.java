package student.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import student.domain.Student;

public class DeleteStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		  SessionFactory sf = new Configuration().configure().buildSessionFactory();
	        Session s = sf.openSession();
	        s.beginTransaction();
	        Student student = s.get(Student.class, sid);
	        s.delete(student);
	        s.getTransaction().commit();
	        s.close();
	        sf.close();
	        request.getRequestDispatcher("studentlist").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}