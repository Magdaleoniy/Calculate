
public class Calculate {
	
	public static void main(String args[]) {
		String s;
		
		Reader r = new Reader();
		s = r.scan();
		
		LineConvert l = new LineConvert();
		l.Convert(s);
		
		Last last = new Last();
		last.operation(l.s1, l.s2, l.op);
		
	}
	
}
