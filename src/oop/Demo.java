package oop;

 class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name+" is walking");
	}
	void eat(){
		System.out.println(email);
	}
	void sleep(){
		System.out.println(name+" is sleeping");
	}
}

public class Demo {

	
	
	public static void main(String[] args) {
		// Person
		//Instantiating an object
		//new keyword;java allocate space for Person variable
		Person person1=new Person();
		
		//Define some properties
		person1.name="John";
		person1.email="john@hotmail.com";
		person1.phone="0190088665";
		
		//Abstraction
		//only use necessary element needed
		person1.eat();
		person1.sleep();
		person1.walk();
		
		Person person2=new Person();
		 person2.name="Sarah";
		 person2.walk();
		
		
		
		/*//Attributes, adjectives, variables,descriptors
		String name="Diba";
		String email="adibah@hotmail.com";
		String phone="0103656634";
				
		//Action,activity,behaviour
		System.out.println(name+" is walking");
		System.out.println(name +" is sleeping");
		
		//Attributes, adjectives, variables,descriptors
		String name2="Haik";
		String email2="haik@hotmail.com";
		String phone2="0103656644";
				
		//Action,activity,behaviour
		System.out.println(name2+" is walking");
		System.out.println(name2 +" is sleeping");
		
		sleep(name2);
		walk(name);
		
		//what about binding attributes and properties together?
	}
	
	//Enhance by adding functions to minimize code
	 static void sleep(String name){
		System.out.println(name+" sleeps");
	}
	 
	 static void walk(String name){
		System.out.println(name+" walks");
	}*/
	}
}


