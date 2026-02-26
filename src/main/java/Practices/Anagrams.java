package Practices;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String wd1 = "Mary";
		String wd2 = "armYweL";
		
		wd1.toLowerCase();
		wd2.toLowerCase();
		
		char[] Arrwd1 = wd1.toCharArray();
		
		Arrays.sort(Arrwd1);	

		
		char[] Arrwd2 = wd2.toCharArray();
		
		Arrays.sort(Arrwd2);
		
		
		if(Arrays.equals(Arrwd1, Arrwd2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		
	}

}
