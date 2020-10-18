package com.progressoft.induction.atm;
import java.math.BigDecimal;
public enum TotalAmountInATM {
	
	TOTAL_AMOUNT(new BigDecimal("2400"));
	
	private final BigDecimal Value;
	
	TotalAmountInATM(BigDecimal Value){
		this.Value=Value;
	}
	
	BigDecimal getValue() {
		return this.Value;
	}
}
