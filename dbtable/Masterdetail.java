package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Masterdetail generated by hbm2java
 */
public class Masterdetail implements java.io.Serializable {

	private Integer masterDetailId;
	private String collegeName;
	private String collegeCode;
	private Integer zipCode;
	private String city;
	private String university;
	private String enrollmentNumber;
	private Integer passingYear;
	private Double percentage;
	private String masterCourse;
	private Set applicationforadmissions = new HashSet(0);

	public Masterdetail() {
	}

	public Masterdetail(String collegeName, String collegeCode, Integer zipCode, String city, String university,
			String enrollmentNumber, Integer passingYear, Double percentage, String masterCourse,
			Set applicationforadmissions) {
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
		this.zipCode = zipCode;
		this.city = city;
		this.university = university;
		this.enrollmentNumber = enrollmentNumber;
		this.passingYear = passingYear;
		this.percentage = percentage;
		this.masterCourse = masterCourse;
		this.applicationforadmissions = applicationforadmissions;
	}

	public Integer getMasterDetailId() {
		return this.masterDetailId;
	}

	public void setMasterDetailId(Integer masterDetailId) {
		this.masterDetailId = masterDetailId;
	}

	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeCode() {
		return this.collegeCode;
	}

	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}

	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getEnrollmentNumber() {
		return this.enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public Integer getPassingYear() {
		return this.passingYear;
	}

	public void setPassingYear(Integer passingYear) {
		this.passingYear = passingYear;
	}

	public Double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getMasterCourse() {
		return this.masterCourse;
	}

	public void setMasterCourse(String masterCourse) {
		this.masterCourse = masterCourse;
	}

	public Set getApplicationforadmissions() {
		return this.applicationforadmissions;
	}

	public void setApplicationforadmissions(Set applicationforadmissions) {
		this.applicationforadmissions = applicationforadmissions;
	}

}
