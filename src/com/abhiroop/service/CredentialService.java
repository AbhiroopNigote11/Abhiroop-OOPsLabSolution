package com.abhiroop.service;

import java.util.Random;

public class CredentialService {
	String passwordChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*+=-<,>.?/";

	public String generatePassword() {
		int n = passwordChars.length();
		Random r = new Random();
		
		String password = "";
		for (int i = 0; i < 8; i++) {
			int index = r.nextInt(n);
			password = password + passwordChars.charAt(index);

		}

		return password;
	}

	public String generateEmailid(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".abhiroop.com";

	}
   public void showcredential(String firstName, String emailid, String password) {
	   System.out.println("Dear "+firstName+" your generated credentials are as follows\r\n"
	   		+ "Email ---> "+emailid
	   		+ "\nPassword --->"+password);
   }
}
