package App;

public class Calculator {
public static void main(String[] args) {
	
	System.out.println(add(1,2));
	System.out.println(subtract(10,4));
	System.out.println(multiply(9,12));
	System.out.println(divide(10,4));
	
}
public static int add(int a, int b) {
	return a + b;
}
public static int subtract(int a, int b) {
	return a - b;
}
public static int multiply(int a, int b) {
	return a * b;
}
public static double divide(int a, int b) {
	return a / b;
}

}
