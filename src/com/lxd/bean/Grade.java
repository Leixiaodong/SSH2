package com.lxd.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String grade;
	@SuppressWarnings("unchecked")
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** full constructor */
	@SuppressWarnings("unchecked")
	public Grade(String grade, Set students) {
		this.grade = grade;
		this.students = students;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@SuppressWarnings("unchecked")
	public Set getStudents() {
		return this.students;
	}

	@SuppressWarnings("unchecked")
	public void setStudents(Set students) {
		this.students = students;
	}

}