package test_script;

import java.util.ArrayList;
import java.util.Collections;

import business_logic.TextProcessor;
import data.TextHolder;

public class BasicWorkWithList {

	public static void main(String[] args) {
		TextProcessor textProcessor = 
				new TextProcessor(TextHolder.TEXT);
		ArrayList<String> wordsList = textProcessor.getWordsList();
		
		Collections.shuffle(wordsList);
		System.out.println(wordsList);
	}
}