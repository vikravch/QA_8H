
public class Circle implements CanCalculateSquare{

	private int r;
	
	public float calculateSquare() {
		return (float) (Math.PI *(r*r));
	}

	public Circle(int r) throws NegativeValueException, 
		ZeroValueException {
		super();
		if (r>0) {
			this.r = r;			
		} else if(r==0) {
			throw new ZeroValueException();
		} else {
			throw new NegativeValueException();
		}
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]" + "square: " + calculateSquare();
	}
	
//	public int compareTo(Object that) {
//		CanCalculateSquare thatC = (CanCalculateSquare) that;
//		if(this.calculateSquare()>thatC.calculateSquare()) {
//			return 1;
//		}
//		if(this.calculateSquare()<thatC.calculateSquare()) {
//			return -1;
//		}
//		return 0;
//		
//	}
	
	public int compareTo(CanCalculateSquare that) {
		return Float.compare(this.calculateSquare(), that.calculateSquare());
	}
	
}
