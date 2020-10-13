import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Store {
	private String name;
	private float discount;
	private HashSet<Laptop> items = new HashSet<>();

	public Store(String name) {
		super();
		this.name = name;
	}
					 // array
	public void add(Laptop ... laptops) {
		for(Laptop newLaptop:laptops) {
			boolean res = items.add(newLaptop);
			if (res==true) {
				LogHelper.file(": Added new laptop barcode - "+
						newLaptop.getBarcode());
			} else {
				LogHelper.file(": Laptop didn't add barcode - " + 
						newLaptop.getBarcode());
			}
		}
	}
	
	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("=================\n");
		sb.append("Read at time: "+TimeHelper.getCurrentTime()+"\n");
		sb.append("Name - "+name+"\n");
		if(discount>0) {
			sb.append("Store's discount: "+discount+"\n");
		}
		sb.append("=================\n");
		sb.append("=====ITEMS=====\n");
		for(Laptop item:items) {
			Laptop itemForPrint = new Laptop(item);
			int newPrice =(int)(itemForPrint.getPrice() * 
					((100-discount)/100));
					// 20% ->  (100-20)/100
			itemForPrint.setPrice(newPrice);
			sb.append("\t - "+itemForPrint+"\n");
		}
		sb.append("=================\n");
		
		System.out.println(sb.toString());
	}
	
	public void addDiscount(float discount) {
		LogHelper.file(": Added new discount for store - "+
				discount);
		this.discount = discount;
	}
	
	public void addDiscountForLaptop(Laptop laptop, float discount) {
		System.out.println(items.contains(laptop));
		LogHelper.file(": Added new discount for barcode - "+
				laptop.getBarcode()+
				" discount - "+discount);
		
		laptop.setDiscount(discount);
	}
}
