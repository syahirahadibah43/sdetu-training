package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("RATE");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("INCREASE");
		
	}
	
	public void setTerm(int term){
		System.out.println("The number of term is: "+term+" years");
	}
	
	public void setSchedule(){
		System.out.println("Schedule");
	}

	

}
