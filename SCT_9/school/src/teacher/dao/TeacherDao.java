package teacher.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import student.domain.Student;
import teacher.domian.Teacher;
import utils.DataSourceUtils;

public class TeacherDao {


	public List<Teacher> selectteacher(String username) throws SQLException {
		QueryRunner runner  = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from teacher where username = ?";
		List<Teacher> teacherlist = runner.query(sql, new BeanListHandler<Teacher>(Teacher.class), username);
		return teacherlist;
		// TODO 自动生成的方法存根
		
	}

	

}
