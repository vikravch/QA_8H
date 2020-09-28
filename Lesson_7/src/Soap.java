
public class Soap extends ProductItem {
	
	private int count;
	private String customer;
	
	public Soap(String name, String barcode, int count, String customer) {
		super(name, barcode);
		this.count = count;
		this.customer = customer;
	}

	public float getTotalPrice() {
		if(count % 3==0) {
			int countOf3 = count/3;
			return countOf3*10f;
		} else {
			return count*getPrice();
		}
	}
	
	public String getStr() {
		return String.format("Soap customer: %s count:%d barcode:%s name:%s price:%.2f", 
				customer, count, barcode, name, getTotalPrice());
	}
	
}
