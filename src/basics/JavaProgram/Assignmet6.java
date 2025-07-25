package basics.JavaProgram;

public class Assignmet6 {

	public static void main(String[] args) {
		
		//Create two arrays for student & Marks
		String[] studentName = {"Suresh", "Mahesh", "Naresh"};
        int[] originalMarks = {75, 80, 82};

        //Add 10 marks to each student manually using assignment operators
        originalMarks[0] += 10; 
        originalMarks[1] += 10; 
        originalMarks[2] += 10;

        // Updated marks of each student
        System.out.println("Updated Marks:");
        System.out.println(studentName[0] + ": " + originalMarks[0]);
        System.out.println(studentName[1] + ": " + originalMarks[1]);
        System.out.println(studentName[2] + ": " + originalMarks[2]);

        //  Calculate average 
        int totalMarks = originalMarks[0] + originalMarks[1] + originalMarks[2];
        double average = totalMarks / 3;

        // Display average
        System.out.println("Average Marks: " + average);

	}

}
