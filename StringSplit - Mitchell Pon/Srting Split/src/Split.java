/*
 * Mitchell Pon
 * APCS 1
 * 11/5/16
 * 
 */




import java.util.Arrays;
import java.util.Scanner;

public class Split 

{

	public static void main(String[] args) 
	{Scanner reader = new Scanner(System.in);
		  // Reading from System.in
		System.out.println("Make a sandwich! Now!");
		String n = reader.nextLine(); // Needs user input to creat the sandwich
//		String formatedString = StringSplit(n).toString()
//	    .replace(",", "")  //remove the commas
//	    .replace("[", "")  //remove the right bracket
//	    .replace("]", "")  //remove the left bracket
//	    .trim();           //remove trailing spaces from partially initialized arrays
//		
		System.out.println("An awesome Zane's " +  (StringSplit(n)  + " sandwich."));
		System.out.println(whatInSandwich(n));
//		System.out.print(StringSplit(n));

	}
		
// Seeing if this is a sandwich
	public static String StringSplit(String incomingSandwich){
		if(incomingSandwich.indexOf("bread")<0||incomingSandwich.indexOf("bread")==incomingSandwich.lastIndexOf("bread"))
			return "Not a sandwich!";
		// needs to be bread
		String madeSandwich=incomingSandwich.substring(incomingSandwich.indexOf("bread"), incomingSandwich.lastIndexOf("bread"));
		String split[] =madeSandwich.split("bread");
		String answer="";
		for(int i=1;i<split.length;i++)
					answer=answer+split[i];
		// one slice of bread aint of sandiwch
		if (answer.trim().length()==0)
			return "What is this? Doughy pizza? Idiots, this is Brookyln and THIS IS NOT A SANDWICH!!";
		return answer;
	}
//==============================================================FAILED CODE GOSH DARN IT V.5==========--====================
//		String[] parts = n1.split("bread");
//		Scanner reader = new Scanner(System.in);
//		while (parts.length < 2){
//			System.out.println("Please make me a sandwich");
//			String n3 = reader.nextLine();
//			String[] parts2 = n3.split("bread");
//			parts = parts2;
//		String part1 = parts[0]; 
//		String part2 = parts[1];
//=========================Failed Code VVVVVV Version .4=======================================================================================
//		int countBread=0;
//		for(int i=0; i<n1.length()-6;i++){
//			if (n1.substring(i,i+4).equals("bread")){
//				countBread+=1;
//			}
//		
//		if(countBread<2){
//				System.out.println("This is not a sandwich");
//				return "Gracias por la sandwich.";
//		}else{
//				System.out.println("This is clearly a great sandwich");
//				return "Gracias por la sandwich.";
//			
//		}
//		}
//		return "It works!";
//		}
//		
//	}
//		String[] parts3 = n1.split("bread");
//		
//	
//		return parts3;
//		
//	}
	
//===================================================================================================================================




// Returning the interior of the sandwich
public static String whatInSandwich(String statement){
 // splits at bread, deletes spaces
        if(statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread") != statement.indexOf("bread"))
        {
            if (statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread", statement.lastIndexOf("bread") - 1) < statement.lastIndexOf("bread") && statement.lastIndexOf("bread", statement.lastIndexOf("bread") - 1) > statement.indexOf("bread"))
            { // Sandwiches cannot have more than two pieces of bread
                return ("YOU ARE SUPPOSED TO USE TWO SLICES OF BREAD! THIS IS NOT NEW \" FREAKING \" YORK!!!");
            }
            else if(statement.indexOf("bread") >= 0 && statement.lastIndexOf("bread") == statement.lastIndexOf("bread"))
            {// when there is bread
               String[] split1 = statement.split("bread");
               String statement2 = split1[1];
               statement2 = statement2.trim();
               String[] split2 = statement2.split(" ");
               return("Materiales en el sandwich" + Arrays.toString(split2));
            }
       }
       else
       {// one piece of bread aint a sandwich in this world
           return("This aint a sandwich");
       }
		return "";
        
   }
}

