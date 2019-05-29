package labs;

import java.util.Random;

/*
 * Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
 */
public class Lab2 {

	public static void main(String[] args) {
		
		Student student=new Student("Ali", "5656576587");
		Student student1=new Student("Cho", "5656576507");
		
		student1.enroll("MT");
		student1.enroll("English");
		
		//student1.showCourses();
		//student1.checkBalance();
		student1.pay(900);
		//student1.pay(700);
		System.out.println(student1.toString());
		
		//student1.setUserID();
		
		
	}

}
	
 class Student{
	private String name;
	private String ssn;
	private String email; //automatically create email ID based on name
	private static int id=1000;
	private String userID; //combination of static ID+random 4-digit(1000-9000)+last 4-digit of SSN
	private String phone;
	private String city;
	private String state;
	private static final int courseFee=1500;
	private String course="";
	private double balance;

	
	
	public Student(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
		id++;
		//setUserID();
		//setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setEmail(){
		String address="@udemy.com";
		email=name.toLowerCase()+address;
		System.out.println("Your email is:"+email);
	}
	
	public void setUserID(String userID){
		//combination of static ID+random 4-digit(1000-9000)+last 4-digit of SSN
		Random random=new Random();
		int randomNumber=random.nextInt(9000)+1000;
		userID=id+""+randomNumber+ssn.substring(ssn.length()-4);
		this.userID=userID;
		System.out.println(userID);
		
	}
	
	public void enroll(String course){
		this.course=this.course+"\n"+course;
		balance=balance+courseFee;
	}
	
	public void pay(int amount){
			
		System.out.println("Thank you for your payment of $"+amount );
		balance=balance-amount;
		checkBalance();	
	}
	
	public void checkBalance(){
		
		System.out.println("Your balance is: $"+balance);
	}
	
	@Override
	public String toString(){
		return "[Name:"+name+"]\n[User ID:"+userID+ "]\n[Course:"+course+"]\n[Balance:"+balance+"]";
	}
	
	public void showCourses(){
		
		System.out.println("You are enrolled in this course: "+course);
	}
}
