package com.java.design.oops.solid.srp.ex1;

public interface IBankingService {

	public long deposit(long amount, String accountNo);

	public long withDraw(long amount, String accountNo);

	public void getLoanInterestInfo(String loanType);

	public void sendOTP(String medium);

	public void printPassbook();

}
