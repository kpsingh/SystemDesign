package com.java.design.oops.solid.srp.ex2.refactor;

public class EmailImpl implements IEmail{

	@Override
	public String sendEmail(String emailContent) {
		
		return "Email Sent";
	}

}
