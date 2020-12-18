package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Enrolledstudents generated by hbm2java
 */
public class Enrolledstudents implements java.io.Serializable {

	private Integer enrolledId;
	private Course course;
	private Applicationforadmission applicationforadmission;
	private Admissionyear admissionyear;
	private Branch branch;
	private String enrollmentNumber;
	private Date createdDateTime;
	private Date updatedDateTime;
	private Integer semester;
	private Set studentattendances = new HashSet(0);
	private Set canceledrequests = new HashSet(0);
	private Set resultses = new HashSet(0);
	private Set studenttransportfeeses = new HashSet(0);
	private Set dances = new HashSet(0);
	private Set sportses = new HashSet(0);
	private Set transportservicereqs = new HashSet(0);
	private Set musics = new HashSet(0);
	private Set currentstudentinfos = new HashSet(0);
	private Set loginstudentteachers = new HashSet(0);
	private Set canceledadmissions = new HashSet(0);
	private Set canceledrequests_1 = new HashSet(0);
	private Set currentstudentinfos_1 = new HashSet(0);

	public Enrolledstudents() {
	}

	public Enrolledstudents(Course course, Applicationforadmission applicationforadmission,
			Admissionyear admissionyear, Branch branch, String enrollmentNumber, Date createdDateTime,
			Date updatedDateTime, Integer semester, Set studentattendances, Set canceledrequests, Set resultses,
			Set studenttransportfeeses, Set dances, Set sportses, Set transportservicereqs, Set musics,
			Set currentstudentinfos, Set loginstudentteachers, Set canceledadmissions, Set canceledrequests_1,
			Set currentstudentinfos_1) {
		this.course = course;
		this.applicationforadmission = applicationforadmission;
		this.admissionyear = admissionyear;
		this.branch = branch;
		this.enrollmentNumber = enrollmentNumber;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.semester = semester;
		this.studentattendances = studentattendances;
		this.canceledrequests = canceledrequests;
		this.resultses = resultses;
		this.studenttransportfeeses = studenttransportfeeses;
		this.dances = dances;
		this.sportses = sportses;
		this.transportservicereqs = transportservicereqs;
		this.musics = musics;
		this.currentstudentinfos = currentstudentinfos;
		this.loginstudentteachers = loginstudentteachers;
		this.canceledadmissions = canceledadmissions;
		this.canceledrequests_1 = canceledrequests_1;
		this.currentstudentinfos_1 = currentstudentinfos_1;
	}

	public Integer getEnrolledId() {
		return this.enrolledId;
	}

	public void setEnrolledId(Integer enrolledId) {
		this.enrolledId = enrolledId;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Applicationforadmission getApplicationforadmission() {
		return this.applicationforadmission;
	}

	public void setApplicationforadmission(Applicationforadmission applicationforadmission) {
		this.applicationforadmission = applicationforadmission;
	}

	public Admissionyear getAdmissionyear() {
		return this.admissionyear;
	}

	public void setAdmissionyear(Admissionyear admissionyear) {
		this.admissionyear = admissionyear;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getEnrollmentNumber() {
		return this.enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Date getUpdatedDateTime() {
		return this.updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public Integer getSemester() {
		return this.semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Set getStudentattendances() {
		return this.studentattendances;
	}

	public void setStudentattendances(Set studentattendances) {
		this.studentattendances = studentattendances;
	}

	public Set getCanceledrequests() {
		return this.canceledrequests;
	}

	public void setCanceledrequests(Set canceledrequests) {
		this.canceledrequests = canceledrequests;
	}

	public Set getResultses() {
		return this.resultses;
	}

	public void setResultses(Set resultses) {
		this.resultses = resultses;
	}

	public Set getStudenttransportfeeses() {
		return this.studenttransportfeeses;
	}

	public void setStudenttransportfeeses(Set studenttransportfeeses) {
		this.studenttransportfeeses = studenttransportfeeses;
	}

	public Set getDances() {
		return this.dances;
	}

	public void setDances(Set dances) {
		this.dances = dances;
	}

	public Set getSportses() {
		return this.sportses;
	}

	public void setSportses(Set sportses) {
		this.sportses = sportses;
	}

	public Set getTransportservicereqs() {
		return this.transportservicereqs;
	}

	public void setTransportservicereqs(Set transportservicereqs) {
		this.transportservicereqs = transportservicereqs;
	}

	public Set getMusics() {
		return this.musics;
	}

	public void setMusics(Set musics) {
		this.musics = musics;
	}

	public Set getCurrentstudentinfos() {
		return this.currentstudentinfos;
	}

	public void setCurrentstudentinfos(Set currentstudentinfos) {
		this.currentstudentinfos = currentstudentinfos;
	}

	public Set getLoginstudentteachers() {
		return this.loginstudentteachers;
	}

	public void setLoginstudentteachers(Set loginstudentteachers) {
		this.loginstudentteachers = loginstudentteachers;
	}

	public Set getCanceledadmissions() {
		return this.canceledadmissions;
	}

	public void setCanceledadmissions(Set canceledadmissions) {
		this.canceledadmissions = canceledadmissions;
	}

	public Set getCanceledrequests_1() {
		return this.canceledrequests_1;
	}

	public void setCanceledrequests_1(Set canceledrequests_1) {
		this.canceledrequests_1 = canceledrequests_1;
	}

	public Set getCurrentstudentinfos_1() {
		return this.currentstudentinfos_1;
	}

	public void setCurrentstudentinfos_1(Set currentstudentinfos_1) {
		this.currentstudentinfos_1 = currentstudentinfos_1;
	}

}
