package com.pojo;

// Generated 27 Feb, 2017 10:54:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Subject generated by hbm2java
 */
public class Subject implements java.io.Serializable {

	private Integer id;
	private String subjectName;
	private Set examtransactions = new HashSet(0);
	private Set teacherdetails = new HashSet(0);
	private Set timetables = new HashSet(0);
	private Set attendances = new HashSet(0);

	public Subject() {
	}

	public Subject(String subjectName, Set examtransactions,
			Set teacherdetails, Set timetables, Set attendances) {
		this.subjectName = subjectName;
		this.examtransactions = examtransactions;
		this.teacherdetails = teacherdetails;
		this.timetables = timetables;
		this.attendances = attendances;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Set getExamtransactions() {
		return this.examtransactions;
	}

	public void setExamtransactions(Set examtransactions) {
		this.examtransactions = examtransactions;
	}

	public Set getTeacherdetails() {
		return this.teacherdetails;
	}

	public void setTeacherdetails(Set teacherdetails) {
		this.teacherdetails = teacherdetails;
	}

	public Set getTimetables() {
		return this.timetables;
	}

	public void setTimetables(Set timetables) {
		this.timetables = timetables;
	}

	public Set getAttendances() {
		return this.attendances;
	}

	public void setAttendances(Set attendances) {
		this.attendances = attendances;
	}

}
