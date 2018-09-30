package com.beans;

import java.util.List;

public class User {
	private Integer id;
	private String username;
	private String passcode;
	private String userFname;
	private String userLname;
	private String gender;
	private String contact;
	public User(Integer id, String username, String passcode, String userFname, String userLname, String gender,
			String contact) {
		super();
		this.id = id;
		this.username = username;
		this.passcode = passcode;
		this.userFname = userFname;
		this.userLname = userLname;
		this.gender = gender;
		this.contact = contact;
	}
	public User() {
		this.id = 0;
		this.username = "";
		this.passcode = "";
		this.userFname = "";
		this.userLname = "";
		this.gender = "";
		this.contact = "";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passcode=" + passcode + ", userFname=" + userFname
				+ ", userLname=" + userLname + ", gender=" + gender + ", contact=" + contact + "]";
	}
	
}
