package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la=new LoanAccount();
		la.setRate();
		la.increaseRate();
		//la.setTerm(3);
		//la.setSchedule();
		
		//Polymorphism for IRate in LoanAccount
		//it will depend accordingly to what is implemented in LoanAccount
		//Polymorphism changes where we are pointing
		IRate account=new LoanAccount();
		account.increaseRate();
		account.setRate();

	}

}
