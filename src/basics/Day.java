package basics;
//switch

public class Day {
	public static void main(String[] args){
		//to choose day base on switch condition
		System.out.println("GitHub Testing");
		String dayofWeek="whatday";
		
		switch(dayofWeek){
		case ("Monday"):System.out.println("it's Monday");
		case ("Tuesday"):System.out.println("it's Tuesday");
		case ("Wednesday"):System.out.println("it's Wednesday");
		break;
		case ("Thursday"):System.out.println("it's Thursday");
		case ("Friday"):System.out.println("it's Friday");
		break;
		case ("Saturday"):System.out.println("it's Saturday");
		default:System.out.println("Sunnyday");
		}
		
	}
}
