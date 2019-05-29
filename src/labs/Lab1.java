package labs;

public class Lab1 {
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] arrs={0,1,2,3,4};
		
		System.out.println("Sum of numbers:"+sumArr(arrs));
		System.out.println("Factorial:"+factorial(4));
		System.out.println("Max value:"+findMax(arrs));
		System.out.println("Min value:"+findMin(arrs));
		System.out.println("Avg value:"+findAvg(arrs));
		

	}
	
	//Write a function that takes a value n returns the sum of numbers 1 to n

	static int sumArr(int[] sumOfValue){
		int sum=0;
		for(int y=0;y<sumOfValue.length;y++){
		sum=sum+sumOfValue[y];
		}
		return sum;
	}
	
	//Factorial
	/*Write a function that computes the factorial value
	Definition: n! = n*(n-1)! , where 0! = 1
	1! = 1
	2! = 2 * 1! = 2 * 1
	3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
	4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	Hint: use the recursive method that was used to calculate Fibonnaci number*/
	
	static int factorial(int a){
		
		if(a==0){
			return 1;
		}
		
		else if(a==1){
			return 1;
		}
		return (a*factorial(a-1));
	}
	
	//
	/*Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
	Hint: this should be static functions with a return type of the same data type as the array declaration.*/
	static int findMax(int[] arr){
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
		return max;
	}
		
	static int findMin(int[] minArr){
		int min=minArr[0];
		for(int x=0;x<minArr.length;x++){
		if(minArr[x]<min){
			min=minArr[x];
		}
		}
		return min;
	}
	
	static int findAvg(int[] avgArr){
		int sum=0;
		for(int z=0;z<avgArr.length;z++){
		sum=sum+avgArr[z];
		}
		return (sum/avgArr.length);
	}
		

}
