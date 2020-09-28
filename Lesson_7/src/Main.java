import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList< ProductItem >bucket = new ArrayList<>();
		bucket.add(new Apple("trash", "23456890", "figa", 10));
		bucket.add(new Apple("type", "14098451", "strong", 8));
		bucket.add(new Wine("ferst", "57392109", "caberne", 0.7f));
		bucket.add(new Wine("retro" , "33336789", "muscatr", 0.5f));
		bucket.add(new Bamba("ersh", "09563412", "carmel", 0.3f));
		bucket.add(new Bamba("neon", "13470965", "t-a", 0.4f));
		bucket.add(new Bamba("polo", "09653457", "rever", 1.0f));
		
//		ProductItem item = new ProductItem("Mango", "254760")
		
		System.out.println(bucket);
		
		Bucket myBucket = new Bucket();
		Apple apple1 = new Apple("trash", "23456890", "figa", 10);
		apple1.setPrice(10.0f);
		Apple apple2 = new Apple("type", "14098451", "strong", 8);
		apple2.setPrice(4.0f);
		Wine wine1 = new Wine("ferst", "57392109", "caberne", 0.7f);
		wine1.setPrice(25.3f);
		Wine wine2 = new Wine("retro" , "33336789", "muscatr", 0.5f);
		wine2.setPrice(99.9f);
		Bamba bamba1 = new Bamba("ersh", "09563412", "carmel", 0.3f);
		bamba1.setPrice(2.4f);
		Bamba bamba2 = new Bamba("neon", "13470965", "t-a", 0.4f);
		bamba2.setPrice(4.7f);
		Bamba bamba3 = new Bamba("polo", "09653457", "rever", 1.0f);
		bamba3.setPrice(6.2f);
		Soap soap = new Soap("soap", "3312321", 3, "USA");
		soap.setPrice(4);
		
		myBucket.addItem(apple1);
		myBucket.addItem(apple2);
		myBucket.addItem(wine1);
		myBucket.addItem(wine2);
		myBucket.addItem(bamba1);
		myBucket.addItem(bamba2);
		myBucket.addItem(bamba3);
		myBucket.addItem(soap);
		myBucket.display();
//		System.out.println();
		
	}

}
