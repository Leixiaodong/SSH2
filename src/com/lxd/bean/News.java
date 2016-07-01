package com.lxd.bean;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
	private String content;
	private String time;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(String title, String content, String time) {
		this.title = title;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}