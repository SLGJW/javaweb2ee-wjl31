package student.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import student.domain.Student;
import student.utils.HibernateUtils;

public class UpdateStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		int sid =Integer.parseInt( request.getParameter("sid"));
		String sname = request.getParameter("sname");
			Session session = HibernateUtils.openSession();
			session.beginTransaction();
			//新建一个对象 瞬时状态
			Student student = new Student();
			student.setSname(sname);
			// 主键值确定
			student.setSid(sid);;
			//update
			session.saveOrUpdate(student);
			// 提交事务  持久化状态
			session.getTransaction().commit();
			session.close();
	        //游离状态
		request.getRequestDispatcher("studentlist").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}