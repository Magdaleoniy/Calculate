import java.util.*;


public class Reader {
	
	public String scan() {
		
		String s;
		
		System.out.println("������� ������:");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();
		return(s);
		
	}
	
}
