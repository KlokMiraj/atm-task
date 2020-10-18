
package com.progressoft.induction.atm;

import com.progressoft.induction.atm.exceptions.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/** ATM TEST
 * @Aurthur	 Miraj Pudasaini
 * @version 1.0.1
 * 
 * This is a simple ATM program that takes accountNumber and The amount to be withdrawn into an interface and return the amount as a cllection of list
 */


public class ATM_Logic extends ATM_Validation implements ATM {
private Balance_Logic newBankingSystem=new Balance_Logic();
private List<Banknote> ListOfNotes= new ArrayList<Banknote>();

/* function withdraw 
 * @params accountNumber as string & Amount as BigDecimal 
 * @returns ListOfNotes as list<banknote>
 * @throws AccountNotFoundException if the user account input is invalid
 *this function validates the accountNumber and amount to be withdrawn and returns the amounts as list of notes availabe on the atm machine 
 */
	@Override
	public List<Banknote> withdraw(String accountNumber, BigDecimal amount) 
			throws AccountNotFoundException,InsufficientFundsException,AccountNotFoundException{
										
		if(AccountUserList.contains(accountNumber)) {
			
			if(CheckUserAccountBalance(accountNumber,amount) || (getFinalAccountBalance(accountNumber).compareTo(BigDecimal.ZERO)==0)) {
				throw new InsufficientFundsException();
			}else {
				if(amount.compareTo(TotalAmount)!=1) {
					newBankingSystem.debitAccount(accountNumber, amount);
					TotalAmount=TotalAmount.subtract(amount);
					ListOfNotesToReturn(amount);
				}else {
					throw new NotEnoughMoneyInATMException();
				}
			}
		}else {
			throw new AccountNotFoundException();
		}
	return ListOfNotes;
	}
	
	/*@function ListOfNotesToReturn sets the initial list of notes that is empty
	 * @params Amount as bigDecimal
	 * @returns void
	 */
	void ListOfNotesToReturn(BigDecimal Amount) {
		Banknote b=Banknote.FIFTY_JOD;
		Banknote c=Banknote.TWENTY_JOD;
		Banknote d=Banknote.FIVE_JOD;
		BigDecimal SumOfAllNotes=ListOfNotes.stream().map(Banknote::getValue).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
		while(SumOfAllNotes.compareTo(Amount)==0) {
			
			ListOfNotes.add(c);
			ListOfNotes.add(d);
			ListOfNotes.add(b);
			
			break;
		}
	}
//	/*@function checkFundUser validates if the useramount is not bigger  the user account already has 
//	 * @returns void
//	 * @params AccountNumber as string && Amount as BigDEcimal 
//	 */
//	void CheckFundUser(String AccountNumber,BigDecimal amount) throws InsufficientFundsException{
//	}
	
	/* @function checkFundAtm validate if the input amount is greater than the amount in atm or not 
	 * @returns void 
	 * @params AccountNumber as String 
	 */
	void  CheckFundATM(String AccountNumber,BigDecimal Amount) throws NotEnoughMoneyInATMException{
		
	}

}
