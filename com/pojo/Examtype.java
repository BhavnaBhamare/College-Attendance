package com.pojo;

// Generated 27 Feb, 2017 10:54:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Examtype generated by hbm2java
 */
public class Examtype implements java.io.Serializable {

	private Integer examTypeId;
	private String examTypeName;
	private Set examtransactions = new HashSet(0);

	public Examtype() {
	}

	public Examtype(String examTypeName, Set examtransactions) {
		this.examTypeName = examTypeName;
		this.examtransactions = examtransactions;
	}

	public Integer getExamTypeId() {
		return this.examTypeId;
	}

	public void setExamTypeId(Integer examTypeId) {
		this.examTypeId = examTypeId;
	}

	public String getExamTypeName() {
		return this.examTypeName;
	}

	public void setExamTypeName(String examTypeName) {
		this.examTypeName = examTypeName;
	}

	public Set getExamtransactions() {
		return this.examtransactions;
	}

	public void setExamtransactions(Set examtransactions) {
		this.examtransactions = examtransactions;
	}

}