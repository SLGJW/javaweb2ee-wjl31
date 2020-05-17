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

import com.sun.media.sound.RealTimeSequencerProvider;

import student.domain.Student;
import student.utils.DataSourceUtils;

public class StudentListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//准备学生的数据
				QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
				String sql = "select * from  student";
				List<Student> studentlist = null;
				try {
					studentlist= runner.query(sql, new BeanListHandler<Student>(Student.class));
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} 
				request.setAttribute("studentlist", studentlist);
				request.getRequestDispatcher("studentlist.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}