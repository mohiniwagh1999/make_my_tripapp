package com.trip.binding;

public class Passenger {
	
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String source;
	private String destination;
	private Long trainNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Long getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Long trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", dob=" + dob + ", gender=" + gender + ", doj=" + doj + ", source=" + source
				+ ", destination=" + destination + ", trainNum=" + trainNum + "]";
	}
	
	
	

}
