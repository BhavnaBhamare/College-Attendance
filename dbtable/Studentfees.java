package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Studentfees generated by hbm2java
 */
public class Studentfees implements java.io.Serializable {

	private Integer studentFeesId;
	private Course course;
	private Branch branch;
	private String enrollNumber;
	private Integer currentYear;
	private String semester;
	private Double depositeAmount;
	private Double totalAmount;
	private Double paidFees;
	private Double remainingFees;
	private Date createdDateTime;
	private Date updatedDateTime;
	private Set cancelledstudentses = new HashSet(0);
	private Set cancelledstudentses_1 = new HashSet(0);
	private Set canceledadmissions = new HashSet(0);

	public Studentfees() {
	}

	public Studentfees(Course course, Branch branch, String enrollNumber, Integer currentYear, String semester,
			Double depositeAmount, Double totalAmount, Double paidFees, Double remainingFees, Date createdDateTime,
			Date updatedDateTime, Set cancelledstudentses, Set cancelledstudentses_1, Set canceledadmissions) {
		this.course = course;
		this.branch = branch;
		this.enrollNumber = enrollNumber;
		this.currentYear = currentYear;
		this.semester = semester;
		this.depositeAmount = depositeAmount;
		this.totalAmount = totalAmount;
		this.paidFees = paidFees;
		this.remainingFees = remainingFees;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.cancelledstudentses = cancelledstudentses;
		this.cancelledstudentses_1 = cancelledstudentses_1;
		this.canceledadmissions = canceledadmissions;
	}

	public Integer getStudentFeesId() {
		return this.studentFeesId;
	}

	public void setStudentFeesId(Integer studentFeesId) {
		this.studentFeesId = studentFeesId;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getEnrollNumber() {
		return this.enrollNumber;
	}

	public void setEnrollNumber(String enrollNumber) {
		this.enrollNumber = enrollNumber;
	}

	public Integer getCurrentYear() {
		return this.currentYear;
	}

	public void setCurrentYear(Integer currentYear) {
		this.currentYear = currentYear;
	}

	public String getSemester() {
		return this.semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Double getDepositeAmount() {
		return this.depositeAmount;
	}

	public void setDepositeAmount(Double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	public Double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getPaidFees() {
		return this.paidFees;
	}

	public void setPaidFees(Double paidFees) {
		this.paidFees = paidFees;
	}

	public Double getRemainingFees() {
		return this.remainingFees;
	}

	public void setRemainingFees(Double remainingFees) {
		this.remainingFees = remainingFees;
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

	public Set getCancelledstudentses() {
		return this.cancelledstudentses;
	}

	public void setCancelledstudentses(Set cancelledstudentses) {
		this.cancelledstudentses = cancelledstudentses;
	}

	public Set getCancelledstudentses_1() {
		return this.cancelledstudentses_1;
	}

	public void setCancelledstudentses_1(Set cancelledstudentses_1) {
		this.cancelledstudentses_1 = cancelledstudentses_1;
	}

	public Set getCanceledadmissions() {
		return this.canceledadmissions;
	}

	public void setCanceledadmissions(Set canceledadmissions) {
		this.canceledadmissions = canceledadmissions;
	}

}
