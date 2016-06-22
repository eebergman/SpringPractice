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

		if (strToCap.length() < 1) {
			strToCap = "a";
			return strToCap;
		}

		String justTheFirstLetter = null;
		String theRestOfTheString = null;
		String niceAndNeat = null;

		justTheFirstLetter = strToCap.substring(0, 1);
		theRestOfTheString = strToCap.substring(1);

		justTheFirstLetter = justTheFirstLetter.toUpperCase();
		niceAndNeat = justTheFirstLetter.concat(theRestOfTheString);

		return niceAndNeat;

	}

	public static int noBetween1And10(int goodNumber) {

		if ((goodNumber >= 1) && (goodNumber <= 10)) {
			return goodNumber;
		}

		return 0;
	}

}
