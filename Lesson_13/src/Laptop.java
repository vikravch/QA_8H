
public class Laptop {
	private String name;
	private int price;
	private int priceForSale = 0;
	private String barcode;
	private int count = 0;
	
	public Laptop(String name, int price, 
			String barcode) {
		super();
		this.name = name;
		this.price = price;
		this.barcode = barcode;
	}
	
	public Laptop(Laptop item) {
		this.barcode = item.barcode;
		this.name = item.name;
		this.price = item.price;
		this.count = item.count;
		this.priceForSale = item.priceForSale;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscount(float discount) {
		float cf= (100f-discount)/100f;
		
		this.priceForSale = 
				(int)(this.price*(cf));

	}

	public void receiveNewItems(int newCount) {
		this.count += newCount; 
	}

	@Override
	public String toString() {
		String textPriceForSale = "";
		if(priceForSale!=0) {
			textPriceForSale = ", priceForSale= "+priceForSale;
		}
		
		return "name=" + name + ", price=" + price + 
				", barcode=" + barcode + 
				", count=" + count + textPriceForSale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barcode == null) ? 0 : barcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (barcode == null) {
			if (other.barcode != null)
				return false;
		} else if (!barcode.equals(other.barcode))
			return false;
		return true;
	}

	
	
}
