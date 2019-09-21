package com.zmex.byteCodeExample.user;

public class User {
	private String userName;
	private int userAge;
	private String userEmail;

	public User(String userName, int userAge, String userEmail) {
		this.userName = userName;
		this.userAge= userAge;
		this.userEmail= userEmail;
	}


	public void setUserName (String userName) {
		this.userName = userName;
	}

	public String getUserName () {
		return userName;
	}

	public void setUserAge (int userAge) {
		this.userAge = userAge;
	}

	public int getUserAge () {
		return userAge;
	}

	public void setUserEmail (String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserEmail () {
		return userEmail;
	}

}