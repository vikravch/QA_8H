import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogHelper {
	
	public static void log(String message) {
		System.out.println(TimeHelper.getCurrentTime()+
				message);
	}
	
	public static void file(String message) {
		File file = new File("log.txt");
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.append(TimeHelper.getCurrentTime()+
				message+"\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
