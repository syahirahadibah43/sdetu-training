package basics;
//array
public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and define an array
		String[] cities={"KL","JB","KB","Penang"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare and define array size
		/*String[]states=new String[5];
		states[0]="Selangor";
		states[1]="Penang";
		states[1]="WP KL";
		states[3]="Sabah";
		states[4]="Sarawak";
		System.out.println("States:"+states[0]);
		System.out.println("States:"+states[1]);
		System.out.println("States:"+states[2]);
		System.out.println("States:"+states[3]);
		System.out.println("States:"+states[4]);*/
		
		//Declare array
		String[] countries;
		countries=new String[2];
		countries[0]="USA";
		countries[1]="Malaysia";
		System.out.println("Countries:"+countries[0]);
		System.out.println("Countries:"+countries[1]);
		
		System.out.println("*******************");
		
		//Declare and define array size
		String[]states=new String[5];
		states[0]="Selangor";
		states[1]="Penang";
		states[2]="WP KL";
		states[3]="Sabah";
		states[4]="Sarawak";
		//System.out.println("States:"+states[0]);
		//System.out.println("States:"+states[1]);
		//System.out.println("States:"+states[2]);
		//System.out.println("States:"+states[3]);
		//System.out.println("States:"+states[4]);
		
		System.out.println("*******************");
		System.out.println("DO-WHILE LOOP");
		int z=0;
		do{
			System.out.println("do-while:"+states[z]);
			z=z+1;
		}while(z<=4);
		
		System.out.println("*******************");
		System.out.println("WHILE LOOP");
		int x=0;
		boolean stateFound=false;
		
		while(!stateFound){
			String state=states[x];
			System.out.println("States in while loop:"+state);
			if(state=="Sabah"){				
				System.out.println("State Found");
				stateFound=true;
			}
			//statement must be put to avoid non-stop loop
			x++;
		}
		
		
		System.out.println("*******************");
		System.out.println("FOR LOOP");
		//for loop; best for iterating an array
		for(int i=0;i<5;i++){
			System.out.println(states[i]);
		}
		
		System.out.println("****************");
		System.out.println("WHILE retest");
		
		int a=0;
		boolean stateFind=false;
		
		while (!stateFind){
			String negeri=states[a];
			
			if(negeri=="Sarawak"){
				System.out.println("State found: "+negeri);
				stateFind=true;
			}
			a++;
		}
		
		
		System.out.println("****************");
		System.out.println("Testeing");
		
		boolean condition=true;
		 while(condition) {
		 System.out.println("loop");
		 if (condition) {
		 condition=false;
		 }
		 }
		
		
		

	}

}
