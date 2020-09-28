
public class Square implements CanCalculateSquare{

	private int a;
	
	
	public float calculateSquare() {
		return (a * a);
	}


	public Square(int a, int i) {
		super();
		this.a = a;
	}


	@Override
	public String toString() {
		return "Square [a=" + a + "]" + "square: " + calculateSquare();
	}
	
	public int compareTo(CanCalculateSquare that) {
		if(this.calculateSquare()>that.calculateSquare()) {
			return 1;
		}
		if(this.calculateSquare()<that.calculateSquare()) {
			return -1;
		}
		return 0;
		
	}
	
	

}
