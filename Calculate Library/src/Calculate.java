
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
	
	public static double average (double inputnumber, double otherinput, double inputofinputs){
		double answer;
		double addingtogether;
		addingtogether = inputnumber + otherinput + inputofinputs;
		answer  = addingtogether/2;
		return answer;
	}
	public static double toDegrees(double input) {
		double degrees = input*180/3.14159;
		return degrees;
		
	}public static double toRadians(double input){
	double degrees = input/180*3.14159;
	return degrees;

	
	}public static double discriminant(double a, double b, double c){
		double answerofa = (b*b)-4*a*c;
		return answerofa;
	
	}public static String toImproperFrac(int cookie, int are, int cool){
		
		int addthemup = (cookie*cool)+are;
		int thefraction = addthemup/2;
		String numberAsString = Integer.toString(thefraction);
		return numberAsString;
	
	}public static String MixedNum (int inputter, int inputterrr ){
		int cookie = inputter/inputterrr;
		String number1 = Integer.toString(cookie);
		return number1;
	}public static String foil (int a, int b, int c, String n){
		String foils = a+n+"^2 + "+b+n+" - "+c;
		return foils;
		
	}public static boolean isDivisibleBy( int DivInput, int Divinputt){
		int number = DivInput%Divinputt;
		int number1 = Divinputt%DivInput;
		int newnumb =  number1+number;
		
	if (newnumb  == 0){
		return true;
		}else{
		return false;
		
		}
	
	}

	public static double absValue(double number){
		if(number<0){
		double number1 = number * -1;
		return number1;
	}else{
		return number;
		
		
		}
	}
	public static int max(int Trump, int HRC){	
		if(Trump>HRC){
			System.out.println("Trump is greater!!!");
		return Trump;
		}else{
			System.out.println("Trump is still great, despite he is less!");
			return HRC;
		}
	}
	
	public static boolean max(double Trump, double HRC,double GaryJ){	
		if(Trump>GaryJ && Trump>HRC){
			System.out.println("Trump is greater!!!");
		return true;
		}else if(HRC>GaryJ && Trump>HRC){
			System.out.println("Trump is still great, despite he is less!");
			return true;
		}else if(Trump<GaryJ && GaryJ>HRC){
		System.out.println("America is saved!");
			return true;
			
		}else{
			return false;
		}
		}
		public static boolean min(int Trump, int HRC){	
			if(Trump>HRC){
				System.out.println("Trump is greater!!!");
			return true;
			}else{
				System.out.println("Trump is still great, despite he is less!");
				return false;
			}
		}

		
		}
	

	
		
		