package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course implements java.io.Serializable {

	private Integer courseId;
	private String courseName;
	private Integer courseCode;
	private Set examtimetables = new HashSet(0);
	private Set subjectses = new HashSet(0);
	private Set cancelledstudentses = new HashSet(0);
	private Set applicationforadmissions = new HashSet(0);
	private Set studentadmitnfeeses = new HashSet(0);
	private Set studentfeeses = new HashSet(0);
	private Set enrolledstudentses = new HashSet(0);
	private Set studentfeespayments = new HashSet(0);
	private Set coursefeeses = new HashSet(0);
	private Set cancelledstudentses_1 = new HashSet(0);
	private Set enrolledstudentses_1 = new HashSet(0);
	private Set branchs = new HashSet(0);

	public Course() {
	}

	public Course(String courseName, Integer courseCode, Set examtimetables, Set subjectses, Set cancelledstudentses,
			Set applicationforadmissions, Set studentadmitnfeeses, Set studentfeeses, Set enrolledstudentses,
			Set studentfeespayments, Set coursefeeses, Set cancelledstudentses_1, Set enrolledstudentses_1, Set branchs) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.examtimetables = examtimetables;
		this.subjectses = subjectses;
		this.cancelledstudentses = cancelledstudentses;
		this.applicationforadmissions = applicationforadmissions;
		this.studentadmitnfeeses = studentadmitnfeeses;
		this.studentfeeses = studentfeeses;
		this.enrolledstudentses = enrolledstudentses;
		this.studentfeespayments = studentfeespayments;
		this.coursefeeses = coursefeeses;
		this.cancelledstudentses_1 = cancelledstudentses_1;
		this.enrolledstudentses_1 = enrolledstudentses_1;
		this.branchs = branchs;
	}

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseCode() {
		return this.courseCode;
	}

	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}

	public Set getExamtimetables() {
		return this.examtimetables;
	}

	public void setExamtimetables(Set examtimetables) {
		this.examtimetables = examtimetables;
	}

	public Set getSubjectses() {
		return this.subjectses;
	}

	public void setSubjectses(Set subjectses) {
		this.subjectses = subjectses;
	}

	public Set getCancelledstudentses() {
		return this.cancelledstudentses;
	}

	public void setCancelledstudentses(Set cancelledstudentses) {
		this.cancelledstudentses = cancelledstudentses;
	}

	public Set getApplicationforadmissions() {
		return this.applicationforadmissions;
	}

	public void setApplicationforadmissions(Set applicationforadmissions) {
		this.applicationforadmissions = applicationforadmissions;
	}

	public Set getStudentadmitnfeeses() {
		return this.studentadmitnfeeses;
	}

	public void setStudentadmitnfeeses(Set studentadmitnfeeses) {
		this.studentadmitnfeeses = studentadmitnfeeses;
	}

	public Set getStudentfeeses() {
		return this.studentfeeses;
	}

	public void setStudentfeeses(Set studentfeeses) {
		this.studentfeeses = studentfeeses;
	}

	public Set getEnrolledstudentses() {
		return this.enrolledstudentses;
	}

	public void setEnrolledstudentses(Set enrolledstudentses) {
		this.enrolledstudentses = enrolledstudentses;
	}

	public Set getStudentfeespayments() {
		return this.studentfeespayments;
	}

	public void setStudentfeespayments(Set studentfeespayments) {
		this.studentfeespayments = studentfeespayments;
	}

	public Set getCoursefeeses() {
		return this.coursefeeses;
	}

	public void setCoursefeeses(Set coursefeeses) {
		this.coursefeeses = coursefeeses;
	}

	public Set getCancelledstudentses_1() {
		return this.cancelledstudentses_1;
	}

	public void setCancelledstudentses_1(Set cancelledstudentses_1) {
		this.cancelledstudentses_1 = cancelledstudentses_1;
	}

	public Set getEnrolledstudentses_1() {
		return this.enrolledstudentses_1;
	}

	public void setEnrolledstudentses_1(Set enrolledstudentses_1) {
		this.enrolledstudentses_1 = enrolledstudentses_1;
	}

	public Set getBranchs() {
		return this.branchs;
	}

	public void setBranchs(Set branchs) {
		this.branchs = branchs;
	}

}
