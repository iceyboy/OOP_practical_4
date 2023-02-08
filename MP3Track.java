package part02;

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

	public MP3Track() {

		this(null, null, -1, null);

	}

	public String toString() {

		return "Code :" + code + "\n" + "Title :" + title + "\n" + "Artist :" + artist + "\n" + "Duration :" + duration
				+ " seconds" + "\n" + "Genre :" + style.getSpelling() + "\n";

	}

	public void setTitle(String title) {

		if (title != null) {

			this.title = title;

		} else {

			if (this.title == null) {

				this.title = "Unknown";

			}

		}

	}

	public void setArtist(String artist) {

		if (artist != null) {

			this.artist = artist;

		} else {

			if (this.artist == null) {

				this.artist = "Unknown";

			}

		}

	}

	public void setDuration(int duration) {

		if (duration >= 0) {

			this.duration = duration;

		} else {

			this.duration = -1;

		}

	}

	public String getTitle() {

		return this.title;

	}

	public String getArtist() {

		return this.artist;

	}

	public int getDuration() {

		return this.duration;

	}
	
	public String getGenre() {
		
		return style.getSpelling();
		
	}
	
	public void setGenre(Genre gen) {
		
		this.style = gen;
		
	}

}
