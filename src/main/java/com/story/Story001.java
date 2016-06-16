package com.story;

import java.util.Scanner;

public class Story001 {

	private static Scanner SB = new Scanner(System.in);
	@SuppressWarnings("unused")
	private static String ADVANCE = null;

	public static void instructions() {
		System.out.println("Periodically the game will pause to allow you to make a choice or "
				+ "to give you time to read the loaded text. Please press the correct letter(s) offered "
				+ "or enter if there is no choice given.\n");

		System.out.println("Text in square brackets are the names of the person talking to you. \n"
				+ "Text within parentheses is text your character is reading.\n" + "Please press enter to play.");

		story001_A(ADVANCE = SB.nextLine());
	}

	public static void story001_A(String string) {
		System.out.println("Each event is proceeded by Prophecy. \n\tBut without the hero, there is no event. \n\n"
				+ "-Zurin Arctus | the Underking\n");
		ADVANCE = SB.nextLine();

		System.out.println("In the waning years of the Third Era of Tamriel, \n"
				+ "a prisoner born on a certain day to uncertain parents, \n"
				+ "was sent under guard, without explanation, to Morrowind, \n"
				+ "ignorant of the role he was to play in that nation's history...\n");
		ADVANCE = SB.nextLine();

		System.out.println("[Azura]\n" + "They have taken you from the Imperial City's prison, "
				+ "first by carriage, and now by boat. \n" + "To the east, to Morrwind, fear not, for I am watchful. \n"
				+ "\tYou have been choosen");

		ADVANCE = SB.nextLine();

		System.out.println("\n" + "(Many fall, but one remains.)\n");

		charCreation(ADVANCE = SB.nextLine());

	}

	public static void charCreation(String jiub) {

		System.out.println("[Jiub]\n" + "Wake up. \n" + "\t\tWe're here. \n" + "\tWhy are you shaking? \n"
				+ "\t\t    Are you okay? \n" + "Wake up!");

		ADVANCE = SB.nextLine();

		System.out.println("[Jiub]\n" + "What's your name?");

		String charName = SB.nextLine();

		System.out.println("Well, " + charName + " not even last night's storm could wake you. \n"
				+ "I heard them say we've reached Morrowind." + "\n" + "I'm sure they'll let us go. \n"
				+ "Quiet here comes the guard.");

		ADVANCE = SB.nextLine();

		System.out.println("[An Imperial Guard]\n" + "This is where you get off, come with me.");

		ADVANCE = SB.nextLine();

		System.out
				.println("[An Imperial Guard]\n" + "Get yourself up on deck and lets keep this as civil as possible.");

		ADVANCE = SB.nextLine();

		System.out.println("[A Redguard Guard]\n"
				+ "This is where they want you, head down to the dock and they'll show you to the census office.");

		ADVANCE = SB.nextLine();

		System.out.println(
				"[Another Imperial Guard]\n" + "You've finally arrived, but our records don't show from where.\n");

		System.out.println("||Character Creation\n" + "------------------");

		System.out.println("1. Argonian");
	}

}
