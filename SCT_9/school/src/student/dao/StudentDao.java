package student.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import student.domain.Student;
import utils.DataSourceUtils;

public class StudentDao {

	public List<Student> SelectStudent(String username) throws SQLException {
		// TODO 自动生成的方法存根
		QueryRunner runner  = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from student where username = ?";
		List<Student> studentlist = runner.query(sql, new BeanListHandler<Student>(Student.class), username);
		return studentlist;
	}

}
