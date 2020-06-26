package com.faculty.info.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;  

public class FacultyDetails {
	
	private Integer facultyId ;
	
	@NotNull @Pattern(regexp = "^[6-9][0-9]{9}$", message="Enter a valid 10 digit number")  
	private String mobileNumber;
	
	@NotNull @Pattern(regexp = "^(?!.*([A-Za-z])\\1{2})[A-Za-z]+$" , message = "Enter a valid name")
	private String facultyFirstName ; 
	
	@NotNull @Pattern(regexp = "^(?!.*([A-Za-z])\\1{2})[A-Za-z]+$" , message = "Enter a valid name")
	private String facultyLastName;
	
	private String qualification , designation , department;
	private String gender;
	
	@NotNull 
	@Min(value = 25 , message = "must be equal or greater than 25")    
	@Max(value = 60 , message = "must not be greater than 60")
	private int age;
	
	@NotNull
	@NotEmpty
	private String mailId ;
	
	@NotNull
	@NotEmpty
	private String username , password;
	
	@NotNull
	@NotEmpty
	private String numberOfConference;
	
	@NotNull
	@NotEmpty
	private String numberOfPapers;
	
	public FacultyDetails()
	{}
	
	
	public FacultyDetails(String facultyFirstName, String facultyLastName,
			String mobileNumber,  int age ,String gender, String qualification ,String department,  String designation , String numberOfConference, String numberOfPapers , String mailId, String username,
			String password) {

		this.mobileNumber = mobileNumber;
		this.facultyFirstName = facultyFirstName;
		this.facultyLastName = facultyLastName;
		this.qualification = qualification;
		this.department = department;	
		this.designation = designation;
		this.gender = gender;
		this.age = age;
		this.mailId = mailId;
		this.username = username;
		this.password = password;
		this.numberOfConference = numberOfConference;
		this.numberOfPapers = numberOfPapers;
	}

	
	public FacultyDetails(Integer facultyId, String facultyFirstName, String facultyLastName,
			String mobileNumber,  int age ,String gender, String qualification , String department , String designation , String numberOfConference, String numberOfPapers , String mailId, String username,
			String password) {
		this(facultyFirstName ,facultyLastName , mobileNumber , age , gender , qualification , department ,  designation , numberOfConference , numberOfPapers , mailId , username , password );
		this.facultyId = facultyId;
		}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFacultyFirstName() {
		return facultyFirstName;
	}

	@Override
	public String toString() {
		return "FacultyDetails [facultyId=" + facultyId + ", facultyFirstName="
				+ facultyFirstName + ", facultyLastName=" + facultyLastName + ", mobileNumber=" + mobileNumber + ", qualification=" + qualification
				+ ", designation=" + designation + ", gender=" + gender + ", age=" + age + ", mailId=" + mailId
				+ ", username=" + username + ", password=" + password + ", numberOfConference=" + numberOfConference
				+ ", numberOfPapers=" + numberOfPapers + "]";
	}

	public void setFacultyFirstName(String facultyFirstName) {
		this.facultyFirstName = facultyFirstName;
	}

	public String getFacultyLastName() {
		return facultyLastName;
	}

	public void setFacultyLastName(String facultyLastName) {
		this.facultyLastName = facultyLastName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumberOfConference() {
		return numberOfConference;
	}

	public void setNumberOfConference(String numberOfConference) {
		this.numberOfConference = numberOfConference;
	}

	public String getNumberOfPapers() {
		return numberOfPapers;
	}

	public void setNumberOfPapers(String numberOfPapers) {
		this.numberOfPapers = numberOfPapers;
	}
	 
	
	
}
