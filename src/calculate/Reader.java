package calculate;

import java.util.*; 

public class Reader {
	
	String s;
	
	//Классический сканер, ничего такого
	
	public void Scan() {
		System.out.println("Введите операцию: ");
		try (Scanner scn = new Scanner(System.in)) {
			s = scn.nextLine();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//Eclipse ругался на то, что scn может никогда не закрыться, поэтому обернул в try/catch
	}
}
