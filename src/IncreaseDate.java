import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IncreaseDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Date date = new Date();
SimpleDateFormat dateformat= new SimpleDateFormat("YYYY-MM-dd");
String currentDate = dateformat.format(date);
System.out.println("Current Date"+ currentDate);
Calendar c1 = Calendar.getInstance();
c1.add(Calendar.DAY_OF_MONTH, 1);
System.out.println(dateformat.format(c1.getTime()));

	}

}
