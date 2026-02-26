package Practices;

import java.util.Map;
import java.util.HashMap;


public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String Word = "hellohe";
		
//		String LowerWord.toLowerCase();
		
		System.out.println(Word);
		
		Map<Character, Integer> Counts = new HashMap<Character, Integer>();
		
		for(int i=0; i<Word.length();i++) {
			if(!Counts.containsKey(Word.charAt(i))){
				Counts.put(Word.charAt(i), 1);
			}
			else {
				Counts.put(Word.charAt(i), Counts.get(Word.charAt(i))+1);
			}
		}
		
//		System.out.println(Counts.get('H'));
		
		for(int j =0; j<Word.length();j++) {
			if(Counts.get(Word.charAt(j)) == 1) {
				System.out.println(Word.charAt(j));
				break;
			}
		}
		
		
		

	}

}
