package week04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class week04_MenuAppWithList {
	
	static Scanner scanner = new Scanner(System.in);
	
	static Map<String, String> phoneBook = new HashMap<String, String>();

	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice != 4) {
			
			printMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				displayPhoneBook();
			} else if (choice == 2) {
				addContact();
			} else if (choice == 3) {
				deleteContact();
			} else if (choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.println("Pick a valid option");
			}
		}
	}
	
	// METHOD STORAGE AREA
	//Display the menu
	public static void printMenu() {
		System.out.println("Display Phone Book");
		System.out.println("Add new Contact");
		System.out.println("Delete Contact");
		System.out.println("Exit");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for( String phoneNumber : phoneNumbers) {
			System.out.println(phoneNumber + "; " + phoneBook.get(phoneNumber));
		}
	}
	public static void addContact() {
		System.out.println("Enter Phone Number: ");
		String phoneNumber = scanner.next();
		System.out.print("Enter Name: ");
		String name = scanner.next();
		phoneBook.put(phoneNumber, name);
		System.out.print("Added " + name + " to phone book.");
	}
	
	public static void deleteContact() {
		System.out.println("Enter phone number to delete; ");
		String phoneNumber = scanner.next();
		System.out.println("Removed " + phoneBook.remove(phoneNumber));
		
	}
		
	
	
	

}
