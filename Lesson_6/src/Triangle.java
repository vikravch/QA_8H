
public class Triangle implements CanCalculateSquare {

	private int base;
	private int heigh;
	
	public float calculateSquare() {
		return (base*heigh)/2;
	}
	
	public Triangle(int base, int heigh) {
		super();
		this.base = base;
		this.heigh = heigh;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", heigh=" + heigh + "]" + "square: " + calculateSquare();
	}
	
	
	public int compareTo(CanCalculateSquare that) {
		if (this.calculateSquare() > that.calculateSquare()) {
			return 1;
		}
		if (this.calculateSquare() < that.calculateSquare()) {
			return -1;
		}
		return 0;

	}
	
	
	
}
