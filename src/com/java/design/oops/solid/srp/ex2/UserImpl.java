package com.java.design.oops.solid.srp.ex2;

public class UserImpl implements IUser {

	/*
	 * Issue with this class is it doing lots of responsibility like - login the
	 * user - registering the user - sending the email - login the error
	 * 
	 * Which is breaking the Single Responsibility Principle. Basically User impl
	 * should not do login or email related stuffs.
	 */

	@Override
	public String login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String register(String userName, String password, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logError(String error) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean sendEmail(String emailContent) {
		// TODO Auto-generated method stub
		return false;
	}

}
