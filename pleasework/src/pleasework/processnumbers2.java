package pleasework;
import java.util.*;
public class processnumbers2 {
	public static void main (String[] args){
		int max;
		int min;
		int maxEven;
		int sumEven = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("How Many Numbers Are You Going To Enter?");
		int totalNum = userInput.nextInt();
		for (int num = 1; num <= totalNum; num++){
			System.out.println("Please Enter Your Number: ");
			int nextNum = userInput.nextInt();
			max = nextNum;
			min = nextNum;
			if (nextNum > max){
				max = nextNum;
			}
			System.out.println("The Largest Number: " + max);
			if (nextNum < min) {
				min = nextNum;
			}
			System.out.println("The Smallest Number: " + min);
			if (nextNum % 2 == 0){
				maxEven = nextNum;
				sumEven += nextNum;
				if (nextNum > maxEven){
					maxEven = nextNum;
				}
				System.out.println("The Largest Even Number: " + maxEven);
				System.out.println("THe Sum Of All Even Numbers: " + sumEven);
			}
		}
		userInput.close();
	}
}

