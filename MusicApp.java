package part03;

import java.util.Scanner;

public class MusicApp {
	
// A Scanner for reading data from the keyboard
	static Scanner input = new Scanner(System.in);
	
// a constant value use to fix the size of the array defined below
	static final int MAX = 4;
	
// an array of MP3Track object references
	static MP3Track myMusic[] = new MP3Track[MAX];
	
// count defines the number of MP3Track object references managed 
// within array 'myMusic'
	
	static int count = 0;

	public static void main(String[] args) {
		
		String options[] = { "Add a Track", "List all Tracks", "Quit" };
		Menu myMenu = new Menu("Music Menu", options);
		
		boolean finished = false;
		
		do {
			
			int option = myMenu.getUserChoice();
			
			switch (option) {
			
			case 1:
				addTrack();
				break;
				
			case 2:
				listTracks();
				break;
				
			case 3:
				finished = true;
				break;
				
			default:
				System.out.println("Not a valid option.");
				
			}
			
		} while (!finished);
		
	}

	/**
	 * This method facilitates the addition of new MP3Track objects to the system.
	 * If the storage capacity permits, the user is prompted for MP3Track data which
	 * is read using a Scanner (referenced by 'input') defined at the start of this
	 * program.
	 */
	
	public static void addTrack() {
		
// Add your code here
		
if (count < MAX) {
			
			System.out.println("\n" + "Add a new track.");
			
			
			MP3Track mp = new MP3Track();
			
			System.out.print("Enter Title: ");
			
			String title = input.nextLine();
			
			mp.setTitle(title);
			
			System.out.print("Enter Artist: ");
			
			String artist = input.nextLine();
			
			mp.setArtist(artist);
			
			System.out.print("Enter duration: ");
			
			int duration = input.nextInt();
			
			mp.setDuration(duration);
			
			input.nextLine(); 
			
			//selectGenre();
			
			mp.setGenre(selectGenre());
			
			System.out.println("New MP3Track successfully added" + "\n");
						
			myMusic[count] = mp;
			
			count++;
			
		} else {
			
			System.out.println("No room to add any more tracks!");
			
		}
		
	}

	/**
	 * This method outputs the details of all MP3Track objects managed by the
	 * system.
	 */
	
	public static void listTracks() {
		
// Add your code here
			
		if (count == 0) {
			
			System.out.println("Sorry, there are no tracks.");
			
		} else {
			
			for (int index = 0; index < count; index++) {
				
				System.out.println(myMusic[index].getTitle() + " by " + myMusic[index].getArtist());
				System.out.println("Code: " + (index + 1));
				System.out.println("Genre: " + myMusic[index].getGenre());
				System.out.println("Duration: " + myMusic[index].getDuration() + " seconds");
				System.out.println("\n");
				
			}
			
		}
		
		System.out.println();
		
	}

	/**
	 * This method prompts the user to select a music 'genre' from a list.
	 * 
	 * @return a Genre object reference representing the user selection
	 */
	
	public static Genre selectGenre() {
		
		String options[] = { "Rock", "Pop", "Classical", "Other" };
		Menu genSelect = new Menu("Select a Genre", options);
		
		int choice = genSelect.getUserChoice();
		
		switch (choice) {
		case 1:
			return Genre.ROCK;
			
		case 2:
			return Genre.POP;
			
		case 3:
			return Genre.CLASSICAL;
			
		default:
			return Genre.OTHER;
			
		}
		
	}
	
}