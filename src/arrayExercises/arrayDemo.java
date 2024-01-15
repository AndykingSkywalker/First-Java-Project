package arrayExercises;

public class arrayDemo {
	public static void main(String[] args) {

		int[] numbers = new int[10];

		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;

//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
//		System.out.println(numbers[5]);
//		System.out.println(numbers[6]);
//		System.out.println(numbers[7]);
//		System.out.println(numbers[8]);
//		System.out.println(numbers[9]);

//		for(int i = 0; i < numbers.length; i++ ) {
//            System.out.println("Number: " + i);
//        }
//		
//		for(int i = 0; i < numbers.length; i++ ) {
//			numbers[i] *= 10;
//			System.out.println("Number x 10 = " + numbers[i]);
//		}

		addNumbers();

	}

	public static void addNumbers() {
		int num = 99;
		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
