package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Studentroom generated by hbm2java
 */
public class Studentroom implements java.io.Serializable {

	private Integer studentRoomId;
	private Genderforhostelroom genderforhostelroom;
	private String studentRoomType;
	private Set hostelroomsallots = new HashSet(0);

	public Studentroom() {
	}

	public Studentroom(Genderforhostelroom genderforhostelroom, String studentRoomType, Set hostelroomsallots) {
		this.genderforhostelroom = genderforhostelroom;
		this.studentRoomType = studentRoomType;
		this.hostelroomsallots = hostelroomsallots;
	}

	public Integer getStudentRoomId() {
		return this.studentRoomId;
	}

	public void setStudentRoomId(Integer studentRoomId) {
		this.studentRoomId = studentRoomId;
	}

	public Genderforhostelroom getGenderforhostelroom() {
		return this.genderforhostelroom;
	}

	public void setGenderforhostelroom(Genderforhostelroom genderforhostelroom) {
		this.genderforhostelroom = genderforhostelroom;
	}

	public String getStudentRoomType() {
		return this.studentRoomType;
	}

	public void setStudentRoomType(String studentRoomType) {
		this.studentRoomType = studentRoomType;
	}

	public Set getHostelroomsallots() {
		return this.hostelroomsallots;
	}

	public void setHostelroomsallots(Set hostelroomsallots) {
		this.hostelroomsallots = hostelroomsallots;
	}

}
