package com.FirstPackage.dto;

public class PatientDto {
	
	private int patientId;
	private String patientName;
	private long patientPhno;
	private String patientAddress;
	private String patientBloodType;
	private String patientCity;
	/**
	 * 
	 */
	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param patientId
	 * @param patientName
	 * @param patientPhno
	 * @param patientAddress
	 * @param patientBloodType
	 * @param patientCity
	 */
	public PatientDto(int patientId, String patientName, long patientPhno, String patientAddress,
			String patientBloodType, String patientCity) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientPhno = patientPhno;
		this.patientAddress = patientAddress;
		this.patientBloodType = patientBloodType;
		this.patientCity = patientCity;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientPhno() {
		return patientPhno;
	}
	public void setPatientPhno(long patientPhno) {
		this.patientPhno = patientPhno;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientBloodType() {
		return patientBloodType;
	}
	public void setPatientBloodType(String patientBloodType) {
		this.patientBloodType = patientBloodType;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	
	
	

}
