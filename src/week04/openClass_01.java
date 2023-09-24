package week04;

import java.util.ArrayList;
import java.util.List;

public class openClass_01 {

	public static void main(String[] args) {
		int userNumber = 9;
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> factorNum = new ArrayList<Integer>();
		
		for (int i = 1 ; i <= userNumber; i++) {
			allNum.add(i);
		}
		for (int i = 1; i < userNumber; i++) {
			if (userNumber % i == 0) {
				factorNum.add(i);
			}
		}System.out.println(factorNum);
		
		
	}

}
