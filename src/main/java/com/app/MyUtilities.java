package com.app;

public class MyUtilities {

	public static String changeToUpper(String changeToUpper) {
		
		String checkedForNumber = isItANumber(changeToUpper);
		
		String nowCapitalized = capitalizing(checkedForNumber);
		
		return nowCapitalized;
	}

	public static String isItANumber(String numberOrNot) {

		try {
			@SuppressWarnings("unused")
			int isItANumber = Integer.parseInt(numberOrNot);
			numberOrNot = "a";
			return numberOrNot;

		} catch (NumberFormatException notANumber) {
			return numberOrNot;
		}
	}
	
	public static String capitalizing(String strToCap) {
		
		strToCap = strToCap.toLowerCase();
		
		String justTheFirstLetter = null;
		String theRestOfTheString = null;
		String niceAndNeat = null;
		
		justTheFirstLetter = strToCap.substring(0, 1);
		theRestOfTheString = strToCap.substring(1);
		
		justTheFirstLetter.toUpperCase();
		niceAndNeat = justTheFirstLetter.concat(theRestOfTheString);
		
		return niceAndNeat;
		
	}

}
