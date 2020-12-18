package com.pojo;

// Generated 27 Feb, 2017 10:54:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer departmentId;
	private String departmentName;
	private Set teacherdetails = new HashSet(0);

	public Department() {
	}

	public Department(String departmentName, Set teacherdetails) {
		this.departmentName = departmentName;
		this.teacherdetails = teacherdetails;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set getTeacherdetails() {
		return this.teacherdetails;
	}

	public void setTeacherdetails(Set teacherdetails) {
		this.teacherdetails = teacherdetails;
	}

}
