package week04;

import java.util.List;
import java.util.ArrayList;

public class week04_tutor {

	public static void main(String[] args) {
		//************************************** StringBuilders Dynamic Strings ************************************************************
		String firstName = "Sally ";
		String lastName = "Smith ";
		System.out.println(firstName + lastName);
		System.out.println(multiplyString("Hi ",3));
		System.out.println(firstName.concat(lastName));
		
		StringBuilder fullName = new StringBuilder("Sam ");
		fullName.append("Smith");
		System.out.println(fullName.toString());
		
//		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.toString());
//		System.out.println(fullName.delete(1,3));
		
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4,9,"Thompson"));
		System.out.println(fullName.reverse());
		
		// **************************************************** LISTS *********************************************
		
		//List<String> "List of strings"
		//List<E> "e" is what ever generic you want
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		sports.remove("Football");
		
		for (int i =0; i<sports.size(); i ++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		//List<Integer> numbers = new ArrayList<Integer>();
		
		
		
		
	
		
//*************************************************** Methods Storage Area *************************************		
	}
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i<num; i++) {
			result.append(str);
		}
		return result.toString();
	}
	

}