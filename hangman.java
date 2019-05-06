package hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class hangman {
	public static void guess(String word, int life) {

		char [] filler= new char [word.length()];
		int i=0;
		while (i<word.length()) {
			filler[i]='-';
			if (word.charAt(i)==' ') {
				filler[i]=' ';
				
			}
			i++;
		}
		System.out.println(filler);
		System.out.println("   Life left = " + life);
		
		Scanner s=new Scanner(System.in); // för att läsa karatärer
		
		ArrayList<Character> l=new ArrayList<Character>();
		
		while (life>0) {
			char x=s.next().charAt(0); // karaktärer input från andvändare
			if (l.contains(x)) {
				System.out.println("Already enterd");
				continue; // while loop continues
			}
			l.add(x);
			
			if(word.contains(x+"")) {
				for(int y=0;y<word.length();y++) { //denna loop ska checka alla index 
					if(word.charAt(y)==x) { // karakäter ska bytas till '-'
						filler[y]=x;	// karaktärer
					}
				}
			}
			else {
				life--; // liv minskas om man skriver in fel ord.
			}
			if (word.equals(String.valueOf(filler))) {
				System.out.println(filler);
				System.out.println("you won");
				break;
			}
			System.out.print(filler);
			System.out.println("     Life remaining " + life);
		} 
		if(life==0) {
			System.out.println("you lose");
		}
	}
	
		
		public static void main (String[] args) {
			Scanner z=new Scanner(System.in);
			System.out.println("Type in the hidden word");
		String word = z.next(); // ord som ska gissas
		int life=5; // hur många liv du ska ha 
		guess(word,life);
		
		
	
	}
}
