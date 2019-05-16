package hangman_2;

import java.util.ArrayList;
import java.util.Scanner;

public class hangman_test {
	
	
	
	public static void guess(String word, int life) {

		char[] filler = new char[word.length()];
		int i = 0;
		while (i < word.length()) { // gör koden nedanför till ordets slut
			filler[i] = '-'; // byter plats på bokstäver till -
			if (word.charAt(i) == ' ') {
				filler[i] = ' '; // om bokstaven har ' ' ha kvar ' '

			}
			i++;
		}
		System.out.println(filler);
		System.out.println("   Life left = " + life); // skriver ut hur många liv som är kvar
		Scanner s = new Scanner(System.in);

		ArrayList<Character> l = new ArrayList<Character>(); // arraylist där det gömda ordet är samt karaktärer

		while (life > 0) {
			char x = s.next().charAt(0); // kontrollerar om den bokstaven du har skrivit in int ehar skrivits in två
											// gånger
			if (l.contains(x)) {
				System.out.println("Already entered");
				continue; // while loop continues
			}
			l.add(x); // lägger till bokstaven

			if (word.contains(x + "")) {
				for (int y = 0; y < word.length(); y++) { // om bokstaven stämmer med någon bokstav i ordet så vissas
															// sedan bokstaven i consolen
					if (word.charAt(y) == x) {
						filler[y] = x;
					}
				}
			} else {
				life--; // liv minskas om man skriver in fel ord.
			}

			if (word.equals(String.valueOf(filler))) { // här är koden som aktiveras om du vinner spelet om word har
														// samma värde som det gömda ordet
				System.out.println("you won");
				System.out.println("The hidden word is " + word);

				break;
			}
			if (life > 0) {

				System.out.print(filler); // om inte hela ordter stämmer med string värdet så oktiveras denna delen då
											// forsätter koden bara och vissar hur många liv som är kvar
				System.out.println("     Life remaining " + life);
				if (life == 6) {
					System.out.println("  +---+ ");
					System.out.println("  |   | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("  ========= ");

				}
				if (life == 5) {
					System.out.println("  +---+ ");
					System.out.println("  |   | ");
					System.out.println("  O   | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("  ========= ");

				}
				if (life == 4) {
					System.out.println("  +---+ ");
					System.out.println("  |   | ");
					System.out.println("  O   | ");
					System.out.println("  |   | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("  ========= ");
				}
				if (life == 3) {
					System.out.println("  +---+ ");
					System.out.println("  |   | ");
					System.out.println("  O   | ");
					System.out.println(" /|   | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("  ========= ");
				}
				if (life == 2) {
					System.out.println("  +---+ ");
					System.out.println("  |   | ");
					System.out.println("  O   | ");
					System.out.println(" /|\\  | ");
					System.out.println("      | ");
					System.out.println("      | ");
					System.out.println("  ========= ");
				}
				if (life == 1) {
					System.out.println("  +---+ ");
					System.out.println("  |   | ");
					System.out.println("  O   | ");
					System.out.println(" /|\\  | ");
					System.out.println(" /    | ");
					System.out.println("      | ");
					System.out.println("  ========= ");

				}

			}
			if (life == 0) {
				System.out.println("you lose"); // om life = 0 så har man förlorat
				System.out.println("The hidden word is " + word);
				System.out.println("  +---+ ");
				System.out.println("  |   | ");
				System.out.println("  O   | ");
				System.out.println(" /|\\  | ");
				System.out.println(" / \\  | ");
				System.out.println("      | ");
				System.out.println("  ========= ");

			}

		}

		if (life == 0) {
			System.out.println("you lose"); // om life = 0 så har man förlorat
			System.out.println("The hidden word is " + word);

		}

		if (life >= 0 || (word.equals(String.valueOf(filler)))) { // denna loopen innerhåller all kod som gör att man
																	// kan börja om och avsluta spelet
			try {
				System.out.println(
						"Do you want to play again typ 1; Do you want to play again with random words type 2; Exit typ 3;");
				Scanner y = new Scanner(System.in);
				int number = y.nextInt();

				if (number == 1) { // samma kod som nedanför
					Scanner x = new Scanner(System.in);
					System.out.println("Type in the hidden word");
					String word2 = x.next(); // ord som ska gissas
					word = word2;
					System.out.println("Enter how many lives the player will have");
					life = 7;
					guess(word, life);
				} else if (number == 3) {
					System.out.println("Good bye");

				}

				else if (number == 2) { // samma kod som nedanför
					
					System.out.println("select difficulty 1= easy 2=medium 3=hard ");
					Scanner z = new Scanner(System.in);
					int number2 = z.nextInt();
					
					if (number2 == 3) {
						String[] Words3 = { "", "hej", "båt", "fisk", "husbil", "dator", "högtalare", };
						int rNumber = 0;
						rNumber = (int) (Math.random() * Words3.length) + 1; // kod som väljer ett ord från array listen
						String secretWord = Words3[rNumber - 1]; // är får secretWord samma värde som ArrayWords
						word = secretWord;
					} else if (number2 == 2) {
						String[] Words2 = { "", "hej", "båt", "fisk", "husbil", "dator", "högtalare", };
						int rNumber = 0;
						rNumber = (int) (Math.random() * Words2.length) + 1; // kod som väljer ett ord från array listen
						String secretWord = Words2[rNumber - 1]; // är får secretWord samma värde som ArrayWords
						word = secretWord;
					} else {
						String[] Words1 = { "", "hej", "båt", "fisk", "husbil", "dator", "högtalare", };
						int rNumber = 0;
						rNumber = (int) (Math.random() * Words1.length) + 1; // kod som väljer ett ord från array listen
						String secretWord = Words1[rNumber - 1]; // är får secretWord samma värde som ArrayWords
						word = secretWord;
					}
					
					
					life = 7;
					guess(word, life);
					
				}
			} catch (Exception e) { // om man har skrivit fel så får man ett meddelande
				System.out.println("Error you did type wrong try again");
			}
		}

	}

	public static void main(String[] args) {
		try {
			Scanner z = new Scanner(System.in);
			System.out.println("Do you want to chose the word type 1; Do you want to use a random word type 2;");
			int number = z.nextInt();

			if (number == 1) {

				System.out.println("Type in the hidden word");
				String word = z.next(); // ord som ska gissas

				int life = 7; // hur många liv spelaren har
				guess(word, life); // skicka iväg värderna till den andra metoden guess
			}

			else if (number == 2) {
				System.out.println("select difficulty 1= easy 2=medium 3=hard ");

				int number2 = z.nextInt();
				String word;
				if (number2 == 3) {
					String[] Words3 = { "", "hej", "båt", "fisk", "husbil", "dator", "högtalare", };
					int rNumber = 0;
					rNumber = (int) (Math.random() * Words3.length) + 1; // kod som väljer ett ord från array listen
					String secretWord = Words3[rNumber - 1]; // är får secretWord samma värde som ArrayWords
					word = secretWord;
				} else if (number2 == 2) {
					String[] Words2 = { "", "hej", "båt", "fisk", "husbil", "dator", "högtalare", };
					int rNumber = 0;
					rNumber = (int) (Math.random() * Words2.length) + 1; // kod som väljer ett ord från array listen
					String secretWord = Words2[rNumber - 1]; // är får secretWord samma värde som ArrayWords
					word = secretWord;
				} else {
					String[] Words1 = { "", "hej", "båt", "fisk", "husbil", "dator", "högtalare", };
					int rNumber = 0;
					rNumber = (int) (Math.random() * Words1.length) + 1; // kod som väljer ett ord från array listen
					String secretWord = Words1[rNumber - 1]; // är får secretWord samma värde som ArrayWords
					word = secretWord;
				}

				int life = 7;
				guess(word, life);
			}
		} 
		catch (Exception e) { // om man skriver in något annat får man ett meddelande om man har skrivt in fel
			System.out.println("Error you did type wrong try again");
		}
	}
}
