package com.beans;

import java.util.List;

public class User {
	private Integer id;
	private String username;
	private String passcode;
	private List<Trade> tradeList;
	
	public User(Integer id, String username, String passcode) {
		super();
		this.id = id;
		this.username = username;
		this.passcode = passcode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passcode=" + passcode + ", tradeList=" + tradeList
				+ "]";
	}	
}
