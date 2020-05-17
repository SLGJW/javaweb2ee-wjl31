package student.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import student.domain.Student;
import student.utils.DataSourceUtils;

public class SelectStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String sname =  request.getParameter("sname");
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			List<Student> studentlist = null;
			String sql = "select * from  student where sname = ?";
			List<Student> studentlist1 = null;
			try {
				studentlist1 = runner.query(sql, new BeanListHandler<Student>(Student.class),sname);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			request.setAttribute("studentlist1", studentlist1);
			request.getRequestDispatcher("selectstudent.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}