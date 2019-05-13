package edu.zut.hb.software.trailblazers.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.hb.software.base.domain.BaseEntity;
@Table(name = "T_ADMIN_STUDENT")
@Entity
public class Student extends BaseEntity  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;
	
	@Column(name = "CARD_ID")
	private String cardId; 	
	
	@Column(name = "studentId")//身份证
	private String studentId;		//学号
	
	@Column(name = "NAME")
	private String name;			//姓名
	
	@Column(name = "AGE")
	private int age;				//年龄
	
	@Column(name = "SEX")
	private String sex;			  	//性别
	
	@Column(name = "ADDRESS")
	private String address;			//家庭住址
	
	@Column(name = "GRADE")
	private String grade;			//年级
	
	@Column(name = "EMIL")
	private String emil;			//年级
	
	@Column(name = "PHONE")
	private String phone;			//手机号码

	public Group getGroup() {
		return group;
	}

	public String getCardId() {
		return cardId;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}

	public String getGrade() {
		return grade;
	}

	public String getEmil() {
		return emil;
	}

	public String getPhone() {
		return phone;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
