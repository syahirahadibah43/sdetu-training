package labs;

public class FibonacciApp {

	public static void main(String[] args) {
		/*Fibonacci 
		 * fib(0)=0
		 * fib(1)=1
		 * fib(2)=fib(0)+fib(1)=1
		 * fib(3)=fib(1)+fib(2)=2
		 * fib(4)=fib(2)+fib(3)=3
		 */
		System.out.println(fib(19));
	}
	
	public static int fib(int a){
		
		if(a==0){
			return 0;
		}
		
		else if(a==1){
			return 1;
		}
				
		return fib(a-1)+fib(a-2);
				
	}

}
