package edu.zut.hb.software.trailblazers.admin.service;

import java.util.List;

import edu.zut.hb.software.base.service.GenericManager;
import edu.zut.hb.software.trailblazers.admin.domain.User;

public interface UserManager extends GenericManager<User,Long> {

	String sayHello(String name);

	List<User> getAll();
}
