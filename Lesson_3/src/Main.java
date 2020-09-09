import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		String code = convertToString(arr); // -> "12345"
		System.out.println(code);

		Random random = new Random();
		int res = random.nextInt(2);
		System.out.println("Random - "+res);

		int value = generateDigit();
		System.out.println(value);

		String codeRes = generate6DigCode();
		System.out.println("+972"+codeRes);
		
		String phoneRes = generatePhoneNumber();
		System.out.println(phoneRes);
	}

	private static String generatePhoneNumber() {
		// +972506657643
		String res = "+972";
		for(int i=0; i<9; i++) {
			res = res + generateDigit();
		}
		return res;
	}

	private static String generate6DigCode() {
		String res = "";
		for(int i=0; i<6; i++) {
			res = res + generateDigit();
		}
		return res;
	}

	private static String convertToString(int[] arr) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i]);
			//  String + int => concatenation
			res = res + arr[i]; // concat
			//res = res.concat("Hello");
		}
		return res;
	}

	private static int generateDigit() {
		Random random = new Random();
		int res = random.nextInt(10);
		return res;
	}

}
