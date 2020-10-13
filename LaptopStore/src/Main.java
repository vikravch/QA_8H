
public class Main {

	public static void main(String[] args) {
		
		Store store = new Store("TelRan Store");
		
		Laptop laptop1 = new Laptop("Lenovo", 3000, "124214321");
		Laptop laptop2 = new Laptop("MacBook", 6000, "645645465");
		Laptop laptop3 = new Laptop("Samsung", 4500, "234324324");
		Laptop laptop4 = new Laptop("Asus", 3500, "3213213312");
		
		store.add(laptop1, laptop2, laptop3, laptop4);
		
		store.display();
		
		laptop1.receiveNewItems(4);
		laptop2.receiveNewItems(1);
		laptop3.receiveNewItems(6);
		laptop4.receiveNewItems(3);
		
		store.display();
		
		Laptop laptop5 = new Laptop("Asus", 3500, "3213213312");
		store.add(laptop5);
		store.display();
		
		Laptop laptop6 = new Laptop("Asus ", 3800, "3213213312");
		store.add(laptop6);
		store.display();
		
		store.addDiscount(10);
		store.display();
		
		store.addDiscountForLaptop(laptop2,25);
		store.display();
		
		// 1. удаление ноутбука с магазина:
		// store.remove(laptop2);
		// 2. переименование магазина:
		// store.rename("New name");
		// 3. оценка общей стоимости товаров
		// int total = store.getAllPriceValue();
	}

}
