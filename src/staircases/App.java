package staircases;

public class App {
	public static void main(String[] args) {
		leftAlignedStaircase(5);
		rightAlignedStaircase(5);
		reverseStaircase(5);
		realisticStaircase(3);

	}

	public static void leftAlignedStaircase(int n) {
		System.out.println("Left Aligned Staircase: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(n - 1) + "#".repeat(i));
		}
	}

	public static void rightAlignedStaircase(int n) {
		System.out.println("Right Aligned Staircase: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(n - i) + "#".repeat(i));
		}
	}

	public static void reverseStaircase(int n) {
		System.out.println("Reverse Staircase: ");
		for (int i = n; i >= 1; i--) {
			System.out.println(" ".repeat(n - 1) + "#".repeat(i));
		}
	}

	public static void realisticStaircase(int n) {
		System.out.println("Realistic Staircase: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(n - 1) + "#".repeat(i * 2));
			System.out.println(" ".repeat(n - 1) + "#".repeat(i * 2));
		}
	}
}
