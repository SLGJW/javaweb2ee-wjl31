package student.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import student.domain.Student;
import student.utils.DataSourceUtils;

public class StudentDao {

	public  List<Student> SelectAllStudent() throws SQLException {
		// TODO 自动生成的方法存根
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from student";
		 List<Student> studentlist  = runner.query(sql, new BeanListHandler<Student>(Student.class));
		return studentlist;
	}

	public int updatestudent(String sname,String sid) throws SQLException {
		// TODO 自动生成的方法存根
		QueryRunner runner  = new QueryRunner();
		Connection conn;
		conn = DataSourceUtils.getConnection();
		String sql = "update student set sname=? where sid=? ";
		return  runner.update(conn, sql, sname,sid);
		
		
	}

	public  int Delstudent(String sname) throws SQLException {
		// TODO 自动生成的方法存根
		QueryRunner runner  = new QueryRunner();
		Connection conn;
		conn = DataSourceUtils.getConnection();
		String sql = "delete from student where sname=? ";
		return  runner.update(conn, sql, sname);
	}

	public int Addstudent(String sid, String sname, String sbirthday, String ssex) throws SQLException {
		// TODO 自动生成的方法存根
		QueryRunner runner  = new QueryRunner();
		Connection conn;
		conn = DataSourceUtils.getConnection();
		String sql = "insert into student (sid,sname,sbirthday,ssex) values(?,?,?,?)";
		return runner.update(conn, sql, sid,sname,sbirthday,ssex);
	}

	public List<Student> SelectStudent(String sname) throws SQLException {
		// TODO 自动生成的方法存根
		QueryRunner runner  = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from student where sname = ?";
		List<Student> studentlist = runner.query(sql, new BeanListHandler<Student>(Student.class), sname);
		return studentlist;
	}

}
