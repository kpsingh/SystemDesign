package com.java.design.oops.solid.srp.ex2.refactor;

public interface IUser {

	String login(String userName, String password);

	String register(String userName, String password, String email);
}
