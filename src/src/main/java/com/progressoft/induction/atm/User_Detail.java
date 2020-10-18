package com.progressoft.induction.atm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigDecimal;

public class User_Detail {
	
	private String a[]= {"123456789","111111111","222222222","333333333","444444444"};
	private BigDecimal b[]= {new BigDecimal("1000"),new BigDecimal("1000"),new BigDecimal("1000"),new BigDecimal("1000"),new BigDecimal("1000")};

	
	User_Detail(){
		
	}
	private List<String> AccountList=Arrays.asList(a);
	private List<BigDecimal> AccountBalance=Arrays.asList(b);
	
	List<String> AccountUserList=new ArrayList<String>(AccountList);
	List<BigDecimal> AccountUserBalance=new ArrayList<BigDecimal>(AccountBalance);
	
	String getAccountName(String accountNumber){	
		if(AccountUserList.contains(accountNumber)) {
			return AccountUserList.get(AccountUserList.indexOf(accountNumber));
		}else {
			return null;
		}
		
	}
	
	BigDecimal getFinalAccountBalance(String AccountName){
		
		return AccountUserBalance.get(AccountUserList.indexOf(AccountName));
	}
}
 