package com.omniriotest.userdetails.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserSelfDetails {
	@Id
	@GeneratedValue
	private int userId;
	@Column(name="name")
	private String username;
	@Column(name="dob")
	private Date dateOfBirth;
	private char gender;
	private String phoneNumber;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public UserSelfDetails(int userId, String username, Date dateOfBirth, char gender, String phoneNumber) {
		super();
		this.userId = userId;
		this.username = username;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	public UserSelfDetails() {
		super();
	}
	@Override
	public String toString() {
		return "UserSelfDetails [userId=" + userId + ", username=" + username + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
