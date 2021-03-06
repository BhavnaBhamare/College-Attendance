package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Semester generated by hbm2java
 */
public class Semester implements java.io.Serializable {

	private Integer semesterId;
	private Integer semester;
	private Set coursefeeses = new HashSet(0);
	private Set studentfeespayments = new HashSet(0);
	private Set studentadmitnfeeses = new HashSet(0);

	public Semester() {
	}

	public Semester(Integer semester, Set coursefeeses, Set studentfeespayments, Set studentadmitnfeeses) {
		this.semester = semester;
		this.coursefeeses = coursefeeses;
		this.studentfeespayments = studentfeespayments;
		this.studentadmitnfeeses = studentadmitnfeeses;
	}

	public Integer getSemesterId() {
		return this.semesterId;
	}

	public void setSemesterId(Integer semesterId) {
		this.semesterId = semesterId;
	}

	public Integer getSemester() {
		return this.semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Set getCoursefeeses() {
		return this.coursefeeses;
	}

	public void setCoursefeeses(Set coursefeeses) {
		this.coursefeeses = coursefeeses;
	}

	public Set getStudentfeespayments() {
		return this.studentfeespayments;
	}

	public void setStudentfeespayments(Set studentfeespayments) {
		this.studentfeespayments = studentfeespayments;
	}

	public Set getStudentadmitnfeeses() {
		return this.studentadmitnfeeses;
	}

	public void setStudentadmitnfeeses(Set studentadmitnfeeses) {
		this.studentadmitnfeeses = studentadmitnfeeses;
	}

}
