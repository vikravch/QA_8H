import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1 -> Add new book \REQUIRE - all fields of Book class\
		 * 2 -> Get info about book \REQUIRE - id:int\
		 * 3 -> Print all library
		 * 0 -> exit from our app
		 * */
		Library library = new Library();
		while(true) {
			System.out.println("Please select one option:");
			System.out.println("1 -> Add new book \\REQUIRE - all fields of Book class\\");
			System.out.println("2 -> Get info about book \\REQUIRE - id:int\\");
			System.out.println("3 -> Print all library");
			System.out.println("0 -> exit from our app");
			int itemValue = IOHelper.readFromConsoleInt();
			
			if(itemValue==0) {
				System.out.println("Bye!!!");
				break;
			} else if(itemValue==1) {
				System.out.println("Please input id:");
				int id = IOHelper.readFromConsoleInt();
				
				System.out.println("Please input name:");
				String name = "";
				try {
					name = IOHelper.readFromConsole();
				} catch (IOException e) {
					System.out.println("Something wrong with console");
				}
				
				System.out.println("Please input status:");
				int status = IOHelper.readFromConsoleInt();
				Book book = new Book(id,name,status);
				library.addBook(book);
			} else if(itemValue==2) {
				System.out.println("Please input id:");
				int id = IOHelper.readFromConsoleInt();
				library.printBook(id);
			} else if(itemValue==3) {
				library.printLibrary();
			}
		}
		
	}

}
