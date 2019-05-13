package edu.zut.hb.software.trailblazers.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.hb.software.base.service.impl.GenericTreeManagerImpl;
import edu.zut.hb.software.trailblazers.admin.dao.GroupDao;
import edu.zut.hb.software.trailblazers.admin.domain.Group;
import edu.zut.hb.software.trailblazers.admin.service.GroupManager;

@Service(value = "groupManager")
public class GroupManagerImpl extends GenericTreeManagerImpl<Group, Long> implements GroupManager {

	GroupDao gropuDao;

	@Autowired
	public void setGropuDao(GroupDao gropuDao) {
		this.gropuDao = gropuDao;
		this.treeDao = this.gropuDao;
		this.dao = this.treeDao;
	}

}
