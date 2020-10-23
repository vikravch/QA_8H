import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class IOHelper {
	
	// 1. write to file
	// 2. read from file
	// 3. read from console string
	// 4. read from console int - safety
 	// 5. copy file local
	// 6. copy file from internet
	
	public static void writeToFile(
			String fileName, String content, boolean isAppend) throws IOException {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file, isAppend);
		fw.append(content);
		fw.close();
	}
	
	public static String readFromFile(String fileName) throws IOException {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String nextLine = "";
		StringBuilder sb = new StringBuilder();
		while((nextLine=br.readLine())!=null) {
			sb.append(nextLine+"\n");
		}
		br.close();
		return sb.toString();
	}
	
	// srcFileName -> (InputStream) -> IOHelper.java -> (OutputStream) -> destFileName
	public static void copyFile(String srcFileName, String destFileName) throws IOException {
		InputStream is = new FileInputStream(srcFileName);
		OutputStream os = new FileOutputStream(destFileName);
		byte[] buffer = new byte[1000];
		int length = 0;
		while((length = is.read(buffer))>0) {
			os.write(buffer, 0, length);
		}
		is.close();
		os.close();
	}
	
	public static void loadFile(String fileUrl, String destFileName) throws IOException {
		URL url = new URL(fileUrl);
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		
		OutputStream os = new FileOutputStream(destFileName);
		byte[] buffer = new byte[1000];
		int length = 0;
		while((length = is.read(buffer))>0) {
			os.write(buffer, 0, length);
		}
		is.close();
		os.close();
	}
	
	/*public static String readFromConsole() {
		Scanner scanner = new Scanner(System.in);
		String res = scanner.nextLine();
		scanner.close();
		return res;
	}*/
	public static String readFromConsole() 
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String res = br.readLine();
		return res;
	}
	
	public static int readFromConsoleInt() {
		try {
			String inStr = readFromConsole();
			int res = Integer.parseInt(inStr);
			return res;
			
		} catch (IOException e) {
			return 0;
		} catch (NumberFormatException e) {
			System.out.println("Error, please try again:");
			return readFromConsoleInt();
		}
	}
}

