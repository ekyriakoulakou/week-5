
public class Song {
	static Song song[]= new Song[10];
	private String title;
	private Singer singer;
	private String url;
	static int counterSong=0;

	public Song(String title1,Singer singer1,String url1) {
			title=title1;
			singer=singer1;
			url=url1;
			song[counterSong]=this;
			++counterSong;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title1) {
		title=title1;
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer1) {
		singer=singer1;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url1) {
		url=url1;
	}
	public String toString() {
		return "Song [title=" +title + ",singer=" +singer+ ",url=" +url+ "]";
	}

}
