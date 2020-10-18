package com.progressoft.induction.atm;

import java.math.BigDecimal;
public class ATM_Validation extends Balance_Validations{
	
	BigDecimal TotalAmount=new BigDecimal("2400");
	
	
		Boolean CheckAmountInATM(String accountNumber,BigDecimal amount) {
			if(amount.compareTo(TotalAmount)==-1) {
				return true;
			}else {
			return false;
			}
		}
}
