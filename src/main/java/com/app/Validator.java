package com.app;

public class Validator {

	public static String newGame(String startGame) {

		startGame = startGame.toLowerCase();

		switch (startGame) {
		case "y":
			startGame = "y";
			break;
		case "n":
			startGame = "n";
			break;
		default:
			System.out.println("Please select only 'y' or 'n'. \n");
			startGame = "wrong";
		}
		
		return startGame;
	}

}
