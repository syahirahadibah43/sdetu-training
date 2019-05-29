package labs;

import java.util.Random;

public class BankAccountApp {

	public static void main(String[] args) {
	BankAccount acc1=new BankAccount("940304086422",1000);
	BankAccount acc2=new BankAccount("890304086423",3000);
	BankAccount acc3=new BankAccount("890304086424",2300);
	
	acc1.setName("Jim");
	System.out.println(acc1.getName());
	acc1.makeDeposit(4000);
	acc1.payBill(900);
	acc1.accrue();
	acc1.toString();
	System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest{
	//Properties of BankAccount
	//static: increase of instance not the object
	private static int id=1000; //Internal ID
	private String accountNumber; //ID+random 2DigitNumber+first two ICNumber
	private static  final String  routingNumber="09767575756";
	private String name;
	private String icNumber;
	private double balance;
	
	//Constructor
	public BankAccount(String icNumber,double initDeposit){
		//System.out.println("New Account Created");
		balance=initDeposit;
		this.icNumber=icNumber;
		id++;
		setAccountNumber();
	}
	
	private void setAccountNumber(){
		int random=(int)Math.random()*100;
		accountNumber=id +""+ random+icNumber.substring(0,2);
		System.out.println("Your account number is:"+accountNumber);
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void payBill(double amount){
		System.out.println("Paying bill:"+amount);
		balance=balance-amount;
		showBalance();
	}
	
	public void makeDeposit(double amount){
		System.out.println("Make deposit:"+amount);
		balance=balance+amount;
		showBalance();		
	}
	
	public void showBalance(){
		System.out.println("Balance for account no:"+accountNumber+" is "+balance);
	}
	
	public void accrueInterest(){
		
	}
	
	@Override
	public void accrue(){
		balance=balance*(1+rate/100);
		showBalance();
	}
	
	public String toString(){
		return ("Name: "+name+ "[\n[Account Number: " +accountNumber+"]\n"+"[Rounting Number: "+routingNumber+"]\n"+"[Balance: "+balance+"]");
	}
}