public class Apple extends ProductItem{
	private String type;
	private float weight;

	public Apple(String name, String barcode, String type, float weight) {
		super(name, barcode);
		this.type = type;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [type=" + type + ", weight=" + weight + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "] " + super.toString() + "\n";
	}

	@Override
	public float getTotalPrice() {
		// TODO Auto-generated method stub
		return getPrice() * weight;
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return String.format("Apple Weight: %.2f type:%s barcode:%s name:%s price:%.2f", 
								weight, type, barcode, name, getPrice());
	}
}