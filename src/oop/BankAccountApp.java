package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account
		//From default constructor
		BankAccount acc1=new BankAccount();
		//acc1.name="DJ";
		acc1.accountNumber="0987654321";
		acc1.balance=9000;
		
		acc1.deposit(5000);
		acc1.withdraw(3000);
		//Encapsulation: public API method
		acc1.setName("Tony Stark");
		acc1.getName();
		System.out.println(acc1.getName());
		acc1.setIC("940304086422");
		System.out.println("IC Number:"+acc1.getIC());
		
		//Polymorphism through overriding of toString from Object class
		System.out.println(acc1.toString());
		acc1.setRate();
		acc1.increaseRate();
	
		
		//Polymorphism through overloading of constructors
		//From second constructor 
		BankAccount acc2=new BankAccount("Checking Account");
		acc2.accountNumber="1234567890";
		
		//From third constructor
		BankAccount acc3=new BankAccount("Saving Account",10000);
		BankAccount acc4=new BankAccount("Saving Account", 10);
		acc3.checkBalance();
		
		
		/*
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		
		//Demo for inheritance
		CDAccount cda1=new CDAccount();
		cda1.balance=3000;
		cda1.name="Juan";
		cda1.accountType="CD Account";
		cda1.accountNumber="90864396";
		cda1.interestRate="3";
		System.out.println(cda1.toString());
		cda1.compound();*/
	}

}
