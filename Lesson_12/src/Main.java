import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		// Set - множество
		Set<Integer> set = new HashSet<Integer>();
		set.add(12);
		//set.add("Hello");
		//set.add(false);
		System.out.println(set);
		// Хеш таблица?
		set.add(12);
		System.out.println(set);
		set.add(4);
		set.add(10);
		set.add(-4);
		set.add(-12);
		System.out.println(set);
		
		set.remove(-4);
		System.out.println(set);
		
		HashSet<Integer> setSecond = new HashSet<>();
		setSecond.add(4);
		setSecond.add(12);
		setSecond.add(0);
		setSecond.add(-100);
		System.out.println(setSecond);
		
		set.addAll(setSecond);
		System.out.println(set);
		
		boolean res = set.containsAll(setSecond);
		System.out.println(res);
		set.removeAll(setSecond);
		System.out.println(set);
		set.add(-100);
		System.out.println(set);
		// 
		boolean resSet = set.retainAll(setSecond);
		System.out.println(resSet);
		System.out.println(set);
		for(Integer item:set) {
			System.out.println("item is - "+item);
		}
		
		ArrayList<Integer> valuesList = new ArrayList<>();
		Random random = new Random();
		for(int i=0; i<1000; i++) {
			int newValue = random.nextInt(1000);
			valuesList.add(newValue);
		}
		System.out.println(valuesList);
		
		HashSet<Integer> uniqueValues = new HashSet<>(valuesList);
		//uniqueValues.addAll(valuesList);
		System.out.println(uniqueValues);
		
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
		linkedSet.add(12);
		linkedSet.add(-12);
		linkedSet.add(-4);
		linkedSet.add(4);
		linkedSet.add(10);
		System.out.println(linkedSet);
		
		TreeSet<String> treeSet = new TreeSet<>();
		// Бинарное дерево
		treeSet.add("Hello");
		treeSet.add("AAAAA");
		treeSet.add("bbbbb");
		treeSet.add("HHHHH");
		System.out.println(treeSet);
		boolean addRes = treeSet.add("AAAAA");
		System.out.println(addRes);
		System.out.println(treeSet);
		
	}

}
