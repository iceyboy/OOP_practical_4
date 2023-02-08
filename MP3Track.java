package part01;

public class MP3Track {

	private int code;
	private String title;
	private String artist;
	private int duration;
	private Genre style;
	private static int nextCode = 1;

	public MP3Track(String title, String artist, int duration, Genre style) {

		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.style = style;
		this.code = nextCode;
		nextCode++;

	}

	public String toString() {

		return "Code :" + code + "\n" + "Title :" + title + "\n" 
		+ "Artist :" + artist + "\n" + "Duration :" + duration + " seconds" + "\n" 
		+ "Genre :" + style.getSpelling() + "\n";

	}

}