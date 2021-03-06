package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Busdriver generated by hbm2java
 */
public class Busdriver implements java.io.Serializable {

	private Integer busDriverId;
	private String driverName;
	private String driverAddress;
	private Long driverContactNum;
	private String driverEmailId;
	private Date driverDateOfBirth;
	private Integer driverAge;
	private Long driverLicenceNumber;
	private String driverLicenceType;
	private Date licenceApprovalDate;
	private Date licenceExpiryDate;
	private byte[] driverPhoto;
	private Set busdetailses = new HashSet(0);

	public Busdriver() {
	}

	public Busdriver(String driverName, String driverAddress, Long driverContactNum, String driverEmailId,
			Date driverDateOfBirth, Integer driverAge, Long driverLicenceNumber, String driverLicenceType,
			Date licenceApprovalDate, Date licenceExpiryDate, byte[] driverPhoto, Set busdetailses) {
		this.driverName = driverName;
		this.driverAddress = driverAddress;
		this.driverContactNum = driverContactNum;
		this.driverEmailId = driverEmailId;
		this.driverDateOfBirth = driverDateOfBirth;
		this.driverAge = driverAge;
		this.driverLicenceNumber = driverLicenceNumber;
		this.driverLicenceType = driverLicenceType;
		this.licenceApprovalDate = licenceApprovalDate;
		this.licenceExpiryDate = licenceExpiryDate;
		this.driverPhoto = driverPhoto;
		this.busdetailses = busdetailses;
	}

	public Integer getBusDriverId() {
		return this.busDriverId;
	}

	public void setBusDriverId(Integer busDriverId) {
		this.busDriverId = busDriverId;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverAddress() {
		return this.driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}

	public Long getDriverContactNum() {
		return this.driverContactNum;
	}

	public void setDriverContactNum(Long driverContactNum) {
		this.driverContactNum = driverContactNum;
	}

	public String getDriverEmailId() {
		return this.driverEmailId;
	}

	public void setDriverEmailId(String driverEmailId) {
		this.driverEmailId = driverEmailId;
	}

	public Date getDriverDateOfBirth() {
		return this.driverDateOfBirth;
	}

	public void setDriverDateOfBirth(Date driverDateOfBirth) {
		this.driverDateOfBirth = driverDateOfBirth;
	}

	public Integer getDriverAge() {
		return this.driverAge;
	}

	public void setDriverAge(Integer driverAge) {
		this.driverAge = driverAge;
	}

	public Long getDriverLicenceNumber() {
		return this.driverLicenceNumber;
	}

	public void setDriverLicenceNumber(Long driverLicenceNumber) {
		this.driverLicenceNumber = driverLicenceNumber;
	}

	public String getDriverLicenceType() {
		return this.driverLicenceType;
	}

	public void setDriverLicenceType(String driverLicenceType) {
		this.driverLicenceType = driverLicenceType;
	}

	public Date getLicenceApprovalDate() {
		return this.licenceApprovalDate;
	}

	public void setLicenceApprovalDate(Date licenceApprovalDate) {
		this.licenceApprovalDate = licenceApprovalDate;
	}

	public Date getLicenceExpiryDate() {
		return this.licenceExpiryDate;
	}

	public void setLicenceExpiryDate(Date licenceExpiryDate) {
		this.licenceExpiryDate = licenceExpiryDate;
	}

	public byte[] getDriverPhoto() {
		return this.driverPhoto;
	}

	public void setDriverPhoto(byte[] driverPhoto) {
		this.driverPhoto = driverPhoto;
	}

	public Set getBusdetailses() {
		return this.busdetailses;
	}

	public void setBusdetailses(Set busdetailses) {
		this.busdetailses = busdetailses;
	}

}
