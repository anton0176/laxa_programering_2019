
package v_8;

import java.util.Scanner;

public class gissa_rat {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("v�lj ett tal som �r max p� gissningsspelet");

		int slump = 0; // variabel p� talet som du ska gissa fram. Variabel skappas fr�n Math.random
		int antal = 0; // �r en counter f�r hur m�nga g�nger du har gissat
		int val = 0; // �r variabel f�r det talet du gissar samt andv�nds om du vill b�rja om spelet eller avsluta
		boolean exit = false;
		boolean gissat = false;
		int gissa = 0; // Variabel f�r max talet f�r spelet
		
		
		gissa = input.nextInt(); // max talet f�r v�rdet fr�n input
		slump = 1 + (int)(Math.random() * ((gissa - 1) + 1)); // inputen andv�nds oc h�r skappas ett random v�rde p� gissa

		do {
			System.out.println("Talen �r mellan 1 till " + gissa); 

			while (!gissat) {
				val = input.nextInt(); // N�r andv�ndare gissar ett tal f�r val det v�rdet och koller if och else if och j�mf�r

				if (val < slump) { // om ditt nummer �r mindre �n slump talet s� vissas detta meddelande

					System.out.println("Talet " + val + " �r mindre �n talet X ");
					antal++; // adderar 1 p� antal

				}

				else if (val > slump) { //om ditt nummer �r st�rre �n slump talet s� vissas detta meddelande

					System.out.println("Talet " + val + " �r st�rre �n talet X ");
					antal++;
				}

				else if (val == slump) { // om ditt nummer �r lika med slump talet s� vissas detta medelande och du har klarat spelet
					System.out.println("Du har gissat r�tt det tog " + antal + " g�nger");
					antal++;
					gissat = true; // H�r blir gissat boolean true och aktiverar koden under

				}

			}
			System.out.println("Vill du spela igen. 1: ja    2: nej");
			val = input.nextInt(); // H�r andv�nds val variabel f�r att j�mf�ra if eller else if

			if (val == 1) { // OM variabel blir 1 s� resetas alla variabler och h�r startas spelet om igen och sedan aktiveras koden med if och else if
				gissat = false;
				gissa = 0;
				antal = 0;
				System.out.println("v�lj ett tal som �r max p� gissningsspelet");
				gissa = input.nextInt();
				slump = 1 + (int)(Math.random() * ((gissa - 1) + 1));

			}

			else if (val == 2) { // skrivs tv� blir boolean p� exit true och koden avlslutas och meddelandet vissas
				exit = true;
				System.out.println("Tack f�r att du spela");
			}

		} while (!exit); // h�r avslutas while loopen 

		input.close();

	}
}
