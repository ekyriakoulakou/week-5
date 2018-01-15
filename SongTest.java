import java.util.Scanner;

public class SongTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//Singer sing[] = new Singer [10];//���������� ������ 10 ������ ��� ����������� ����� Singer
		//Song song[] = new Song [10];//���������� ������ 10 ������ ��� ����������� ����� Song

		Singer frank = new Singer ("Frank Sinatra",0);//���������� ���� ������������ ����� Singer �� ����� Frank Sinatra ��� id=0
		new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );

		Singer wham = new Singer ("Wham!",1);
		new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );

		Singer mariah = new Singer ("Mariah Carey",2);
		new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );//���������� ���� ������������ ����� Song �� �����, ����������� ��� url ��� youtube

		Singer chris = new Singer ("Chris Rea",3);
		new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");

		Singer sia = new Singer ("Sia",4);
		new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );


		/*sing[0]=frank;//������� ���� ����� ���� ��� ������ ��� ������������ �� ����������� frank
		sing[1]=wham;
		sing[2]=mariah;
		sing[3]=chris;
		sing[4]=sia;

		song[0]=song1;//������� ���� ����� ���� ��� ������ ��� ���������� �� ����������� song1
		song[1]=song2;
		song[2]=song3;
		song[3]=song4;
		song[4]=song5;
		song[5]=song6;*/



		while (true){//� ������� �� ����� ����� ������
			System.out.println("");
			System.out.println("");
			System.out.println("**************** Welcome to our DMST Christmas Music Application****************");
			System.out.println("------ Menu ------");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank Sinatra available songs");
			System.out.println("Type here:");

			int choice = scanner.nextInt();//� ��������� ��� �������� ��� ��������� ��� �� ������� ��� ��������� ��� �������� ���� ���� ��� �������������

			if (choice == 1){
				System.out.println("\nList of Singers: ");//��������� �� ����� �� ���� ������������
				for (Singer  singer: Singer.sing){//�������� ���� ��� ������������ ��� ������ sing
					if (singer!= null)//�� ������� ����������� ��� ����
						System.out.println(singer.toString());//����� ��� toString ��� �� ��������� �� ����� ��� �� id ��� ��� ����� Singer
				}
			}


			else if (choice == 2){
				System.out.println("");
				System.out.println("** Display Frank's Sinatra Song List **");//�������� �� ����� ��� ���������� ��� Frank Sinatra

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


