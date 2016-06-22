package com.app;

import java.util.Scanner;

import com.story.Story001;

public class Morrowind {

	public static Scanner SB = new Scanner(System.in);

	public static void main(String[] args) {

		String newGame;

		System.out.println("Welcome to Choose Your Morrowind Adventure!\n");

		do {

			System.out.println("Would you like to start a new game?\n" + "Press (Y/N)");
			newGame = SB.nextLine();

			newGame = Validator.newGame(newGame);

			if ((newGame).equalsIgnoreCase("n")) {
				System.exit(0);
			}

		} while (!(newGame).equalsIgnoreCase("y"));

		System.out.println("\nMORROWIND\n\n");

		Story001.instructions();
		SB.close();

	}

	public void goodbyeUser() {
		System.out.println("Thanks for playing the Morrowind Choose Your Own Adventure Game!");
		System.exit(0);
	}

}
