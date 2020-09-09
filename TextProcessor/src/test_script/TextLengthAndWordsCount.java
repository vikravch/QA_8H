package test_script;

import java.util.Arrays;

import business_logic.TextProcessor;
import data.TextHolder;

public class TextLengthAndWordsCount {

	public static void main(String[] args) {
		TextProcessor textProcessor = 
				new TextProcessor(TextHolder.TEXT);
		int length = textProcessor.getTextLength();
		System.out.println(length);
		int wordsCount = textProcessor.getWordsCount();
		System.out.println(wordsCount);
				
		System.out.println("text length - "+TextHolder.TEXT.length());
		String[] wordsArray = TextHolder.TEXT.split(" ");
		System.out.println("words count - "+wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));

	}

}
