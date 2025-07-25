package basics.JavaProgram;

public class Assignment15 {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";

		// 1: Count total number of words
		String[] words = sentence.split(" ");
		int wordsCount = words.length;
		System.out.println("Total number of words: " + wordsCount);

		// 2: Print the sentence words in reverse order
		System.out.print("Reversed words: ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			if (i != 0) {
				System.out.print(" ");
			}
		}
		System.out.println();

		// 3.Convert the first character of each word to uppercase and print original sentence

		// Initialize a result string
		String titleCasedSentence = "";

		// Capitalize the first letter of each word and concatenate
		for (String word : words) {
			if (!word.isEmpty()) {
				String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);
				titleCasedSentence += capitalized + " ";
			}
		}
		System.out.println("Captitalize sentence: " + titleCasedSentence.trim());

	}
}
