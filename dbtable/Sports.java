package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

/**
 * Sports generated by hbm2java
 */
public class Sports implements java.io.Serializable {

	private Integer sportsId;
	private Enrolledstudents enrolledstudents;
	private String sportsType;

	public Sports() {
	}

	public Sports(Enrolledstudents enrolledstudents, String sportsType) {
		this.enrolledstudents = enrolledstudents;
		this.sportsType = sportsType;
	}

	public Integer getSportsId() {
		return this.sportsId;
	}

	public void setSportsId(Integer sportsId) {
		this.sportsId = sportsId;
	}

	public Enrolledstudents getEnrolledstudents() {
		return this.enrolledstudents;
	}

	public void setEnrolledstudents(Enrolledstudents enrolledstudents) {
		this.enrolledstudents = enrolledstudents;
	}

	public String getSportsType() {
		return this.sportsType;
	}

	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}

}
