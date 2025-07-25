package basics.JavaProgram;

public class Assignment18 {

	public static boolean isPalindrome(String s) {
		// remove non-alphanumeric characters, convert to lowercase
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int start = 0;
		int end = cleaned.length() - 1;

		while (start < end) {
			if (cleaned.charAt(start) != cleaned.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;

	}

	public static void main(String[] args) {
		// Test 1
		String s1 = "A man, a plan, a canal: Panama";
		System.out.println("Input: " + s1);
		System.out.println("Output: " + isPalindrome(s1)); // true

		// Test 2
		String s2 = "race a car";
		System.out.println("\nInput: " + s2);
		System.out.println("Output: " + isPalindrome(s2)); // false

	}

}
