package basics.JavaProgram;

public class Assignment16 {

	public static void main(String[] args) {

		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		// 1: Split paragraph into words
		String[] words = paragraph.split("\\s+");

		String targetWord = "Java"; // Word to search
		int count = 0;

		System.out.print("Indexes of '" + targetWord + "': ");

		// Search for occurrences and track indexes
		for (int i = 0; i < words.length; i++) {

			// Remove punctuation like ".", "," from end of word
			String cleanWord = words[i].replaceAll("[^a-zA-Z]", "");

			if (cleanWord.equals(targetWord)) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\nTotal occurrences of '" + targetWord + "': " + count);
	}

}
