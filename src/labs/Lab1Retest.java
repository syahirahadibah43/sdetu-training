package labs;

public class Lab1Retest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={2,4,6,8,10,12,14,16,18};
		System.out.println("Sum of numbers: "+sumOfArray(array));
		System.out.println("Factorial of numbers: "+factorial(3));
		System.out.println("Find the minimum of arrays: "+findMin(array));
		System.out.println("Find the maximum of arrays: "+findMax(array));
		System.out.println("Find the average of arrays: "+findAvg(array));
		System.out.println("Find the middle index of arrays: "+findMedianIndex(array));

	}

	// 1.Write a function that takes a value n returns the sum of numbers 1 to n
	public static int sumOfArray(int[] numbers){
		int sum=0;
		
		for(int i=0;i<numbers.length;i++){
			sum=sum+numbers[i];
		}
	return sum;	
	}
	
	/* 2.Write a function that computes the factorial value
	Definition: n! = n*(n-1)! , where 0! = 1
	1! = 1
	2! = 2 * 1! = 2 * 1
	3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
	4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	Hint: use the recursive method that was used to calculate Fibonnaci number*/
	
	public static int factorial(int a){
		if(a==0){
			return 0;
		}
		else if(a==1){
			return 1;
		}
		return a*factorial(a-1);
	}
	
	/*3.Write 3 functions that take an array as a parameter and return the 
	 * minimum, average, and maximum values of that array.
	 Hint: this should be static functions with a return type of the same data type as the array declaration.*/
	
	public static int findMin(int[] array){
		//minimum value
		int min=array[0];
		
		for(int x=0;x<array.length;x++){
			if(array[x]<min){
				min=array[x];
			}
		}
		return min;
	}
	
	public static int findMax(int[] maxArray){
		int max=maxArray[0];
		
		for(int y=0;y<maxArray.length;y++){
			if(maxArray[y]>max){
				max=maxArray[y];
			}
		}
		return max;
	}
	
	public static int findAvg(int[] avgArray){
		int sum=0;
		for(int z=0;z<avgArray.length;z++){
			sum=sum+avgArray[z];
		}
		return sum/avgArray.length;
	}
	//to find median index value
	public static int findMedianIndex(int[] midArray){
		int mid=0;
		int midValue=midArray[0];
		for(int i=0;i<midArray.length;i++){
			if((midArray.length)%2!=0){
				mid=(midArray.length+1)/2;
				mid=midArray[i];
				midValue=midArray[i];
			}
			else if((midArray.length)%2==0){
				mid=(midArray.length)/2;
				mid=midArray[i];
				midValue=midArray[i];
			
			}
			
			
		}
		return mid;
	}
	
}
