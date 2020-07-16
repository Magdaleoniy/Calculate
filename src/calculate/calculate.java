package calculate;

class calculate {
	
	static int x,y,i,Navalny,Sobol,Zhirik = 0; // x ��� ������� �����, y ��� �������, i ��� ��������� �� ���������
	static String[] s_array;
	static String[] arab = {"1","2","3","4","5","6","7","8","9","10"};
	static String[] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
	static String[] operations = {"+", "-", "*","/"}; //������ ��� ������������� ��������
	
	public static void main(String args[]) {
		
		//����� �� ���� ������
		Reader r = new Reader();
		r.Scan();
		
		//��������� � �� ��� ���������: ������ �����, ��������� � ������
		s_array = r.s.split(" ");
		
		//��������� ������� ������ �� ������ ������������ ���� ��������
		if (s_array.length == 3)
			if (op_check(s_array[1]) & (rome_check(s_array[0]) & rome_check(s_array[2]) || arab_check(s_array[0]) & arab_check(s_array[2])) )  {
				
				//Zhirik - ������, ���������, ��� ���������� ������� ���� ������� ��� ���
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
	
	// ��� ������� ����, ��-������, ���������, ��������� �� ������������ ��� ����� � ���� ���������
	// ��-������, ����� �� ���������� ����� � ���������, ��������� �������� Navalny, Sobol � Putin
	
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