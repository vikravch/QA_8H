package test_script;

import business_logic.TextProcessor;
import data.TextHolder;

public class FindEmails {

	public static void main(String[] args) {
		TextProcessor textProcessor = 
				new TextProcessor(TextHolder.TEXT);
		int emailCount = textProcessor.getEmailCount();
		System.out.println(emailCount);
	}

}
