
package v_8;

import java.util.Scanner;

public class gissa_rat {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("v�lj ett tal som �r max p� gissningsspelet");

		int slump = 0;
		int antal = 0;
		int val = 0;
		boolean exit = false;
		boolean gissat = false;
		int gissa = 0;
		gissa = input.nextInt();
		slump = 1 + (int)(Math.random() * ((gissa - 1) + 1));

		do {
			System.out.println("Talen �r mellan 1 till " + gissa);

			while (!gissat) {
				val = input.nextInt();

				if (val < slump) {

					System.out.println("Talet " + val + " �r mindre �n talet X ");
					antal++;

				}

				else if (val > slump) {

					System.out.println("Talet " + val + " �r st�rre �n talet X ");
					antal++;
				}

				else if (val == slump) {
					System.out.println("Du har gissat r�tt det tog " + antal + " g�nger");
					antal++;
					gissat = true;

				}

			}
			System.out.println("Vill du spela igen. 1: ja    2: nej");
			val = input.nextInt();

			if (val == 1) {
				gissat = false;
				gissa = 0;
				antal = 0;
				System.out.println("v�lj ett tal som �r max p� gissningsspelet");
				gissa = input.nextInt();
				slump = 1 + (int)(Math.random() * ((gissa - 1) + 1));

			}

			else if (val == 2) {
				exit = true;
				System.out.println("Tack f�r att du spela");
			}

		} while (!exit);

		input.close();

	}
}
