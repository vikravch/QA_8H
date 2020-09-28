public class Bamba extends ProductItem {
	private String castomer;
	private float weight;

	public Bamba(String name, String barcode, String castomer, float weight) {
		super(name, barcode);
		this.castomer = castomer;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bamba [castomer=" + castomer + ", weight=" + weight + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "] " + super.toString() + "\n";
	}

	@Override
	public float getTotalPrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return String.format("Bamba castomer: %s weight:%.2f barcode:%s name%s price:%.2f", castomer, weight, barcode,
				name, getPrice());
	}
}