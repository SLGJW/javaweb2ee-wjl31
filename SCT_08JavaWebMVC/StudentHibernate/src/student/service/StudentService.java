package student.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import student.dao.StudentDao;
import student.domain.Student;
import student.utils.HibernateUtils;

public class StudentService {

	public List<Student> getAllStudent() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		List<Student> student = StudentDao.getAllStuent();
		tx.commit();
		return student;
		
	}

	public List<Student> selectStudent(DetachedCriteria dc) {
		// TODO 自动生成的方法存根
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		List<Student> student = StudentDao.selectStudent(dc);
		tx.commit();
		return student;
	}

	public void save(Student student) {
		// TODO 自动生成的方法存根
		//根据客户ID获得客户对象p]
		StudentDao.save(student);
		//将客户
	}


}
