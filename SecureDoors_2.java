package v_12;

import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoors_2 {


public static void main(String[] args) {

		
	Scanner Input = new Scanner(System.in);
int tal= Input.nextInt();
		ArrayList	<String> byggnad = new ArrayList<>();
			boolean exit = false;
		
	
		for (int i = 0; i < tal; i++)
			{
			String minne = Input.next();
			String namn = Input.next();
			
			if (minne.equals("entry"))
				{
				System.out.print(namn + " entered");
				
				if (byggnad.contains(namn))
					System.out.println(" ANOMALY");
				else
					{
					byggnad.add(namn);
					System.out.println();
					}
				
				}
			
			}
}
}
				
			
			
