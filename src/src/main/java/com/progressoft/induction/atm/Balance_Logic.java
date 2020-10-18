package com.progressoft.induction.atm;

import java.math.BigDecimal;
public class Balance_Logic extends User_Detail implements BankingSystem{

	

	@Override
	public BigDecimal getAccountBalance(String accountNumber) {
		int IndexOfAccount=AccountUserList.indexOf(accountNumber);
				return this.AccountUserBalance.get(IndexOfAccount);
	}

	@Override
	public void debitAccount(String accountNumber, BigDecimal amount) {
		int IndexOfAccount=AccountUserList.indexOf(accountNumber);
			BigDecimal AccoutBalanceAfterSubtraction=(AccountUserBalance.get(IndexOfAccount)).subtract(amount);
			AccountUserBalance.set(IndexOfAccount, AccoutBalanceAfterSubtraction);
	}
}
