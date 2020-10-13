import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeHelper {
	
	public static String getCurrentTime() {
		long currentTime = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z");
		Date date = new Date(currentTime);
		String res = sdf.format(date);
		return res;
	}
}
