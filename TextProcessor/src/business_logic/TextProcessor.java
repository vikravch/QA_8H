package business_logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TextProcessor {
	
	private String text;
	
	public TextProcessor(String text) {
		this.text = text;
		prepareText();
	}

	private void prepareText() {
		text = text.toLowerCase();
		/*text = text.replace("\n", "");
		text = text.replace("(", "");
		text = text.replace(")", "");
		text = text.replace(",", "");
		text = text.replace(".", "");
		text = text.replace("!", "");
		text = text.replace("?", "");
		*/
		// text = text.replace(charArr[i], "");
		String[] symbols = 
			{"\n", "(", ")", ",", ".", "!", "?"};
		for(int i=0; i<symbols.length; i++) {
			text = text.replace(symbols[i], "");
		}
	}

	public int getTextLength() {
		int res = text.length();
		return res;
	}

	public int getWordsCount() {
		String[] wordsArray = 
				text.split(" ");
		int res = wordsArray.length;
		return res;
	}
	
	public String[] getAllWords() {
		String[] wordsArray = 
				text.split(" ");
		return wordsArray;
	}

	public String[] getSortedWords() {
		String[] array = getAllWords();
		Arrays.sort(array);
		return array;
	}
	
	public ArrayList<String> getWordsList(){
		ArrayList<String> words = new ArrayList<>();
		String[] source = getAllWords();
		/*for(int i=0; i<source.length; i++) {
			words.add(source[i]);
		}*/
		//  one element   array
		for(String item : source) {
			words.add(item);
		}
		return words;
	}

	public String getRandomWord() {
		String[] array = getAllWords();
		Random random = new Random();
		int index = random.nextInt(array.length);
		return array[index];
	}
	
}