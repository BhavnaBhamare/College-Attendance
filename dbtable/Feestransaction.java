package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Feestransaction generated by hbm2java
 */
public class Feestransaction implements java.io.Serializable {

	private Integer feesTransactionId;
	private Studentadmitnfees studentadmitnfees;
	private Date dateAndTime;

	public Feestransaction() {
	}

	public Feestransaction(Studentadmitnfees studentadmitnfees, Date dateAndTime) {
		this.studentadmitnfees = studentadmitnfees;
		this.dateAndTime = dateAndTime;
	}

	public Integer getFeesTransactionId() {
		return this.feesTransactionId;
	}

	public void setFeesTransactionId(Integer feesTransactionId) {
		this.feesTransactionId = feesTransactionId;
	}

	public Studentadmitnfees getStudentadmitnfees() {
		return this.studentadmitnfees;
	}

	public void setStudentadmitnfees(Studentadmitnfees studentadmitnfees) {
		this.studentadmitnfees = studentadmitnfees;
	}

	public Date getDateAndTime() {
		return this.dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}