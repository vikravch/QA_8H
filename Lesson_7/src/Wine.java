public class Wine extends ProductItem {
	private String color;
	private float bottleVpolume;

	public Wine(String name, String barcode, String color, float bottleVpolume) {
		super(name, barcode);
		this.color = color;
		this.bottleVpolume = bottleVpolume;
	}

	@Override
	public String toString() {
		return "Wine [color=" + color + ", bottleVpolume=" + bottleVpolume + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "] " + super.toString() + "\n";
	}

	@Override
	public float getTotalPrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return String.format("Wine color: %s bottleVpolume:%.2f barcode:%s namr%s price:%.2f", color, bottleVpolume,
				barcode, name, getPrice());
	}
}
