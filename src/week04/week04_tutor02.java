package week04;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
import java.util.Map;
import java.util.Set;

public class week04_tutor02 {

	public static void main(String[] args) {
		// ********************************** Collections *****************************
		// lists
		// Common implementations: ArrayList, LinkedList, Vector
		// allows duplicates
//		List<String> students = new ArrayList<String>();
//		students.add("Rob");
//		students.add("Rob");
//		students.add("Sam");
//		students.add(null); // allows for null values
		
//		for (String student : students) {
//			System.out.println(student);
//		}
		
		//indexing - access by position
//		System.out.println(students.get(2)); // sam
//		System.out.println(students.get(0)); // rob
		
		
		
		// set
		// no duplicates
		// unordered
		// accepts null but only one
		//Common implementations: Hashset, LinkedHashSet, TreeSeta
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Idaho");
		states.add("Alabama");
		states.add("Arkansas");
		states.add("Califorina");
		states.add(null);
		
		System.out.println(states.size());
		System.out.println(states.contains("Delaware"));
		states.remove("Alabama");
		
		for (String state : states) {
			System.out.print(state + " " );
		}
		System.out.println();
		
		// maps
		// Key Value pairs (like a Dictionary in Python)
		// Values can be duplicate, but not keys.
		// Common implementations; HashMap, LinkedHashMap, TreeMap, HashTable
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		
		racerPlacements.remove(1);
		
		for (Integer key : racerKeys) {
			System.out.println(key + ": " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "Make something bigger");
		dictionary.put("Diminish", "Make something smaller");
		dictionary.put("Ostinatious", "Noticable and gaudy");
		
		
	
	}

}
