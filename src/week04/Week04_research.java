package week04;

import java.util.Arrays;
import java.util.List;

public class Week04_research {

	public static void main(String[] args) {
		//String = a reference data type that can store character. 
		//Reference data types have access to many useful methods.
		//String Methods**************************************************************
		//indexOF() method
		String x = "Jacob Passmore";
		String y = "Jacob";
		String z = "Passmore";
		
		// pass in a string or character using this indexOf method to find where it begins
		System.out.println("Found Index: " + x.indexOf('a'));
		// We can pass in an int to as a Staring point:
		System.out.println("Found Index: " + x.indexOf('a', 4)); // this will start looking at "b" in Jacob
		// We can look for whole strings as well
		System.out.println("Found Index: " + x.indexOf(y));
		System.out.println("Found Index: " + x.indexOf(z));
		
		//You can use this to find the number of instances of a character in a String 
		System.out.println(howManyInstances(x , "a"));
		
		
		//replace() Replaces an orginal string with new one
		String a = x.replace("c","k");
		System.out.println(x.replace("Pass","Eat"));
		
		//Strip
		String stripExample = "    Jacob Passmore    ";
		System.out.println(stripExample.strip());
		
		//toLowerCase() & toUpperCase
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		
		//ARRAY METHODS
		//.asList() - this takes an array and makes a list, which have advantages such as being mutable
		String [] arr = {"Chicken", "Bacon", "Avocado"};
		
		List<String> list = Arrays.asList(arr);
		for (String s : list) {
			System.out.print(s + ", ");
		}
		//Fill Method - if we don't want the default value(like 0 or null), like we want to start with 100 points in a game
		int [] arr2 = new int[5];
		Arrays.fill(arr2, 100);
		for (int score : arr2) {
			System.out.println(score);
		}
		// copy of method - this can copy an existing array, so that the memory isn't pointing to the original when you manipulate it
		int [] arr3 = Arrays.copyOf(arr2, arr2.length);
		for (int i = 0; i < arr3.length; i++) {
			if (i%2 == 0) {
				arr3[i] = 50;
				System.out.println(arr3[i]);
			}else {
				System.out.println(arr3[i]);
			}
		}
		//Array.equals() This array method allows us to compare arrays -returns a boolean value
		String [] arr4 = Arrays.copyOf(arr,arr.length);
		System.out.println(Arrays.equals(arr, arr4));
		arr4[0] = "pizza";
		System.out.println(Arrays.equals(arr, arr4));
		
		// compare is similar to .equals but compares lexigraphicaly 
		int c = (Arrays.compare(arr,arr4));
		System.out.println(c);
		// It returns an integer that basically tells you a negetive number the second number is first, a zero if they are equal, and a positive number if the first argument is first
		
		
		
	}
	public static int howManyInstances(String string, String target) {
		int index = 0, totalInstances = 0;
		for (int i = 0; i < string.length(); i ++) {
			index = string.indexOf(target, i);
			if (index == 1) {
				totalInstances ++;
			}
		}
		return totalInstances;	
	}

}
