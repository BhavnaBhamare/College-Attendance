package com.pojo;

// Generated 27 Feb, 2017 10:54:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Yeardetail generated by hbm2java
 */
public class Yeardetail implements java.io.Serializable {

	private Integer yearId;
	private Integer year;
	private Set studentdetails = new HashSet(0);

	public Yeardetail() {
	}

	public Yeardetail(Integer year, Set studentdetails) {
		this.year = year;
		this.studentdetails = studentdetails;
	}

	public Integer getYearId() {
		return this.yearId;
	}

	public void setYearId(Integer yearId) {
		this.yearId = yearId;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Set getStudentdetails() {
		return this.studentdetails;
	}

	public void setStudentdetails(Set studentdetails) {
		this.studentdetails = studentdetails;
	}

}
