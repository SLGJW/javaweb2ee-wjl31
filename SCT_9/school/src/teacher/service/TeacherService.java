package teacher.service;

import java.sql.SQLException;
import java.util.List;

import student.domain.Student;
import teacher.dao.TeacherDao;
import teacher.domian.Teacher;

public class TeacherService {

	public List<Teacher> SelectTeacher(String username) throws SQLException {
		// TODO 自动生成的方法存根
		TeacherDao dao = new TeacherDao();
		return dao.selectteacher(username);
	
	}


}
