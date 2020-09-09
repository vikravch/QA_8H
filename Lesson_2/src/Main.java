import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String text = "Text for test";

		// method call:
		text.isEmpty();
		int size = text.length();
		
		printOddReverce(text);
		System.out.println();

		String str1 = "abc";
		String str2 = new String("abc");
		if (str1 == str2) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equals");
		}
		if (str1.equals(str2)) {
			System.out.println("Content equals");
		} else {
			System.out.println("Content not equals");
		}

		char ch = str1.charAt(1);
		System.out.println(ch);

		char[] charAray = str1.toCharArray();

		String encRes = cesarEncrypt("Hello", 10);
		System.out.println(encRes);
				//       0123456
		String myText = "Таким образом постоянный количественный рост и сфера нашей активности "
				+ "обеспечивает широкому кругу (специалистов) участие в формировании направлений "
				+ "прогрессивного развития. Значимость этих проблем настолько очевидна, что "
				+ "постоянное информационно-пропагандистское обеспечение нашей деятельности "
				+ "требуют от нас анализа позиций, test@test.co.il занимаемых участниками в отношении "
				+ "поставленных задач. Значимость этих проблем настолько очевидна, что "
				+ "реализация намеченных плановых заданий обеспечивает широкому кругу "
				+ "(специалистов) участие в формировании направлений прогрессивного развития.";
		
		
		int shtrudelIndex = myText.indexOf("@");
		int startIndex = myText.lastIndexOf(' ',shtrudelIndex);
		int finishIndex = myText.indexOf(' ',shtrudelIndex);
		String resEmail = myText.substring(startIndex+1, finishIndex);
		System.out.println(resEmail);
		//  0123456789
		//  abcdefghij
		//  substring(1,5) -> bcde 1..4
		//  substring(2,3) -> c 2
		//  substring(5) -> fghij 5..9
		String newText = myText.replace(resEmail,"");
		String newSpaces = myText.replace(' ','~');
		System.out.println(newText);
		System.out.println(newSpaces);
		
		System.out.println(shtrudelIndex);
		System.out.println(startIndex);
		System.out.println(finishIndex);
		
		int lastIndex1 = myText.lastIndexOf("образом");
		System.out.println(lastIndex1);
		
		int index = myText.indexOf("образом");
		System.out.println(index);
		
		String strForSub = "Some text"; //     inc exc
		System.out.println(strForSub.substring( 5 , 9 ));
		
		System.out.println("text length - "+TextHolder.TEXT.length());
		String[] wordsArray = TextHolder.TEXT.split(" ");
		System.out.println("words count - "+wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		
		String joinedStr = String.join("_", wordsArray);
		System.out.println(joinedStr);
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
	//              
	// "Text for test" 
	// last index = length - 1
	private static void printOddReverce(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(text.charAt(i));
			}
		}
	}
}