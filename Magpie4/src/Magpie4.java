public class Magpie4 {
	
	/*
	 * Mitchell Pon
	 * 11/22/16
	 * 1*
	 * 
	 * 
	 */
	//Get a default greeting and return a greeting
	public String getGreeting() {
		// standard greeting
		return "Hello, let's talk. It will be a worthy sitdown of nice to harsh words. ";
	}



	public String getResponse(String statement) {
		int psn = findKeyword(statement, "you", 0);
		String response = "";
		
//		int NumInStat = Magpie3.findKeyword(newStatement, keyword, 0);
	// standard negative response
		if (findKeyword(statement,"no") >= 0) {
			return response = "Why so negative? You are a pleb.";
			
	// family members response
		} else if (findKeyword(statement, "mother") >= 0
				||(findKeyword(statement,"father") >= 0
				|| (findKeyword(statement,"sister") >= 0
				|| (findKeyword(statement,"brother") >= 0)))){
			return response = "Tell me more about your family.";
		
		// teachers response
		} else if  ((findKeyword(statement,"Mr. Olson")) >= 0 
				||(findKeyword(statement,"Mr. Paul")) >= 0) { 
					return response = "Arent they great Chemistry Teachers?";
					
		}
		
		// Responses which require transformations
		else if (findKeyword(statement, "I want", 0) >= 0) {
			return response = transformIWantToStatement(statement);
		}
		else if (findKeyword(statement, "agh", 0) >= 0) {
			return response = "Do you need me to phone the police?";
		}
		else if (findKeyword(statement, "!!!", 0) >= 0) {
				return response = "Stop shouting, it increases the chance of a heart attack.";
		}
		else if (findKeyword(statement, "kill", 0) >= 0) {
					return response = "Killing involves a lot of paperwork you know.";
				}
		else if (findKeyword(statement, "taxes", 0) >= 0) {
			return response = "Taxes pay for things, but steal from others (and anger those Second Amendment enthusiests)";
		}
		// political responses
		else if (findKeyword(statement, "hillary", 0) >= 0) {
				return response = "CROOKED HILLARY IS A LIAR!!";
		}else if (findKeyword(statement, "trump", 0) >= 0) {
					return response = "Trump is a fake, phoney, and a fraud.";
		}else if (findKeyword(statement, "gary", 0) >= 0) {
			return response = "This man deserves a cookie and the presidency... Once he knows Aleppo. ";
		}else if (findKeyword(statement, "green", 0) >= 0) {
			return response = "You like Greenpeace? Hypocrite, so called protector of nature...";
		}
		
				

		else if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
				return response = transformYouMeStatement(statement);
			} else if((psn >= 0 && findKeyword(statement, "you", psn) >= 0) ){ 
				return response = ImeStatement(statement);
			}else{
				return response = getRandomResponse();
			}
			
		}


	

	/**
	 * Take a statement with "I want to <something>." and transform it into
	 * "What would it mean to <something>?"
	 * 
	 * @param statement
	 *            the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 * 
	 */
	
	//Why do you [blank] me response (For "I")
	private String ImeStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfMe = findKeyword(statement, "you", 0);
		int psnOfYou = findKeyword(statement, "me", psnOfMe + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe)
				.trim();
		return "Why do you " + restOfStatement + " me?";
	}
	
	
	// Asking for an object response
	private String transformIWantToStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want", 0);
		String restOfStatement = statement.substring(psn + 6).trim();
		return "Would you really be happy if you had " + restOfStatement + " right at this very moment? Think of the children, please!";
	}

	/**
	 * Take a statement with "you <something> me" and transform it into
	 * "What makes you think that I <something> you?"
	 * 
	 * @param statement
	 *            the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 * 
	 * 
	 */
	
	// "Why do you [blank] me? response (emotion, "you")
	private String transformYouMeStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfYou = findKeyword(statement, "you", 0);
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe)
				.trim();
		return "Why do you " + restOfStatement + " me?";
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no").
	 * 
	 * parameter: statement
	 *            the string to search
	 * parameter: goal
	 *            the string to search for
	 * parameter: startPos
	 *            the character of the string to begin the search at
	 * return the index of the first occurrence of goal in statement or -1 if
	 *         it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a word
		while (psn >= 0) {
			// Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've found the word
			if (before.equals(" ") && after.equals(" ")) {
				return psn;
			}
			// The last position didn't work, so let's find the next, if there
			// is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * takes in the string to search
	 * takes in the string to search for
	 * returns the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() { // this if for the random response
		
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}
}