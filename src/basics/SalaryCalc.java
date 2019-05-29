package basics;
//type and variable
public class SalaryCalc {
	
	public static void main(String[] args){
		
		//declaring a variable
		String career;
		System.out.println("Program starting");
		
		//define a variable
		career="Software Developer";
		System.out.println("My career is: " + career);
		
		double rate=10.50;
		int hoursPerWeek=40;
		int weeksPerYear=52;
		career="Software Engineer";
		
		double salary=rate*hoursPerWeek*weeksPerYear;
		System.out.println("My salary as a "+career+" is $"+salary);
		
		
		//compute annual salary
		//rate*hoursPerWeek*weeksPerYear
		
	}

}
