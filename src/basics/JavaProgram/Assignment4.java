package basics.JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		/*
		 * 1.Create Lists with area of top 5 largest cities. Print the total area of the
		 * 3rd and 4th cities combined
		 */

		List<Double> cityAreas = new ArrayList<>();

		cityAreas.add(2374.11); // 1st city
		cityAreas.add(2512.8); // 2nd city
		cityAreas.add(9163.34); // 3rd city
		cityAreas.add(7281.00); // 4th city
		cityAreas.add(15473.20); // 5th city

		double totalArea = cityAreas.get(2) + cityAreas.get(3);
		System.out.println("Total area of 3rd & 4th cities :" + totalArea);

		/*
		 * 2.Create a set of the top 10 most visited tourist attractions in the world
		 * and print out all of them and its size.
		 */

		System.out.println("---------------------2nd question-----------------------------------");
		Set<String> attractions = new HashSet<>();

		attractions.add("Taj Mahal");
		attractions.add("Colosseum (Rome, Italy)");
		attractions.add("Great Wall of China (China)");
		attractions.add("Disney World");
		attractions.add("Niagara Falls");
		attractions.add("Eiffel Tower");
		attractions.add("Machu Picchu – Peru");
		attractions.add("Everest Base Camp ");
		attractions.add("Burj Khalifa");
		attractions.add("Louvre Museum");

		// print all attractions
		System.out.println("Total 10 Attractions: " +attractions);
		
		// Print the size
		System.out.println("Total number of attractions  :" + attractions.size());

		/*3. Create an array of 10 numbers (any 10 numbers) and print out the Average
		of 5th and 6th value*/

		System.out.println("-------------------------3rd question-----------------------");
		int[] numbers = { 21, 34, 12, 43, 20, 37, 76, 98, 64, 57 };

		int fifth = numbers[4];
		int sixth = numbers[5];

		float average = fifth + sixth;
		System.out.println("5th Value: " + fifth);
<<<<<<< HEAD
		System.out.println("6th Value: " + sixth);
		System.out.println("Average value of 5th & 6th number:" + average);

		/*
		 * 4.Create a list of the top 5 highest-grossing movies of all time and print
		 * out the third movie on the list
		 */

=======
                System.out.println("6th Value: " + sixth);
		System.out.println("Average value of 5th & 6th number:" +average);
		
		/*4.Create a list of the top 5 highest-grossing movies of all time and print out the third 
		movie on the list*/
		
>>>>>>> aa88cfde8a6b7f7e9cd3c0920fd4e3bc2ae14355
		System.out.println("-----------------------------4th question-------------------------------");
		List<String> movieName = new ArrayList<>();
		movieName.add("Avatar");
		movieName.add("Avengers");
		movieName.add("Titanic");
		movieName.add("Jurassic World");
		movieName.add("The Lion King");

		System.out.println("Thrid movie in the list :" + movieName.get(2));

	}

}
