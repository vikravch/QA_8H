import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println(args[0]+" "+generatePhoneNumber());
	}
	
	private static String generatePhoneNumber() {
		// +972506657643
		String res = "+972";
		for(int i=0; i<9; i++) {
			res = res + generateDigit();
		}
		return res;
	}
	
	private static int generateDigit() {
		Random random = new Random();
		int res = random.nextInt(10);
		return res;
	}

}
