
public class RomeToArab {
	
	String[] Rome = {"I","IV","V","IX","X","XL","L","XC","C"};
	int[] Arab = {1,4,5,9,10,40,50,90,100};
	String s = "";
	
	public String convert(int x) {
		
		for (int i = 8; i>0; i--) {
			if (x/Arab[i] > 0) {
				s+=Rome[i];
				x-=Arab[i]*(x/Arab[i]);
			}
		}
		
		return("Ответ: " + s);
	}
	
}
