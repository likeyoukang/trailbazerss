package edu.zut.hb.software.trailblazers.admin.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.hb.software.base.dao.GenericDaoTestCase;
import edu.zut.hb.software.trailblazers.admin.domain.User;

public class UserDaoTest extends GenericDaoTestCase<Long, User, UserDao> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(UserDaoTest.class.getName());

	@Autowired
	UserDao userDao;

	@Test
	public void testFindAll() {

		List<User> result = this.userDao.findAll();
		for (User user : result) {
			System.out.println(user.getPassword());
			
		}
//		if (logger.isInfoEnabled()) {
//			logger.info("testFindAll() - List<User> result={}", result); //$NON-NLS-1$
//		}

	}

}
