import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Please input filename:");
		String fileName = IOHelper.readFromConsole();
		
		System.out.println("Please input content:");
		String content = IOHelper.readFromConsole();
		
		IOHelper.writeToFile(fileName, content, false);
	}

}