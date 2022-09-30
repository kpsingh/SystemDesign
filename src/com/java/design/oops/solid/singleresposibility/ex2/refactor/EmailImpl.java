package com.java.design.oops.solid.singleresposibility.ex2.refactor;

public class EmailImpl implements IEmail{

	@Override
	public String sendEmail(String emailContent) {
		
		return "Email Sent";
	}

}
