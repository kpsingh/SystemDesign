package com.java.design.oops.solid.singleresposibility.ex1.refactor;

public class LoanService implements ILoanService {

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			// do some job
		}
		if (loanType.equals("personalLoan")) {
			// do some job
		}
		if (loanType.equals("car")) {
			// do some job
		}
	}

}
