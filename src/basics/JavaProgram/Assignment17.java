package basics.JavaProgram;

public class Assignment17 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Move to the next line after each row
			System.out.println();
		}

	}

}
