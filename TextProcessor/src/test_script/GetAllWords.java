package test_script;

import java.util.Arrays;

import business_logic.TextProcessor;
import data.TextHolder;

public class GetAllWords {

	public static void main(String[] args) {
		TextProcessor textProcessor = 
				new TextProcessor(TextHolder.TEXT);
		
		String[] allWords = textProcessor.getAllWords(); 
		System.out.println(Arrays.toString(allWords));
		
		String[] sortedWords = textProcessor.getSortedWords();
		System.out.println(Arrays.toString(sortedWords));
	
		String randomWord = textProcessor.getRandomWord();
		System.out.println(randomWord);
	}

}
