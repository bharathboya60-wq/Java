package Practices;
import java.util.Map;
import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String Word = "Hello Bharath";
		Map<Character, Integer> charsCount = new HashMap<Character, Integer>();
		
		for(int i=0; i<Word.length();i++) {
			if(!charsCount.containsKey(Word.charAt(i))){
				charsCount.put(Word.charAt(i), 1);
			}
			else {
				charsCount.put(Word.charAt(i), charsCount.get(Word.charAt(i))+1);
			}
		}
		
		System.out.println(charsCount);
		
		System.out.println("Repeated characters are: ");
		for(char wd : charsCount.keySet()) {
			if(charsCount.get(wd) >1) {	
				System.out.println(wd);
			}
		}
		

	}

}
