package com.java.design.oops.solid.singleresposibility.ex2.refactor;

public interface IEmail {
	
	/**
	 * Send the email when login or registration successful
	 */

	String sendEmail(String emailContent);

}
