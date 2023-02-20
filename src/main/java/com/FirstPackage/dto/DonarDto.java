package com.FirstPackage.dto;

public class DonarDto {
	
	private int donarId;
	private String donarName;
	private String donarAddress;
	private String donarEmail;
	private int donarAge;
	private long donarPhno;
	private String donarCity;
	private String donarBloodType;
	private int donarBloodQuantity;
	/**
	 * 
	 */
	public DonarDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param donarId
	 * @param donarName
	 * @param donarAddress
	 * @param donarEmail
	 * @param donarAge
	 * @param donarPhno
	 * @param donarCity
	 * @param donarBloodType
	 * @param donarBloodQuantity
	 */
	public DonarDto(int donarId, String donarName, String donarAddress, String donarEmail, int donarAge, long donarPhno,
			String donarCity, String donarBloodType, int donarBloodQuantity) {
		super();
		this.donarId = donarId;
		this.donarName = donarName;
		this.donarAddress = donarAddress;
		this.donarEmail = donarEmail;
		this.donarAge = donarAge;
		this.donarPhno = donarPhno;
		this.donarCity = donarCity;
		this.donarBloodType = donarBloodType;
		this.donarBloodQuantity = donarBloodQuantity;
	}
	public int getDonarId() {
		return donarId;
	}
	public void setDonarId(int donarId) {
		this.donarId = donarId;
	}
	public String getDonarName() {
		return donarName;
	}
	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}
	public String getDonarAddress() {
		return donarAddress;
	}
	public void setDonarAddress(String donarAddress) {
		this.donarAddress = donarAddress;
	}
	public String getDonarEmail() {
		return donarEmail;
	}
	public void setDonarEmail(String donarEmail) {
		this.donarEmail = donarEmail;
	}
	public int getDonarAge() {
		return donarAge;
	}
	public void setDonarAge(int donarAge) {
		this.donarAge = donarAge;
	}
	public long getDonarPhno() {
		return donarPhno;
	}
	public void setDonarPhno(long donarPhno) {
		this.donarPhno = donarPhno;
	}
	public String getDonarCity() {
		return donarCity;
	}
	public void setDonarCity(String donarCity) {
		this.donarCity = donarCity;
	}
	public String getDonarBloodType() {
		return donarBloodType;
	}
	public void setDonarBloodType(String donarBloodType) {
		this.donarBloodType = donarBloodType;
	}
	public int getDonarBloodQuantity() {
		return donarBloodQuantity;
	}
	public void setDonarBloodQuantity(int donarBloodQuantity) {
		this.donarBloodQuantity = donarBloodQuantity;
	}
	
	

}
