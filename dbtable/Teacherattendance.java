package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Teacherattendance generated by hbm2java
 */
public class Teacherattendance implements java.io.Serializable {

	private Integer attendId;
	private Attendencetype attendencetype;
	private Teacherdetail teacherdetail;
	private Date attendDateAndTime;

	public Teacherattendance() {
	}

	public Teacherattendance(Attendencetype attendencetype, Teacherdetail teacherdetail, Date attendDateAndTime) {
		this.attendencetype = attendencetype;
		this.teacherdetail = teacherdetail;
		this.attendDateAndTime = attendDateAndTime;
	}

	public Integer getAttendId() {
		return this.attendId;
	}

	public void setAttendId(Integer attendId) {
		this.attendId = attendId;
	}

	public Attendencetype getAttendencetype() {
		return this.attendencetype;
	}

	public void setAttendencetype(Attendencetype attendencetype) {
		this.attendencetype = attendencetype;
	}

	public Teacherdetail getTeacherdetail() {
		return this.teacherdetail;
	}

	public void setTeacherdetail(Teacherdetail teacherdetail) {
		this.teacherdetail = teacherdetail;
	}

	public Date getAttendDateAndTime() {
		return this.attendDateAndTime;
	}

	public void setAttendDateAndTime(Date attendDateAndTime) {
		this.attendDateAndTime = attendDateAndTime;
	}

}
