package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Attendance generated by hbm2java
 */
public class Attendance implements java.io.Serializable {

	private Integer attndId;
	private Teacherdetail teacherdetail;
	private Subject subject;
	private Classdetail classdetail;
	private Studentdetail studentdetail;
	private String attndType;
	private String attndStaus;
	private Date attndDate;

	public Attendance() {
	}

	public Attendance(Teacherdetail teacherdetail, Subject subject, Classdetail classdetail,
			Studentdetail studentdetail, String attndType, String attndStaus, Date attndDate) {
		this.teacherdetail = teacherdetail;
		this.subject = subject;
		this.classdetail = classdetail;
		this.studentdetail = studentdetail;
		this.attndType = attndType;
		this.attndStaus = attndStaus;
		this.attndDate = attndDate;
	}

	public Integer getAttndId() {
		return this.attndId;
	}

	public void setAttndId(Integer attndId) {
		this.attndId = attndId;
	}

	public Teacherdetail getTeacherdetail() {
		return this.teacherdetail;
	}

	public void setTeacherdetail(Teacherdetail teacherdetail) {
		this.teacherdetail = teacherdetail;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Classdetail getClassdetail() {
		return this.classdetail;
	}

	public void setClassdetail(Classdetail classdetail) {
		this.classdetail = classdetail;
	}

	public Studentdetail getStudentdetail() {
		return this.studentdetail;
	}

	public void setStudentdetail(Studentdetail studentdetail) {
		this.studentdetail = studentdetail;
	}

	public String getAttndType() {
		return this.attndType;
	}

	public void setAttndType(String attndType) {
		this.attndType = attndType;
	}

	public String getAttndStaus() {
		return this.attndStaus;
	}

	public void setAttndStaus(String attndStaus) {
		this.attndStaus = attndStaus;
	}

	public Date getAttndDate() {
		return this.attndDate;
	}

	public void setAttndDate(Date attndDate) {
		this.attndDate = attndDate;
	}

}
