package edu.zut.hb.software.trailblazers.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.hb.software.base.domain.BaseEntity;

@Table(name = "T_ADMIN_ROLE")
@Entity
public class Role extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Column
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
