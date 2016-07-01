package com.lxd.bean;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Teacher teacher;
	private String proname;
	private String proinfo;
	private String time;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(Teacher teacher) {
		this.teacher = teacher;
	}

	/** full constructor */
	public Project(Teacher teacher, String proname, String proinfo, String time) {
		this.teacher = teacher;
		this.proname = proname;
		this.proinfo = proinfo;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getProname() {
		return this.proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public String getProinfo() {
		return this.proinfo;
	}

	public void setProinfo(String proinfo) {
		this.proinfo = proinfo;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}