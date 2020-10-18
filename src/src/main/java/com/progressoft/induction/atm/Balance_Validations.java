package com.progressoft.induction.atm;

import java.math.BigDecimal;

public class Balance_Validations extends User_Detail {

	Boolean CheckUserAccount(String accountNumber) {
		if((this.AccountUserList).contains(accountNumber)) {
			return true;
		}else {

			return false;
		}
	}
	Boolean CheckUserAccountBalance(String accountNumber, BigDecimal amount) {
		int indexOfUser=AccountUserList.indexOf(accountNumber);
		BigDecimal userValue=AccountUserBalance.get(indexOfUser);
		int compareVariable=amount.compareTo(userValue);
		
		if(compareVariable==1) {
			return true;
		}else {
			return false;
		}
	}
	
}

