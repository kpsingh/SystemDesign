package com.java.design.oops.solid.srp.ex2;

/**
 * 
 * @author Krishna Pratap Singh
 * @date 17 July 2022
 * @desc : This interface consist of the methods which needed for an user
 *       registration purpose.
 *
 */
public interface IUser {

	String login(String userName, String password);

	String register(String userName, String password, String email);

	/**
	 * if any error come during the login then method to log that error
	 */

	void logError(String error);

	/**
	 * Send the email when login or registration successful
	 */

	boolean sendEmail(String emailContent);

}
