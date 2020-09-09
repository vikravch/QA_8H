import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		String str = "I am QA Engineer";
		char maxCh = maxChar(null);
		if (maxCh==0) {
			System.out.println("Error happend :(");
		} else {
			System.out.println(maxCh);			
		}
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.toString());
		System.out.println(list.size());
		
		list.add("Hello"); // 0
		list.add("now"); // 1
		list.add("is"); // 2
		list.add("a"); // 3
		list.add("brake"); // 4
		System.out.println(list);
		list.add("a");
		list.add("a");
		
		list.remove(0);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.remove("a");
		System.out.println(list);
		
		String res = list.remove(1);
		System.out.println(res);
		System.out.println(list);
		
		String value = list.get(1);
		System.out.println(value);
		System.out.println(list);
		
		boolean isDeleted = list.remove("a");
		System.out.println(isDeleted);
		System.out.println(list);
		
		list.add(1,"test");
		System.out.println(list);
		
		list.add(3,"text");
		System.out.println(list);
		
		//list.remove(10);
		/*for(int i=0; i<list.size(); i++) {
			list.remove(0);
		}*/
		
		/*while(list.size()>0) {
			list.remove(0);
		}*/
		//list.clear();
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static char maxChar(String str) {
		// 0. income values validation
		if (str==null || str.equals("")) {
			return 0;
		}
		// 1. get char array from String
		char[] array = str.toCharArray();
		
		// 2. get max value in char array
		char max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		// 3. return result
		return max;
	}

}
