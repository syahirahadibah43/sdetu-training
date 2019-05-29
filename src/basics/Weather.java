package basics;
//if and else if
public class Weather {
	public static void main(String[] args){
		//defining  what to wear based on temperature of the day
		int temperature=65;
		String sunCondition="Overcast";
		
		if((temperature<65) || (sunCondition=="Cloudy")){
			System.out.println("It is a hot day. You can wear short and tank");
		}
		else if((temperature>=80) || (sunCondition=="Cloudy")){
			System.out.println("It's a breezy day. Please wear a flowy clothes");
		}
		else{
			System.out.println("Wear whatever you want.idc");
		}
	}
}
