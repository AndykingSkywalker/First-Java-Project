package variables;

public class App {
public static void main(String[] args) {
	
	boolean b = true;
	byte byt = 105;
	char c = 'a';
	char newChar = 'b';
	short sh = 1000;
	int i = 1_200_000;
	long l = 999_999_999_999L;
	float f = 22.12F;
	double d = 44.45;
	
	System.out.println(b);
	System.out.println(byt);
	System.out.println(c);
	System.out.println(sh);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	
	String firstMessage = "Hello";
	String secondMessage = "World";
	
	String combinedMessage = firstMessage + " " + secondMessage;
	
	System.out.println(combinedMessage);
	
//	b = null;
//	sh = null;
	
	System.out.println(c + newChar);
	
//	int decimalTest = 22.25;
//	
//	System.out.println(decimalTest);
	
}
}
