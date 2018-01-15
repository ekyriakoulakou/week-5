import java.util.Scanner;

public class SongTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//Singer sing[] = new Singer [10];//Δημιουργία πίνακα 10 θέσεων για αντικείμενα τύπου Singer
		//Song song[] = new Song [10];//Δημιουργία πίνακα 10 θέσεων για αντικείμενα τύπου Song

		Singer frank = new Singer ("Frank Sinatra",0);//Δημιουργία νέου αντικειμένου τύπου Singer με όνομα Frank Sinatra και id=0
		new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );

		Singer wham = new Singer ("Wham!",1);
		new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );

		Singer mariah = new Singer ("Mariah Carey",2);
		new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );//Δημιουργία νέου αντικειμένου τύπου Song με όνομα, τραγουδιστή και url στο youtube

		Singer chris = new Singer ("Chris Rea",3);
		new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");

		Singer sia = new Singer ("Sia",4);
		new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );


		/*sing[0]=frank;//Ανάθεση στην πρώτη θέση του πίνακα των τραγουδιστών το αντικείμενο frank
		sing[1]=wham;
		sing[2]=mariah;
		sing[3]=chris;
		sing[4]=sia;

		song[0]=song1;//Ανάθεση στην πρώτη θέση του πίνακα των τραγουδιών το αντικείμενο song1
		song[1]=song2;
		song[2]=song3;
		song[3]=song4;
		song[4]=song5;
		song[5]=song6;*/



		while (true){//η συνθήκη θα είναι πάντα αληθής
			System.out.println("");
			System.out.println("");
			System.out.println("**************** Welcome to our DMST Christmas Music Application****************");
			System.out.println("------ Menu ------");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank Sinatra available songs");
			System.out.println("Type here:");

			int choice = scanner.nextInt();//Η μεταβλητή της επιλογής του αναγνώστη που θα εισάγει στο πρόγραμμα την εκάστοτε τιμή μέσω του πληκτρολογίου

			if (choice == 1){
				System.out.println("\nList of Singers: ");//Εκτυπώνει τη λίστα με τους τραγουδιστές
				for (Singer  singer: Singer.sing){//Εκτύπωση όλων των αντικειμένων του πίνακα sing
					if (singer!= null)//αν υπάρχει αντικείμενο στη θέση
						System.out.println(singer.toString());//Καλεί την toString για να εμφανίσει το όνομα και το id από την κλάση Singer
				}
			}


			else if (choice == 2){
				System.out.println("");
				System.out.println("** Display Frank's Sinatra Song List **");//Εμφάνισε τη λίστα των τραγουδιών του Frank Sinatra

						int counter=0;
						for(int y=0; y<Song.song.length; y++){
							if(Song.song[y]!= null){
								if (Song.song[y].getSinger().equals(frank))
									counter++;	
							}
						}
						System.out.println(counter+" "+ "songs were found:");
						if(counter>0){
							for(int y=0; y<Song.song.length; y++){
								if(Song.song[y]!= null){
									if (frank.equals(Song.song[y].getSinger()))
										System.out.println(Song.song[y].toString());
								}
							}

						}


			}

			else
				System.out.println("wrong input");
			System.out.println("------------------\n");
		}
	}
}


