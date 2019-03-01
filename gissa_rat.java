
package v_8;

import java.util.Scanner;

public class gissa_rat {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("välj ett tal som är max på gissningsspelet");

		int slump = 0;
		int antal = 0;
		int val = 0;
		boolean exit = false;
		boolean gissat = false;
		int gissa = 0;
		gissa = input.nextInt();
		slump = 1 + (int)(Math.random() * ((gissa - 1) + 1));

		do {
			System.out.println("Talen är mellan 1 till " + gissa);

			while (!gissat) {
				val = input.nextInt();

				if (val < slump) {

					System.out.println("Talet " + val + " är mindre än talet X ");
					antal++;

				}

				else if (val > slump) {

					System.out.println("Talet " + val + " är större än talet X ");
					antal++;
				}

				else if (val == slump) {
					System.out.println("Du har gissat rätt det tog " + antal + " gånger");
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
				System.out.println("välj ett tal som är max på gissningsspelet");
				gissa = input.nextInt();
				slump = 1 + (int)(Math.random() * ((gissa - 1) + 1));

			}

			else if (val == 2) {
				exit = true;
				System.out.println("Tack för att du spela");
			}

		} while (!exit);

		input.close();

	}
}
