import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/*System.out.println("Input:");
		String line = "";
		try {
			line = IOHelper.readFromConsole();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);

		int value = IOHelper.readFromConsoleInt();
		System.out.println(value);*/
		
		String str = "Hello mate! How are you? What's you today's mood?";
		printSymbols(str);
		
		HashMap<String,String> theme = new HashMap<>();
		theme.put("buttonColor", "dark");
		theme.put("background", "white");
		theme.put("errorTextColor", "red");
		System.out.println(theme);
		
		System.out.println(theme.get("background"));
		
		TreeMap<Character,Integer> map = new TreeMap<>();
		map.put('D', 3);
		map.put('C', 12);
		map.put('A', 1);
		map.put('B', 3);
		System.out.println(map);
		map.put('D', 13);
		System.out.println(map);
		map.putIfAbsent('B', 24);
		System.out.println(map);
		
		for(Character key:map.keySet()) {
			System.out.println(key);
		}
		for(Integer value:map.values()) {
			System.out.println(value);
		}
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(
					"key - "+entry.getKey()+
					" value - "+entry.getValue());
		}
		/*
	Character Integer
		 H -> 2
		 e -> 3
		 ...
		 */
	}
	
	/* Типы коллекций:
	 * List - список, индексация, неразрывность (ArrayList, LinkedList)
	 * Set - множество, нету индексации, уникальность (HashSet, LinkedHashSet, TreeSet)
	 * Map - словарь, ассоциативный массив, сочетание ключ + значение (HashMap)
	 */

	private static void printSymbols(String str) {
		HashMap<Character,Integer> statistic = new HashMap<>();
		
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			if (statistic.containsKey(charArr[i])) {
				int value = statistic.get(charArr[i]);
				value++;
				statistic.put(charArr[i], value);
			} else {
				statistic.put(charArr[i], 1);	
			}
			// charArr[i]
		}
		System.out.println(statistic);
	}

}
