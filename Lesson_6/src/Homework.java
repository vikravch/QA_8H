import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Homework {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>(50);
		for (int i = 0; i < 50; i++) {
			arr.add(new Student(getRandomLong(100000, 300000),
					getRandomInt(20, 200)));
		}

		System.out.println(arr);
		
		Collections.sort(arr);
		
		for (Student student : arr) {
			System.out.println(student);
		}
	}

	private static long getRandomLong(long min, long max) {
		long res = (long) (Math.random() * (max - min) + min);
		return res;
	}

	private static int getRandomInt(int min, int max) {
		Random random = new Random();
		int res = random.nextInt(max - min) + min;
		return res;
	}
}
