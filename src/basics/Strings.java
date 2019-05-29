package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		bookTitle="Lord of The Rings";
		String wordChoice="Ring";
		
		if (bookTitle.contains(wordChoice)){
			System.out.println("The book contain the words:"+wordChoice);
		}
		
		String browser="Chrome";
		//(browser=="chrome")
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println(browser);
		}
		
		String firstName="Dibs";
		String lastName="Jamal";
		String ICN="940304086433";
		
		System.out.println("There are "+ICN.length()+" digits in your IC");
		
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(1, 3));
		System.out.println(ICN.substring(6));
		
		int[] array={1,2,3};
		System.out.println(min(array));
		System.out.println(max(array));
		System.out.println(avg(array));
		
	}

	//min
	public static int min(int[] x){
	    int min=x[0];
	    
	    for(int a=0;a<x.length;a++){
	        if(x[a]<min){
	            min=x[a];        
	        }
	    }
	    return min;
	}

	//max
	public static int max(int[] y){
	    int max=y[0];

	    for(int b=0;b<y.length;b++){
	        if(y[b]>max){
	            max=y[b];
	        }
	    }
	    return max;
	}

	//avg
	//(sum/arrayLength)
	public static int avg(int[] z){
	    int sum=0;

	    for(int c=0;c<z.length;c++){
	        sum=sum+z[c];
	    }
	    return (sum/z.length);
	}
}
