package week04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Coding_Project_week04 {

	public static void main(String[] args) {
		// create an array of int
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// subtract the first value from the last value
		System.out.println(lastLessFirst(ages));
		//Create a new array with 9 values to ensure that the code is dynamic
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93,1000};
		System.out.println(lastLessFirst(ages2));
		//loop through whole array, find the average, print the results
		int sum = 0;
		for (int age:ages) {
			sum = sum + age;
		}
		int average = sum / ages.length;
		System.out.println(average);
		
		//Create an Array of String called names
		String[] names =  {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//loop over the array to calculate the average length of letters per name, print result
		int sum1 = 0;
		ArrayList<Integer> namesLen = new ArrayList<>();
		for (int i = 0; i<names.length; i++) {
			int len = names[i].length();
			namesLen.add(len);
		}for (int num : namesLen ) {
				sum1 = sum1 + num;
			}
		average = sum1/namesLen.size();
		System.out.println(average);
		
		//Access the last element of an array
		System.out.println(ages[ages.length-1]);
		System.out.println(names[names.length-1]);
		//Access the first element
		System.out.println(ages[1]);
		System.out.println(names[1]);
		//Write a loop to find the sum of the name length array and print results
		System.out.println(sum1);
		//Write a method that takes a sting and an int. Make the string print out x times x=int
		System.out.println(wordMultiply("Hello",3));
		//Write a method that takes a first name and last name then returns a full name
		System.out.println(fullName("Hello","Smith"));
		//Write a method that returns true if the sum of all values are greater than 100
		int[] greaterThan = {5, 6, 7};
		System.out.println(greaterThanHundred(greaterThan));
		//write a method that returns the average of an array of doubles. 
		double [] doubleArr = {10, 10, 10, 10};
		double [] doubleArr2 = {20,20,20,20};
		System.out.println(doubleAverage(doubleArr));
		//Write a method that returns true if the average of values in first argument is greater than the average of the second.
		System.out.println(trueIfGreater(doubleArr,doubleArr2));
		//Write a method that will return true if you will return a true if money is greater than 10.5 and it is hot outside
		System.out.println(willBuyDrink(true,12.0));
		//Write a method that solves a problem - books I am smart enough to read
		String[] listOfTitles = {"To Kill a Mockingbird", "1984", "The Great Gatsby", "Pride and Prejudice", "The Catcher in the Rye", "The Lord of the Rings", "The Hunger Games", "Harry Potter and the Sorcerer's Stone", "Brave New World", "The Da Vinci Code", "Moby-Dick", "The Hitchhiker's Guide to the Galaxy", "Fahrenheit 451", "The Alchemist", "The Road"};
		System.out.println(solvesAProblem(listOfTitles));

	
	
		
		

	}
	// A method to subtract the first method from the last
	public static int lastLessFirst(int[] arr) {
		int lastLessFirst = arr[arr.length-1] - arr[0];
		return lastLessFirst;
		
	}
	//A method to multiply a string. 
	public static String wordMultiply(String word, int number) {
		String string = "";
		for (int i = 0; i < number; i++ ) {
			string = string + word;  
		}
		return string;
	}
	//A method to return a full name.
	public static String fullName (String firstName, String lastName) {
		String fullName = firstName + " " +lastName;
		return fullName;
	}
	//A method to return true if the sum of values in an array is greater than 100
	public static boolean greaterThanHundred (int [] arr) {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	
	}
	//A method that takes some doubles in an array and returns the average
	public static double doubleAverage (double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	//A Method that takes a pair of doubles and returns true if the average of the first array is greater than the second
	public static boolean trueIfGreater(double[] arr1, double [] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}
		double average1 = sum1/arr1.length;
		double average2 = sum2/arr2.length;
		if (average1>average2) {
			return true;
		} else {
			return false;
		}
	}
	// A method to determine is you're about to buy a drink
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	
	}
	//books are so long, this method tells me if I am smart enough to read the title, I can't read titles that are longer than 20 characters.
	public static List<String> solvesAProblem (String[] bookTitles) {
		List<String> booksIcanRead = new ArrayList<String>();
		for(int i=0; i < bookTitles.length; i++) {
			if (bookTitles[i].length() <= 15) {
				booksIcanRead.add(bookTitles[i]);
			}
		}
		return booksIcanRead;
	}
	

}
