
public class Main {
	
	public static void main(String[] args) {
		String name = null;
		String email = null;
		
		if (args.length > 0) {
			name = args[0];
			email = args[1];
		}
		
		System.out.println("name - " + name);
		System.out.println("email - " + email);
		
		Person person = new Person("Viktor",25);
		System.out.println(person);
		
		// String -> manager of char[]
		
		System.out.println("Hello".length());
		
		// StringBuilder vs String
		
	}

}
