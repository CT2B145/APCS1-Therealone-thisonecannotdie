
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";
		int notFoundPsn = sample.indexOf("slow");
		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);
		

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		System.out.println(Magpie3.findKeyword("She's my sister", "sister", 0));
		System.out.println(Magpie3.findKeyword("She's my sister", "sister", 0));
		System.out.println(Magpie3.findKeyword("yesterday is today's day before", "day", 0));
		System.out.println(Magpie3.getResponse("I want pie!!","ouch"));
//		System.out.println(Magpie3.findKeyword(", "sister", 0));
		// Try other methods here:

	}

}
