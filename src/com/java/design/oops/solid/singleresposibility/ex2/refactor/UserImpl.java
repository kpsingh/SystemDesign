package com.java.design.oops.solid.singleresposibility.ex2.refactor;

public class UserImpl implements IUser {

	@Override
	public String login(String userName, String password) {
		
		return "Login Success";
		
	}

	@Override
	public String register(String userName, String password, String email) {

		return "Registation Success";
	}

}
