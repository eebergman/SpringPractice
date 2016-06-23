package com.app;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Morrowind {

	public static Scanner SB = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			Desktop userDesktop = java.awt.Desktop.getDesktop();
			URI url = new URI("http://localhost:8080/morrowind/index.html");
			userDesktop.browse(url);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		} catch (URISyntaxException ex) {
			ex.printStackTrace();
			System.out.println(ex.getLocalizedMessage());
		}
		
//		
//
//		String newGame;
//
//		System.out.println("Welcome to Choose Your Morrowind Adventure!\n");
//
//		do {
//
//			System.out.println("Would you like to start a new game?\n" + "Press (Y/N)");
//			newGame = SB.nextLine();
//
//			newGame = Validator.newGame(newGame);
//
//			if ((newGame).equalsIgnoreCase("n")) {
//				System.exit(0);
//			}
//
//		} while (!(newGame).equalsIgnoreCase("y"));
//
//		System.out.println("\nMORROWIND\n\n");
//
//		Story001.instructions();
		SB.close();

	}

	public void goodbyeUser() {
		System.out.println("Thanks for playing the Morrowind Choose Your Own Adventure Game!");
		System.exit(0);
	}

}
