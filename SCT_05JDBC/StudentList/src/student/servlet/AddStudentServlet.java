package student.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import student.utils.DataSourceUtils;

public class AddStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String sbirthday = request.getParameter("sbirthday");
		String ssex = request.getParameter("ssex");
		try {
			Connection conn = DataSourceUtils.getConnection();
			QueryRunner runner = new QueryRunner();
			String sql ="INSERT INTO student(sid,sname,sbirthday,ssex)	VALUES (?,?,?,?) ";
			runner.update(conn, sql, sid,sname,sbirthday,ssex);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		response.getWriter().write("添加成功!!!<a href='studentlist'>返回信息列表页面</a><br><a href='addstudent.jsp'>继续添加</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}