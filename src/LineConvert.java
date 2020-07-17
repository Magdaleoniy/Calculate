
public class LineConvert {

	String[] pocket;
	char[] operations = {'+','-','*','/'};
	int j,op = -1;
	String s1= "",s2 = "";
	
	public void Convert(String s){
		for (int i = 0; i < 4; i++) {
			if (operations[i] == s.charAt(s.indexOf(" ") + 1)) op = i;
		}
		
		if (op != -1) dopConvert(s);
		
	}
	
	public void dopConvert(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			if (i < s.indexOf(" ")) {
				s1 += s.charAt(i);	
			}
			if (i > s.indexOf(" ") + 2) {
				s2 += s.charAt(i);	
			}
		}
	}
	
}
