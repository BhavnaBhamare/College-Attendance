package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Messattendence generated by hbm2java
 */
public class Messattendence implements java.io.Serializable {

	private Integer messAttendenceId;
	private Attendencetype attendencetype;
	private Hostelmess hostelmess;
	private Date dateAndTime;

	public Messattendence() {
	}

	public Messattendence(Attendencetype attendencetype, Hostelmess hostelmess, Date dateAndTime) {
		this.attendencetype = attendencetype;
		this.hostelmess = hostelmess;
		this.dateAndTime = dateAndTime;
	}

	public Integer getMessAttendenceId() {
		return this.messAttendenceId;
	}

	public void setMessAttendenceId(Integer messAttendenceId) {
		this.messAttendenceId = messAttendenceId;
	}

	public Attendencetype getAttendencetype() {
		return this.attendencetype;
	}

	public void setAttendencetype(Attendencetype attendencetype) {
		this.attendencetype = attendencetype;
	}

	public Hostelmess getHostelmess() {
		return this.hostelmess;
	}

	public void setHostelmess(Hostelmess hostelmess) {
		this.hostelmess = hostelmess;
	}

	public Date getDateAndTime() {
		return this.dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
