package part04;

public class ArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData[] = { "cats", "or", "mice", "parade", "under", "the", "erratic", "rain" };
		displayData(strData);
		initialLetters(strData);
		
	}

	public static void displayData(String info[]) {
		// add your code here
		System.out.print("Array Data: ");

		for (int i = 0; i < info.length; i++) {

			System.out.print(info[i] + " ");

		}

		System.out.println();

	}

	public static void initialLetters(String info[]) {
		// add your code here

		System.out.print("Initials: ");

		for (int i = 0; i < info.length; i++) {

			System.out.print(info[i].charAt(0));

		}

		System.out.println();

	}

	public static void analyse(String info[]) {
		
		int vowels = 0;
		int consonants = 0;
		
		for(int i = 0; i < info.length; i++) {
			
			for(int j = 0; j < info[i].length(); j++) {
				
				if(isLetter(info[i].charAt(j)) == true) {
					
					if(isVowel(info[i].charAt(j)) == true) {
						
						vowels++;
						
					}else {
						
						consonants++;
						
					}
					
				}
				
			}
			
		}
		
		System.out.println("Analysis: " + vowels + " vowels and " + consonants + " consonants");

	}

	public static boolean isVowel(char ch) {
		
		switch (ch) {
		
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			
			return true;
		}
		
		return false;
		
	}

	public static boolean isLetter(char ch) {
		
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && (ch <= 'Z'));
	
	}

}
