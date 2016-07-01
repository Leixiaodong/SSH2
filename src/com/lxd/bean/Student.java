package com.lxd.bean;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Grade grade;
	private String name;
	private String password;
	private String sex;
	private String image;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Grade grade) {
		this.grade = grade;
	}

	/** full constructor */
	public Student(Grade grade, String name, String password, String sex,
			String image) {
		this.grade = grade;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.image = image;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}