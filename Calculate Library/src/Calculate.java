
public class Calculate {

	public static double square(double number) {
		double answer;
		answer = number *number;
		return answer;
	
	}
	
	public static double cube(double number){
		double answer;
		answer = number*number*number;
		return answer;
	}
	
	public static double average (double inputnumber, double otherinput){
		double answer;
		double addingtogether;
		addingtogether = inputnumber + otherinput;
		answer  = addingtogether/2;
		return answer;
	}
}
