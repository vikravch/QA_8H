
public abstract class ProductItem{
	protected String name;
	protected String barcode;
	private float price;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public ProductItem(String name, String barcode) {
		super();
		this.name = name;
		this.barcode = barcode;
	}
	public abstract float getTotalPrice();
	public abstract String getStr();
	@Override
	public String toString() {
		return "ProductItem [name=" + name + ", barcode=" + barcode + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
		

	}
	
}
