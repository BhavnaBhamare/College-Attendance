package com.pojo;

// Generated 27 Feb, 2017 10:54:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Teacherdetail generated by hbm2java
 */
public class Teacherdetail implements java.io.Serializable {

	private Integer teacherId;
	private Department department;
	private Subject subject;
	private String tcherFirstName;
	private String tcherMiddleName;
	private String tcherLastName;
	private String tcherEmailId;
	private String tcherPassword;
	private String tcherGender;
	private String tcherPhoneNumber;
	private String tcherPeremanantAddress;
	private String tcherQualification;
	private String tcherPreviousCollegeName;
	private Double tcherSalary;
	private String tcherExperience;
	private Set notices = new HashSet(0);
	private Set assignments = new HashSet(0);
	private Set syllabuses = new HashSet(0);
	private Set examtransactions = new HashSet(0);
	private Set timetables = new HashSet(0);
	private Set attendances = new HashSet(0);

	public Teacherdetail() {
	}

	public Teacherdetail(Department department, Subject subject,
			String tcherFirstName, String tcherMiddleName,
			String tcherLastName, String tcherEmailId, String tcherPassword,
			String tcherGender, String tcherPhoneNumber,
			String tcherPeremanantAddress, String tcherQualification,
			String tcherPreviousCollegeName, Double tcherSalary,
			String tcherExperience, Set notices, Set assignments,
			Set syllabuses, Set examtransactions, Set timetables,
			Set attendances) {
		this.department = department;
		this.subject = subject;
		this.tcherFirstName = tcherFirstName;
		this.tcherMiddleName = tcherMiddleName;
		this.tcherLastName = tcherLastName;
		this.tcherEmailId = tcherEmailId;
		this.tcherPassword = tcherPassword;
		this.tcherGender = tcherGender;
		this.tcherPhoneNumber = tcherPhoneNumber;
		this.tcherPeremanantAddress = tcherPeremanantAddress;
		this.tcherQualification = tcherQualification;
		this.tcherPreviousCollegeName = tcherPreviousCollegeName;
		this.tcherSalary = tcherSalary;
		this.tcherExperience = tcherExperience;
		this.notices = notices;
		this.assignments = assignments;
		this.syllabuses = syllabuses;
		this.examtransactions = examtransactions;
		this.timetables = timetables;
		this.attendances = attendances;
	}

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getTcherFirstName() {
		return this.tcherFirstName;
	}

	public void setTcherFirstName(String tcherFirstName) {
		this.tcherFirstName = tcherFirstName;
	}

	public String getTcherMiddleName() {
		return this.tcherMiddleName;
	}

	public void setTcherMiddleName(String tcherMiddleName) {
		this.tcherMiddleName = tcherMiddleName;
	}

	public String getTcherLastName() {
		return this.tcherLastName;
	}

	public void setTcherLastName(String tcherLastName) {
		this.tcherLastName = tcherLastName;
	}

	public String getTcherEmailId() {
		return this.tcherEmailId;
	}

	public void setTcherEmailId(String tcherEmailId) {
		this.tcherEmailId = tcherEmailId;
	}

	public String getTcherPassword() {
		return this.tcherPassword;
	}

	public void setTcherPassword(String tcherPassword) {
		this.tcherPassword = tcherPassword;
	}

	public String getTcherGender() {
		return this.tcherGender;
	}

	public void setTcherGender(String tcherGender) {
		this.tcherGender = tcherGender;
	}

	public String getTcherPhoneNumber() {
		return this.tcherPhoneNumber;
	}

	public void setTcherPhoneNumber(String tcherPhoneNumber) {
		this.tcherPhoneNumber = tcherPhoneNumber;
	}

	public String getTcherPeremanantAddress() {
		return this.tcherPeremanantAddress;
	}

	public void setTcherPeremanantAddress(String tcherPeremanantAddress) {
		this.tcherPeremanantAddress = tcherPeremanantAddress;
	}

	public String getTcherQualification() {
		return this.tcherQualification;
	}

	public void setTcherQualification(String tcherQualification) {
		this.tcherQualification = tcherQualification;
	}

	public String getTcherPreviousCollegeName() {
		return this.tcherPreviousCollegeName;
	}

	public void setTcherPreviousCollegeName(String tcherPreviousCollegeName) {
		this.tcherPreviousCollegeName = tcherPreviousCollegeName;
	}

	public Double getTcherSalary() {
		return this.tcherSalary;
	}

	public void setTcherSalary(Double tcherSalary) {
		this.tcherSalary = tcherSalary;
	}

	public String getTcherExperience() {
		return this.tcherExperience;
	}

	public void setTcherExperience(String tcherExperience) {
		this.tcherExperience = tcherExperience;
	}

	public Set getNotices() {
		return this.notices;
	}

	public void setNotices(Set notices) {
		this.notices = notices;
	}

	public Set getAssignments() {
		return this.assignments;
	}

	public void setAssignments(Set assignments) {
		this.assignments = assignments;
	}

	public Set getSyllabuses() {
		return this.syllabuses;
	}

	public void setSyllabuses(Set syllabuses) {
		this.syllabuses = syllabuses;
	}

	public Set getExamtransactions() {
		return this.examtransactions;
	}

	public void setExamtransactions(Set examtransactions) {
		this.examtransactions = examtransactions;
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
