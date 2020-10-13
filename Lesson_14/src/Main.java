import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Date currentDate = new Date(); // timestamp
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String currentDateStr = sdf.format(currentDate);  // Date -> String
		System.out.println(currentDateStr);
		
		String someTimeStamp = "2021.02.30";
		try {
			Date someDate = sdf.parse(someTimeStamp);  // String -> Date
			System.out.println(someDate.getTime());
			
			System.out.println(sdf.format(someDate)); // Date -> String
			
		} catch (ParseException e) {
			System.out.println("Wrong date format :(");
		}
		
		Calendar calendar = Calendar.getInstance(); // current timestamp
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		calendar.add(Calendar.HOUR_OF_DAY, 10);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		calendar.add(Calendar.HOUR_OF_DAY, -10);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		
		String firstTimeStamp = "01.01.1995";
		String secondTimeStamp = "21.12.2018";
	
		SimpleDateFormat sdfSecond = new SimpleDateFormat("dd.MM.yyyy");
		
		try {
			Date firstDate = sdfSecond.parse(firstTimeStamp);
			Calendar firstCalendar = Calendar.getInstance();
			firstCalendar.setTime(firstDate);
			
			Date secondDate = sdfSecond.parse(secondTimeStamp);
			Calendar secondCalendar = Calendar.getInstance();
			secondCalendar.setTime(secondDate);
			
			System.out.println(firstDate.compareTo(secondDate)); // -1
			System.out.println(firstCalendar.compareTo(secondCalendar)); // -1
			
			System.out.println(firstCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println(firstCalendar.toString());
			
			firstCalendar.set(2020,10,13);
			System.out.println(firstCalendar.get(Calendar.YEAR));
			
			Calendar grCal = new GregorianCalendar();
			grCal.set(2015, 2, 8);
			System.out.println(sdfSecond.format(grCal.getTime()));
			
		} catch(ParseException ex) {
			ex.printStackTrace();
		}
	}

}
