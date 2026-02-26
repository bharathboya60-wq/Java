package Practices;

public class CharacterCount {

	public static void main(String[] args) {
		String Word = "Hello Bharath Thisb is Thalaiva";
		int Count = 0;
		char Com = 'b';
		for(int i=0; i< Word.length(); i++)
		{
			if(Word.charAt(i) == Com)   // .equals also works
			{
				Count++;
			}
		}
		System.out.println(Count);
		
		
		int CountOfChar = Word.length() - Word.replaceAll("b", "").length();
		System.out.println(CountOfChar);

	}

}
