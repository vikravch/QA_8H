import java.util.ArrayList;

public class Bucket {

	private ArrayList<ProductItem> items = new ArrayList<>();

	void addItem(ProductItem item) {
		items.add(item);
	}

	void display() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).getStr());
		}
	}
}
