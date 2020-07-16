package calculate;

class calculate {
	
	static int x,y,i,Navalny,Sobol,Zhirik = 0; // x для первого числа, y для второго, i для указателя на опперацию
	static String[] s_array;
	static String[] arab = {"1","2","3","4","5","6","7","8","9","10"};
	static String[] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
	static String[] operations = {"+", "-", "*","/"}; //Массив для распознования операций
	
	public static void main(String args[]) {
		
		//Берем на вход строку
		Reader r = new Reader();
		r.Scan();
		
		//Сортируем её на три эллемента: первое число, опперация и второе
		s_array = r.s.split(" ");
		
		//Проверяем входные данные на точное соответствие всем условиям
		if (s_array.length == 3)
			if (op_check(s_array[1]) & (rome_check(s_array[0]) & rome_check(s_array[2]) || arab_check(s_array[0]) & arab_check(s_array[2])) )  {
				
				//Zhirik - маячок, говорящий, был изначально алфавит цифр римский или нет
				if (Zhirik == 1) {
					RomeToArab rta = new RomeToArab();
					rta.print(x, y, i);
				}
				else {
					if (i == 0) System.out.println(x+y);
					if (i == 1) System.out.println(x-y);
					if (i == 2) System.out.println(x*y);
					if (i == 3) System.out.println(x/y);
				}
				}
			else System.out.println("throws Error");	
		else System.out.println("throws Error");	 
		
	}
	
	// Три функции ниже, во-первых, проверяют, правильно ли пользователь ввёл числа и знак опперации
	// Во-вторых, сразу же определяют числа и опперацию, пользуясь маячками Navalny, Sobol и Putin
	
	public static boolean rome_check(String s){
		Navalny += 1;
		int Putin = 0;
		for(String ss : rome) {
			if (s.equals(ss)) {
				if (Navalny == 1) x = Putin + 1;
				if (Navalny == 2) y = Putin + 1;
				Zhirik = 1;
				return(true);
			}
			Putin += 1;
		}
		return(false);
	}
	
	public static boolean arab_check(String s){
		Sobol += 1;
		int Putin = 0;
		for(String ss : arab) {
			if (s.equals(ss)) {
				if (Sobol == 1) x = Putin + 1;
				if (Sobol == 2) y = Putin + 1;
				return(true);
			}
			Putin += 1;
		}
		return(false);
	}
	
	public static boolean op_check(String s){
		int Putin = 0;
		for(String ss : operations) {
			if (s.equals(ss)) {
				i = Putin;
				return(true);
			}
			Putin += 1;
		}
		return(false);
	}
	
}