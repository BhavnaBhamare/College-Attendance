package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Studentfeespayment generated by hbm2java
 */
public class Studentfeespayment implements java.io.Serializable {

	private Integer feesPaymentId;
	private Semester semester;
	private Course course;
	private Applicationforadmission applicationforadmission;
	private String paymentMode;
	private Date paymentDate;

	public Studentfeespayment() {
	}

	public Studentfeespayment(Semester semester, Course course, Applicationforadmission applicationforadmission,
			String paymentMode, Date paymentDate) {
		this.semester = semester;
		this.course = course;
		this.applicationforadmission = applicationforadmission;
		this.paymentMode = paymentMode;
		this.paymentDate = paymentDate;
	}

	public Integer getFeesPaymentId() {
		return this.feesPaymentId;
	}

	public void setFeesPaymentId(Integer feesPaymentId) {
		this.feesPaymentId = feesPaymentId;
	}

	public Semester getSemester() {
		return this.semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
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

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
