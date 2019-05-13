package edu.zut.hb.software.trailblazers.admin.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.hb.software.base.dao.GenericDaoTestCase;
import edu.zut.hb.software.trailblazers.admin.domain.Group;
import edu.zut.hb.software.trailblazers.admin.domain.Student;


public class StudentDaoTest extends GenericDaoTestCase<Long, Student, StudentDao> {

	private static final Logger logger = LogManager.getLogger(StudentDaoTest.class.getName());
	@Autowired
	StudentDao studentDao;

	@Test
	public void testFindAll() {
		
		int root_size = 10;
		for (int i = 0; i < root_size; i++) {
			Student student = new Student();
			student.setName("likeyou" + i);
			student.setCardId("362023****"+i);
			student.setAge(18);
			student.setPhone("157****9826");
			
			this.studentDao.save(student);
		}


		List<Student> result = this.studentDao.findAll();
/*		for (Student student : result) {
			System.out.println("student"+student.getCardId());
			
		}
*/
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Student> result={}", result); //$NON-NLS-1$
		}

	}


}
