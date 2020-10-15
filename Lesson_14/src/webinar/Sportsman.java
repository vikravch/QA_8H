package webinar;

public class Sportsman implements Comparable<Sportsman> {

	private String name;
	private long time;
	
	public Sportsman(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Sportsman [name=" + name + ", time=" + time + "]";
	}

	@Override
	public int compareTo(Sportsman that) {
		return Long.compare(this.time, that.time);
	}
}
