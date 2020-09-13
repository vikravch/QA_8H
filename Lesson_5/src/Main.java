import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		People people = new People();
		
		ArrayList<People> sportsMans = new ArrayList<>();
		sportsMans.add(new SportsMan("fsdfsd",190,25,0,100));
		sportsMans.add(new SportsMan("gdfgdf",175,28,0,89));
		sportsMans.add(new SportsMan("tertret",180,30,0,110));
		
		System.out.println(sportsMans);
		for(People item: sportsMans) {
			System.out.println(item);
		}
		
		ArrayList<Runner> runners = new ArrayList<>();
		for(int i=0; i<30; i++) {
			runners.add(
					new Runner("Name "+i,
							getRandomInt(150,220),
							getRandomInt(18,80),
							0, 0, 
							getRandomLong(10000l,40000L))
					);
		}
		
		for(Runner runner:runners) {
			System.out.println(runner);
		}
		
		long min = 10000;
		long max = 50000;
		long res =(long) (Math.random()*(max-min) + min);
		System.out.println(res);
		
		Collections.sort(runners);
		System.out.println("-----------------------------------------------");
		for(Runner runner:runners) {
			System.out.println(runner);
		}
		
		int[] array = {53,55,21,32,565,32,34};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		
		String[] arrStr = {"frewr","wewr","lrwe","awe","oew"};
		bubbleSortString(arrStr);
		System.out.println(Arrays.toString(arrStr));
		
		String str1 = "AAA";
		String str2 = "BBBB";
		String str3 = "AAAA";
		str1.compareTo(str2);
		/* 
		 * str1>str2 -> str1.compareTo(str2) = 1  >0
		 * str1<str2 -> str1.compareTo(str2) = -1 <0
		 * str1==str2 -> str1.compareTo(str2) = 0 
		 */
	}
	static void bubbleSortString(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                //if (arr[j] > arr[j+1])
            	if(arr[j].compareTo(arr[j+1])>0)
                {
                    // swap temp and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 

	private static long getRandomLong(long min, long max) {
		long res =(long) (Math.random()*(max-min) + min);
		return res;
	}

	private static int getRandomInt(int min, int max) {
		Random random = new Random();
		int res = random.nextInt(max-min)+min;
		return res;
	}

}



