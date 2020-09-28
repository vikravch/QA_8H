
public class Main {

	public static void main(String[] args) {
		testCheckIsNumber1();
		testCheckIsNumber2();
		testCheckIsNumber3();
		//System.out.println("Is number - "+isStrNumber);
		
		char c = '9';
		System.out.println((int) c);
		
		String strArr = "43232sfddfs";
		boolean isStrWithArr = checkIsNumberArr(strArr);
		System.out.println(isStrWithArr);
	}

	private static void testCheckIsNumber1() {
		String str = "-76.45";
		boolean expected = true;
		
		boolean isStrNumber = checkIsNumber(str);
		
		if(isStrNumber==expected) {
			System.out.println("Success!");
		} else {
			System.out.println("Error.");
		}
	}
	
	private static void testCheckIsNumber2() {
		String str = "hello";
		boolean expected = false;
		
		boolean isStrNumber = checkIsNumber(str);
		
		if(isStrNumber==expected) {
			System.out.println("Success!");
		} else {
			System.out.println("Error.");
		}
	}
	
	private static void testCheckIsNumber3() {
		String str = "453242";
		boolean expected = true;
		
		boolean isStrNumber = checkIsNumber(str);
		
		if(isStrNumber==expected) {
			System.out.println("Success!");
		} else {
			System.out.println("Error.");
		}
	}

	public static boolean checkIsNumber(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean checkIsNumberArr(String str) {
		//1
		char[] arr = str.toCharArray();
		//2
		for(int i=0; i<arr.length; i++) {
			//if (isDigit(arr[i]) == false) {
			if(Character.isDigit(arr[i])==false) {
				return false;
			}
		}
		/*
		 * 1) get char array from str
		 * 2) iterate over char array with int i
		 * 3) check is array[i] digit or not
		 * 4) if not - return false
		 * 5) at the end - return true
		 * */
		return true;
	}
	
	public static boolean isDigit(char ch) {
		return ch<='9' && ch>='0';
	}
	
	public static boolean testIsPrime(int value) {
		if(value<1) {
			return false;
		}
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		for(int i=2; i<value/2; i++) {
			boolean isDivide = (value%i == 0);
			System.out.println("isDivide on "+i+" - "+isDivide);
			if(isDivide==true) {
				return false;
			}
		}
		return true;
		// is 13 prime? 2..(12/2) 2..6
	}
}






