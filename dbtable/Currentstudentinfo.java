package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

/**
 * Currentstudentinfo generated by hbm2java
 */
public class Currentstudentinfo implements java.io.Serializable {

	private Integer currentInfoId;
	private Enrolledstudents enrolledstudents;
	private String currentSemester;
	private Integer currentYear;
	private Integer cancelledAdmissionStatus;

	public Currentstudentinfo() {
	}

	public Currentstudentinfo(Enrolledstudents enrolledstudents, String currentSemester, Integer currentYear,
			Integer cancelledAdmissionStatus) {
		this.enrolledstudents = enrolledstudents;
		this.currentSemester = currentSemester;
		this.currentYear = currentYear;
		this.cancelledAdmissionStatus = cancelledAdmissionStatus;
	}

	public Integer getCurrentInfoId() {
		return this.currentInfoId;
	}

	public void setCurrentInfoId(Integer currentInfoId) {
		this.currentInfoId = currentInfoId;
	}

	public Enrolledstudents getEnrolledstudents() {
		return this.enrolledstudents;
	}

	public void setEnrolledstudents(Enrolledstudents enrolledstudents) {
		this.enrolledstudents = enrolledstudents;
	}

	public String getCurrentSemester() {
		return this.currentSemester;
	}

	public void setCurrentSemester(String currentSemester) {
		this.currentSemester = currentSemester;
	}

	public Integer getCurrentYear() {
		return this.currentYear;
	}

	public void setCurrentYear(Integer currentYear) {
		this.currentYear = currentYear;
	}

	public Integer getCancelledAdmissionStatus() {
		return this.cancelledAdmissionStatus;
	}

	public void setCancelledAdmissionStatus(Integer cancelledAdmissionStatus) {
		this.cancelledAdmissionStatus = cancelledAdmissionStatus;
	}

}
