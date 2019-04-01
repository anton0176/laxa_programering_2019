
package v_8;

import java.util.Scanner;

public class gissa_rat {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("välj ett tal som är max på gissningsspelet");

		int slump = 0; // variabel på talet som du ska gissa fram. Variabel skappas från Math.random
		int antal = 0; // är en counter för hur många gånger du har gissat
		int val = 0; // är variabel för det talet du gissar samt andvänds om du vill börja om spelet eller avsluta
		boolean exit = false;
		boolean gissat = false;
		int gissa = 0; // Variabel för max talet för spelet
		
		
		gissa = input.nextInt(); // max talet får värdet från input
		slump = 1 + (int)(Math.random() * ((gissa - 1) + 1)); // inputen andvänds oc här skappas ett random värde på gissa

		do {
			System.out.println("Talen är mellan 1 till " + gissa); 

			while (!gissat) {
				val = input.nextInt(); // När andvändare gissar ett tal får val det värdet och koller if och else if och jämför

				if (val < slump) { // om ditt nummer är mindre än slump talet så vissas detta meddelande

					System.out.println("Talet " + val + " är mindre än talet X ");
					antal++; // adderar 1 på antal

				}

				else if (val > slump) { //om ditt nummer är större än slump talet så vissas detta meddelande

					System.out.println("Talet " + val + " är större än talet X ");
					antal++;
				}

				else if (val == slump) { // om ditt nummer är lika med slump talet så vissas detta medelande och du har klarat spelet
					System.out.println("Du har gissat rätt det tog " + antal + " gånger");
					antal++;
					gissat = true; // Här blir gissat boolean true och aktiverar koden under

				}

			}
			System.out.println("Vill du spela igen. 1: ja    2: nej");
			val = input.nextInt(); // Här andvänds val variabel för att jämföra if eller else if

			if (val == 1) { // OM variabel blir 1 så resetas alla variabler och här startas spelet om igen och sedan aktiveras koden med if och else if
				gissat = false;
				gissa = 0;
				antal = 0;
				System.out.println("välj ett tal som är max på gissningsspelet");
				gissa = input.nextInt();
				slump = 1 + (int)(Math.random() * ((gissa - 1) + 1));

			}

			else if (val == 2) { // skrivs två blir boolean på exit true och koden avlslutas och meddelandet vissas
				exit = true;
				System.out.println("Tack för att du spela");
			}

		} while (!exit); // här avslutas while loopen 

		input.close();

	}
}
