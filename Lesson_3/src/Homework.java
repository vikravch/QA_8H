
public class Homework {

	public static void main(String[] args) {
		String str = "Text for encrypt";
		String res = cesarEncrypt(str,10);
		System.out.println(res);
		String decryptRes = cesarDecrypt(res,10);
		System.out.println(decryptRes);
	}
	
	private static String cesarDecrypt(String str, int shift) {
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
									// int
			charArr[i] = (char) ((int) charArr[i] - shift);
		}
		String res = new String(charArr);

		return res;
	}

	private static String cesarEncrypt(String str1, int shift) {

		char[] charArr = str1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
									// int
			charArr[i] = (char) (charArr[i] + shift);
		}
		String res = new String(charArr);

		return res;
	}

}
