package part03;

public enum Genre {
	
	ROCK("Rock and Roll"),
	POP("Popular Easy Listening"),
	CLASSICAL("Orchestral Vibe"),
	OTHER("Something Else");
	
	private String spelling;
	
	private Genre(String str) {
		
		spelling = str;
		
	}
	
	public String getSpelling() {
		
		return spelling;
		
	}	
	
}
