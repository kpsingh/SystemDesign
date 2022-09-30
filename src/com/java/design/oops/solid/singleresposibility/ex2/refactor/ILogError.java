package com.java.design.oops.solid.singleresposibility.ex2.refactor;

public interface ILogError {
	/**
	 * if any error come during the login then method to log that error
	 */

	void logError(String error);

}
