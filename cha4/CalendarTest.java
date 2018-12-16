import java.util.*;
import java.text.DateFormatSymbols;
import java.util.Locale;


public class CalendarTest{
	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		GregorianCalendar d = new GregorianCalendar();

		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);

		d.set(Calendar.DAY_OF_MONTH,1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);

		int firstDayOfWeek = d.getFirstDayOfWeek();
		int indent = 0;

		while(weekday!=firstDayOfWeek){
			indent ++ ;
			// current day in the month add the number
			d.add(Calendar.DAY_OF_MONTH,-1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}

		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		//System.out.println(weekdayNames[firstDayOfWeek]);

		do{
			System.out.printf("%4s",weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH,1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		while(weekday != firstDayOfWeek );
		System.out.println();

		do{
			System.out.print("    ");
			indent --;
		}while(indent>0);
		
		d.set(Calendar.DAY_OF_MONTH,1);
		weekday = d.get(Calendar.DAY_OF_WEEK);
		do{
			int day = d.get(Calendar.DAY_OF_MONTH);
			
			System.out.printf("%4d",day);
			if(today == day){
				System.out.print("*");
			}
			d.add(Calendar.DAY_OF_MONTH,1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			if(weekday == (firstDayOfWeek)){
				System.out.println();
			}

		}while(month == (d.get(Calendar.MONTH)));
	}
}