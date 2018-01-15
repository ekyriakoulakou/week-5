
public class Singer {
	static Singer sing[]=new Singer [10];
	private String name;
	private int id;

	static int counterSingers=0;

	public Singer(String name1, int id1) {
		name=name1;
		id=id1;
		sing[counterSingers]=this;
		++counterSingers;


	}

	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name=name1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		id=id1;
	}

	public String toString() {
		return "Singer [name="+ name +  ",id =" + id + "]";
	}
}
