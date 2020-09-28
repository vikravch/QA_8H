package static_example;

public class Main {

	// Main.main("First arg");
	public static void main(String ... args) {
		System.out.println(SecondClass.a);
		SecondClass.a = 20;
		System.out.println(SecondClass.a);
		
		SecondClass first = new SecondClass();
		SecondClass second = new SecondClass();
		System.out.println("is equals - "+(first==second));
		System.out.println(first.a);
		second.a = 13;
		System.out.println(first.a);
		int res = SecondClass.digitCount("fsdfsad11");
		System.out.println(res);
		
	}

}
