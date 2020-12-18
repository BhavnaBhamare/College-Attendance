package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Collegeemployee generated by hbm2java
 */
public class Collegeemployee implements java.io.Serializable {

	private Integer empId;
	private String empName;
	private String empDept;
	private String empAddress;
	private Long empMobNo;
	private Long empMobNo2;
	private Long empPanNumber;
	private String empBankName;
	private String empBankAccNumber;
	private Date empJoinDate;
	private String empSubject;

	public Collegeemployee() {
	}

	public Collegeemployee(String empName, String empDept, String empAddress, Long empMobNo, Long empMobNo2,
			Long empPanNumber, String empBankName, String empBankAccNumber, Date empJoinDate, String empSubject) {
		this.empName = empName;
		this.empDept = empDept;
		this.empAddress = empAddress;
		this.empMobNo = empMobNo;
		this.empMobNo2 = empMobNo2;
		this.empPanNumber = empPanNumber;
		this.empBankName = empBankName;
		this.empBankAccNumber = empBankAccNumber;
		this.empJoinDate = empJoinDate;
		this.empSubject = empSubject;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return this.empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Long getEmpMobNo() {
		return this.empMobNo;
	}

	public void setEmpMobNo(Long empMobNo) {
		this.empMobNo = empMobNo;
	}

	public Long getEmpMobNo2() {
		return this.empMobNo2;
	}

	public void setEmpMobNo2(Long empMobNo2) {
		this.empMobNo2 = empMobNo2;
	}

	public Long getEmpPanNumber() {
		return this.empPanNumber;
	}

	public void setEmpPanNumber(Long empPanNumber) {
		this.empPanNumber = empPanNumber;
	}

	public String getEmpBankName() {
		return this.empBankName;
	}

	public void setEmpBankName(String empBankName) {
		this.empBankName = empBankName;
	}

	public String getEmpBankAccNumber() {
		return this.empBankAccNumber;
	}

	public void setEmpBankAccNumber(String empBankAccNumber) {
		this.empBankAccNumber = empBankAccNumber;
	}

	public Date getEmpJoinDate() {
		return this.empJoinDate;
	}

	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}

	public String getEmpSubject() {
		return this.empSubject;
	}

	public void setEmpSubject(String empSubject) {
		this.empSubject = empSubject;
	}

}