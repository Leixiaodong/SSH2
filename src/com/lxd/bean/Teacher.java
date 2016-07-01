package com.lxd.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String password;
	private String sex;
	private String image;
	private String zhicheng;
	private String info;
	@SuppressWarnings("unchecked")
	private Set projects = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	@SuppressWarnings("unchecked")
	public Teacher(String name, String password, String sex, String image,
			String zhicheng, String info, Set projects) {
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.image = image;
		this.zhicheng = zhicheng;
		this.info = info;
		this.projects = projects;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getZhicheng() {
		return this.zhicheng;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@SuppressWarnings("unchecked")
	public Set getProjects() {
		return this.projects;
	}

	@SuppressWarnings("unchecked")
	public void setProjects(Set projects) {
		this.projects = projects;
	}

}