package part02;

public class MP3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MP3Track mp31 = new MP3Track("One", "U2", 180, Genre.ROCK);
		MP3Track mp32 = new MP3Track("Two", "Beyonce", 60, Genre.POP);
		MP3Track mp33 = new MP3Track("Three", "Yeire13", 20, Genre.OTHER);
						
		System.out.println(mp31.toString());
		System.out.println(mp32.toString());
		System.out.println(mp33.toString());
												
	}

}
