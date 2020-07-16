package calculate;

import java.util.*; 

public class Reader {
	
	String s;
	
	// лассический сканер, ничего такого
	
	public void Scan() {
		System.out.println("¬ведите операцию: ");
		Scanner scn = new Scanner(System.in);
		s = scn.nextLine();
	}
}
