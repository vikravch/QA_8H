package test_script;

import java.util.HashSet;
import java.util.TreeSet;

import business_logic.TextProcessor;
import data.TextHolder;

public class GetUniqueWords {

	public static void main(String[] args) {
		TextProcessor textProcessor = 
				new TextProcessor(TextHolder.TEXT);
		HashSet<String> res = 
				textProcessor.getUniqueWords();
		System.out.println(res);
		
		TreeSet<String> sortedRes = 
				textProcessor.getSortedUniqueWords();
		System.out.println(sortedRes);
		
		// [1,2,3,4,5,6,7,8,9,10]
		// subSet(2,7)
		// [2,3,4,5,6]
		
		// [1,8,13,23,45,100,190,200,211]
		// subSet(5,189)
		// [?]
		TreeSet<String> resLetter = 
				(TreeSet<String>) sortedRes.subSet("н", "о");
		System.out.println(resLetter);
		
		TreeSet<String> latinRes = 
				(TreeSet<String>) sortedRes.headSet("а");
		System.out.println(latinRes);
		
		TreeSet<String> cyrillicRes = 
				(TreeSet<String>) sortedRes.tailSet("т");
		System.out.println(cyrillicRes);
	}

}
