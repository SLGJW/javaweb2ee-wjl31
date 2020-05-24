package student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import student.domain.Student;
import student.utils.HibernateUtils;

public class StudentDao {

	public static  List<Student> getAllStuent() {
		Session session = HibernateUtils.getCurrentSession();
		Criteria c = session.createCriteria(Student.class);
		return c.list();
		// TODO 自动生成的方法存根
		
	}

	public static List<Student> selectStudent(DetachedCriteria dc) {
		// TODO 自动生成的方法存根
		Session session = HibernateUtils.getCurrentSession();
		Criteria c = dc.getExecutableCriteria(session);
		return c.list();
	}

	public static void save(Student student) {
		// TODO 自动生成的方法存根
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}

}
