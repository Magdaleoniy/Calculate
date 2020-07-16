package calculate;

//В этом классе происходит обратный перевод в римский вариант

public class RomeToArab {
	int[] arab = {1, 4, 5, 9, 10, 40, 50, 90, 100};
	String[] rome = {"I","IV","V","IX","X","XL","L","XC","C"};
	
	public String translate(int x) {
		String s = "";
		int y = 0;
		for (int i = 9; i>0; i--) {
			y = x/arab[i-1];
			x -= y*arab[i-1];
			while (y>0) {
				s += rome[i-1];
				y--;
			}
		}
		return(s);
	}
	
	public void print(int x, int y, int i){
		
		if (i == 0) System.out.println(translate(x+y));
		if (i == 1) System.out.println(translate(x-y));
		if (i == 2) System.out.println(translate(x*y));
		if (i == 3) System.out.println(translate(x/y));	
		
	}
}
