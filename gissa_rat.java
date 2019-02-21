
package v_8;

import java.util.Scanner;

public class gissa_rat {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Gissa talet mellan 1 till 100");
		
		int slump = 0;
		int antal = 0;
		int val = 0;
		boolean exit = false;
		boolean gissat = false;
		
		
		slump = (int) (Math.random()*10);
		do  {
			
			
			
			while (!gissat){
				val=input.nextInt();
			
		
			if (val<slump){
				
				System.out.println("Ditt tal " + val + " är mindre än talet X ");
				antal ++;
				
			}
			
			else if (val>slump) {
				
				System.out.println("Ditt tal " + val + " är större än talet X ");
				antal ++;
			}
			
			else if (val==slump) {
				System.out.println("Du har gissat rätt det tog " + antal +  " gånger" );
				antal ++;
				gissat = true;
				
			}
			
		}
			System.out.println("vill du spela igen. 1: ja    2: nej");
			val=input.nextInt();
			
			if (val == 1) {
				gissat = false;
				slump = (int) (Math.random()*10);
				System.out.println("Gissa talet mellan 1 till 100");
			}
		
			else if (val == 2) {
				exit = true;
				System.out.println("HEj då ");
			}
			
		}
		while (!exit);
		
	
	}
}
