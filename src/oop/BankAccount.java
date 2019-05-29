package oop;

public class BankAccount implements IRate {

	//Define variables
	//static belong to the CLASS not the object instance
	//final is our constant >>often static FINAL>>unchangeable 
	//even new value is assigned
	
	
	String accountNumber;
	//static variable
	private static final String routingNumber="06544";
	//instance variable
	private String name;
	private String IC;
	String accountType;
	double balance=0;
	
	//Constructor definitions:unique method
	//1.They are used to defined/setup/instantation
	//2.get called automatically when object is created
	//IMPLICITLY called upon during INSTANTATION
	//3.same name as the class itself
	//in between variable and method
	//has NO return type 
	BankAccount(){
		System.out.println("Bank Account created");
	}
	
	//OVERLOADING=call same method name with different arguments/parameters
	BankAccount(String accountType){
		System.out.println("New account created:"+accountType);
	}
	
	BankAccount(String accountType,double initDeposit){
		System.out.println("Account Type: "+accountType);
		System.out.println("Deposit : RM"+initDeposit);
		//local variable>>define within block such as loop and method
		String msg=null;
		if(initDeposit<1000){
			msg="ERROR: The minimum value of a deposit must at least be RM1000";
		}
		else{
			 msg="Thank you for depositing of RM"+initDeposit;
		}
		System.out.println(msg);
		balance=initDeposit;
	}
	
	//Encapsulation
	//Allow client to define name
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return "Mr. "+name;
	}
		
	public String getIC() {
		return IC;
	}

	public void setIC(String iC) {
		IC = iC;
	}
	
	//Interface method
	public void setRate(){
		System.out.println("SET RATE");
	}
	
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}

	//Defined method
	public void deposit(double amount){
		balance=balance+amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double withdraw){
		balance-=withdraw;
		showActivity("WITHDRAW");
	}
	
	void checkBalance(){
		System.out.println("Your balance is RM "+balance);
	}
	
	//priavte can only be accessed from within the class
	private void showActivity(String activity){
		System.out.println("Your recent activities "+activity);
		System.out.println("YOUR NEW BALANCE IS: "+balance);
	}
	
	void getStatus(){
		
	}
	
	@Override
	public String toString(){
		return "[Name:"+name+". ACCOUNT:"+accountNumber+". Rounting number:" +routingNumber+". Balance:RM"+balance+"]";
	}
}
