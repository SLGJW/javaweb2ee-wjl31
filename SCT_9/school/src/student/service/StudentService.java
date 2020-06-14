package student.service;

import java.sql.SQLException;
import java.util.List;

import student.dao.StudentDao;
import student.domain.Student;

public class StudentService {

	public List<Student> SelectStudent(String username) throws SQLException {
		// TODO 自动生成的方法存根
		StudentDao dao = new StudentDao();
		return dao.SelectStudent(username);
	}

}
