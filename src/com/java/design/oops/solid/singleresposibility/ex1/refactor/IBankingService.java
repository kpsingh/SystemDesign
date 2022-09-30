package com.java.design.oops.solid.singleresposibility.ex1.refactor;

public interface IBankingService {

	public long deposit(long amount, String accountNo);

	public long withDraw(long amount, String accountNo);
}
