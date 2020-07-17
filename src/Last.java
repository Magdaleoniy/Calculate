
public class Last {
	
	String[] Rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
	String[] Arab = {"1","2","3","4","5","6","7","8","9","10"};
	int x1,x2,indicator;

	public void operation(String s1, String s2, int x) {
		
		for (int i = 0; i < 10; i++) {
			if (s1.equals(Rome[i])) {
				x1 = i + 1;
				indicator += 10;
			}
			if (s1.equals(Arab[i])) {
				x1 = i + 1;
				indicator += 1;
			}
			if (s2.equals(Rome[i])) {
				x2 = i + 1;
				indicator += 10;
			}
			if (s2.equals(Arab[i])) {
				x2 = i + 1;
				indicator += 1;
			}
		
		}
		
		if (x == 0) x1 = x1 + x2;
		if (x == 1) x1 = x1 - x2;
		if (x == 2) x1 = x1 * x2;
		if (x == 3) x1 = x1 / x2;
		
		if (indicator == 2) {
			System.out.println("Ответ: " + x1);
		}
		else if (indicator == 20) {
			RomeToArab rta = new RomeToArab();
			System.out.println(rta.convert(x1));
		}
		else System.out.println("throwsError");
		
	}
	
}
