package com.beans;

public class User {
	private String Username;
	private String Passcode;
	
	public User(String username, String passcode) {
		super();
		Username = username;
		Passcode = passcode;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPasscode() {
		return Passcode;
	}

	public void setPasscode(String passcode) {
		Passcode = passcode;
	}

	@Override
	public String toString() {
		return "User [Username=" + Username + ", Passcode=" + Passcode + "]";
	}
	
	

}
