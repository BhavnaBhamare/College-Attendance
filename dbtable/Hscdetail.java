package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Hscdetail generated by hbm2java
 */
public class Hscdetail implements java.io.Serializable {

	private Integer hscdetailId;
	private String hscschoolName;
	private String city;
	private String hscseatNumber;
	private Integer passingYear;
	private Double percentage;
	private String board;
	private String educationBackground;
	private Set applicationforadmissions = new HashSet(0);

	public Hscdetail() {
	}

	public Hscdetail(String hscschoolName, String city, String hscseatNumber, Integer passingYear, Double percentage,
			String board, String educationBackground, Set applicationforadmissions) {
		this.hscschoolName = hscschoolName;
		this.city = city;
		this.hscseatNumber = hscseatNumber;
		this.passingYear = passingYear;
		this.percentage = percentage;
		this.board = board;
		this.educationBackground = educationBackground;
		this.applicationforadmissions = applicationforadmissions;
	}

	public Integer getHscdetailId() {
		return this.hscdetailId;
	}

	public void setHscdetailId(Integer hscdetailId) {
		this.hscdetailId = hscdetailId;
	}

	public String getHscschoolName() {
		return this.hscschoolName;
	}

	public void setHscschoolName(String hscschoolName) {
		this.hscschoolName = hscschoolName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHscseatNumber() {
		return this.hscseatNumber;
	}

	public void setHscseatNumber(String hscseatNumber) {
		this.hscseatNumber = hscseatNumber;
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

	public String getBoard() {
		return this.board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getEducationBackground() {
		return this.educationBackground;
	}

	public void setEducationBackground(String educationBackground) {
		this.educationBackground = educationBackground;
	}

	public Set getApplicationforadmissions() {
		return this.applicationforadmissions;
	}

	public void setApplicationforadmissions(Set applicationforadmissions) {
		this.applicationforadmissions = applicationforadmissions;
	}

}
