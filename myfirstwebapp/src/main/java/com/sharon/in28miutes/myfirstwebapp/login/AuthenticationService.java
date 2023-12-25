package com.sharon.in28miutes.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Sharon");
		boolean isValidPassword = password.equalsIgnoreCase("Sharon@123");
		return isValidPassword && isValidUserName;
	}

}
