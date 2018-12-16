import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class CalendarTest2 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.ENGLISH);

        
        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(Calendar.DAY_OF_MONTH);
        int month = gc.get(Calendar.MONTH);

   
        gc.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = gc.get(Calendar.DAY_OF_WEEK);

        int firstDayOfWeek = gc.getFirstDayOfWeek();


        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            gc.add(Calendar.DAY_OF_MONTH, -1);
            weekday = gc.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            gc.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gc.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);
        System.out.println();


        for (int i = 0; i < indent; i++) {
            System.out.print("    ");
        }

        gc.set(Calendar.DAY_OF_MONTH, 1);

        do {
            int day = gc.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            if (day == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            gc.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gc.get(Calendar.DAY_OF_WEEK);


            if (weekday == firstDayOfWeek) {
                System.out.println();
            }
        } while (gc.get(Calendar.MONTH) == month);
    }

}
