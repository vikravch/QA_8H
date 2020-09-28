package static_example;

public class SecondClass {
	
	public static int a = 10;
	
	private int x;
	private String str;
	
	public String getStr() {
		return str;
	}
	
	public static int digitCount(String income) {
		//str = "Hello"; not works because non-static
		//String res = getStr(); not works because non-static
		a = 34;
		int res = 0;
		for(char ch:income.toCharArray()) {
			if(Character.isDigit(ch)) {
				res++;
			}
		}
		return res;
	}
	
	
}
