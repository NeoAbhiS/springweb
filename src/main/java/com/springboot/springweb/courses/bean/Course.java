package com.springboot.springweb.courses.bean;

public class Course {
	
	private long id;
	private String name;
	private String lang;
	public Course(long id, String name, String lang) {
		super();
		this.id = id;
		this.name = name;
		this.lang = lang;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLang() {
		return lang;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", lang=" + lang + "]";
	}
	
}
