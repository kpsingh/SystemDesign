package com.java.design.oops.solid.srp.ex2.refactor;

public class LogErrorImpl implements ILogError {

	@Override
	public void logError(String error) {
		
		System.out.println("Error Logged");

	}

}
