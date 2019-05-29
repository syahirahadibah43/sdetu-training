package basics;
//functionand arguments
public class NumbersCalc {

	
	static void printName(){
		System.out.println("My name is Diba. I'm a software engineer");
	}
	
	static void addNumbers(int numA,int numB){
		int sum=numA+numB;
		System.out.println("The sum of " +numA+ " and " +numB +" is "+sum);
	}
	
	static int multiplyNumbers(int numberA, int numberB){
		int product=numberA*numberB;
		addNumbers(product, product);
		return product;
	}
	
	public static void main(String[] args){
		int A=10;
		int B=20;
	
		System.out.println("Starting program");
		printName();
		addNumbers(A, B);
		//int product=
				System.out.println(multiplyNumbers(A, B));
	}
}
