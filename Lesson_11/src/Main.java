import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("First element");
		list.add("Second element");
		list.add("Third element");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.add(1,"Fourth element");
		System.out.println(list);
		
		Random random = new Random();
		
		long startTime = System.currentTimeMillis();
		
		LinkedList<Integer> randomList = new LinkedList<>();
		randomList.add(random.nextInt());
		randomList.add(random.nextInt());
		randomList.add(random.nextInt());
		randomList.add(random.nextInt());
		randomList.add(random.nextInt());
		for(int i=0; i<100000; i++) {
			randomList.add(4,random.nextInt());
		}
		long finishTime = System.currentTimeMillis();
		
		System.out.println(randomList.size());
		System.out.println("Linked list inserting time - "+(finishTime-startTime));
	
		long startArrayTime = System.currentTimeMillis();
		ArrayList<Integer> randomArrList = new ArrayList<>();
		randomArrList.add(random.nextInt());
		randomArrList.add(random.nextInt());
		randomArrList.add(random.nextInt());
		randomArrList.add(random.nextInt());
		randomArrList.add(random.nextInt());
		for(int i=0; i<100000; i++) {
			randomArrList.add(4,random.nextInt());
		}
		long finishArrayTime = System.currentTimeMillis();
		
		System.out.println("Array list inserting time - "+
				(finishArrayTime-startArrayTime));
		
		long startGetLinked = System.currentTimeMillis();
		int item = 0;
		for(int i=0; i<100000; i++) {
			item = randomList.get(70000);
		}
		long finishGetLinked = System.currentTimeMillis();
		System.out.println("Get 70000 element from linked time - "
				+(finishGetLinked-startGetLinked));
		
		long startGetArray = System.currentTimeMillis();
		int itemArr = 0;
		for(int i=0; i<100000; i++) {
			itemArr = randomArrList.get(70000);
		}
		long finishGetArray = System.currentTimeMillis();
		System.out.println("Get 70000 element from array time - "
				+(finishGetArray-startGetArray));
		
		long startStrConcat = System.currentTimeMillis();
		String str = "";
		for(int i=0; i<100000; i++) {
			str = str+" string";
		}
		long finishStrConcat = System.currentTimeMillis();
		
		System.out.println("res length - "+str.length());
		System.out.println("string concat time - "
				+(finishStrConcat - startStrConcat));
		
		long startSBConcat = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<100000; i++) {
			sb.append(" string");
		}
		long finishSBConcat = System.currentTimeMillis();
		System.out.println("res SB length - "+sb.length());
		System.out.println("SB concat time - "
				+(finishSBConcat - startSBConcat));
		
		// Homework
		// str1.concat(str2) == str1+str2
		// Написать тест на скорость с запуском добавления 
		// строки " string" 100000 с помощью str1.concat(str2)
		// str = str.concat(" string");
	}

}
