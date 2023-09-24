package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week04_labs01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
		//System.out.println(printOutNumbers("-",9));
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("apple");
		listOfString.add("abs");
		listOfString.add("candy");
		listOfString.add("echo");
		listOfString.add("foxtrot");
		
		//System.out.println(listOfString);

				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
		//System.out.println(returnShortestString(listOfString));
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
		//System.out.println(switchValues(listOfString));

				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		//System.out.println(withAComma(listOfString));
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
		//System.out.println(searchAList(listOfString, "c"));
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers = new ArrayList<Integer>();
				for (int i = 0; i <= 20; i++) {
					numbers.add(i);
				}
				
		//System.out.println(sortDividibleNumbers(numbers));
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string


		//System.out.println(lengthOfStrings(listOfString));	
				// 9. Create a set of strings and add 5 values
		Set<String> myStrings = new HashSet<String>();
		myStrings.add("Happy");
		myStrings.add("Sad");
		myStrings.add("Angry");		
		myStrings.add("Excited");
		myStrings.add("Anxious");
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
		Set<String> startsWithA = beginsWith(myStrings, 'A');
		for (String string : startsWithA ) {
			System.out.println(string);
		}
				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
		System.out.println(returnAList(myStrings));	
			

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
		Set<Integer> numberSet = new HashSet<Integer>();
		for (int i = 0; i<20; i++) {
			numberSet.add(i);
		}
		
		System.out.println(returnEvens(numberSet));
		
		
		


				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("This", "A thing close by");
		dictionary.put("That", "A thing further away");
		dictionary.put("Other", "Something else");

			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(lookupValue(dictionary, "This"));
		System.out.println(lookupValue(dictionary, "este"));

				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
		System.out.println(countChar(listOfString));
	}
	//A method that takes a List<String> and returns a map with a count of words that begin with a character
	
	public static Map<Character, Integer> countChar(List<String> list){
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c,1);
			} else {
				results.put(c, results.get(c)+1);
			}
		}
		return results;
	}
	
	//A method that searches a dictionary and returns a value
	public static String lookupValue (Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
			return map.get(key);
			}
		}
			return "Not in this dictionary.";
			
		
	}
	
	// Print out a String of numbers with a dash exclude the dash at the end.**************************************************************************************************
	public static String printOutNumbers(String symbol, int nums) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < nums; i++) {
			result.append(i + symbol);
		}
		result.append(nums);
		return result.toString();
	}
	// Method to return the Shortest String**************************************************************************************************
	public static String returnShortestString(List<String> listOfString) {
		int size = 0;
		String smallest = listOfString.get(0);
		for (String string : listOfString) {
			if (string.length() < size && string.length()>0) {
				size = string.length();
				smallest = string;
			}
		}
		
		return smallest;
	}
	//Method that switch the last value and first value**************************************************************************************************
	public static List<String> switchValues(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, temp);
	return list;
	
	}
	//Make a list a string then put comma between the values**************************************************************************************************
	public static String withAComma(List<String> list) {
		StringBuilder string = new StringBuilder();
		for (String item : list) {
			string.append(item + ", ");
		}
		return string.toString();
	}
	//A method that searches a list of strings and returns the values that contain a parameter. (like a search bar type thing)
	public static List<String> searchAList (List<String> list, String query){
		List <String> results = new ArrayList<String>();
		for (String string : list)
			if (string.contains(query)) {
				results.add(string);
			}
		return results;
		
	}
	// A method that sorts a list of Integers into 4 different lists
	public static List<List<Integer>> sortDividibleNumbers (List<Integer> list){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		for(Integer number : list) {
			if (number%2 == 0) {
				results.get(0).add(number);
			}
			if (number%3 == 0) {
				results.get(1).add(number);
			}
			if (number%5 == 0) {
				results.get(2).add(number);
			}
			if (number%2 != 0 && number%3 != 0 && number%5 != 0 ) {
				results.get(3).add(number);
			}
			
		}
		return results;
		
	}
	// A method that returns the lengths of string values in a list
	public static List<Integer> lengthOfStrings(List<String> strings){
		List<Integer> lenOfStrings = new ArrayList<Integer>();
		for (String string : strings) {
			lenOfStrings.add(string.length());
		}
		return lenOfStrings;
	}
	// A method that returns Strings in a set that begin with a character
	public static Set<String> beginsWith(Set<String> set, char c){
		Set<String> results = new HashSet<String>();
		for (String string : set) {
			if (string.charAt(0) == c) {
			results.add(string);
			}
	
	}
		return results;	
}
	// A method that takes a set and returns a list
	public static List<String> returnAList(Set<String> strings){
		List<String> results = new ArrayList<String>();
		for (String string : strings) {
			results.add(string);
		}
		//results.add("Sad"); // test to make sure its returning a list, sets don't have duplicates
		return results;
	}
	// A method that takes a set of integers and returns a new set with only even numbers
	public static Set<Integer> returnEvens(Set<Integer> numbers){
		Set<Integer> evenNumbers = new HashSet<Integer>();
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}

}
