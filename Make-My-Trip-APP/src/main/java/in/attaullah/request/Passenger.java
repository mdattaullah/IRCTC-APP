package in.attaullah.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
public class Passenger {
	
	private String firstName;
	private String lastName;
	private Integer trainNo;
	private String mobileNo;
	private Integer age;
	private String gender;
	private String boardingStation;
	private String stationFrom;
	private String stationTo;
	@DateTimeFormat(pattern="DD-MM-YYYY")
	private LocalDate doj;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBoardingStation() {
		return boardingStation;
	}
	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}
	public String getStationFrom() {
		return stationFrom;
	}
	public void setStationFrom(String stationFrom) {
		this.stationFrom = stationFrom;
	}
	public String getStationTo() {
		return stationTo;
	}
	public void setStationTo(String stationTo) {
		this.stationTo = stationTo;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	
	

}
