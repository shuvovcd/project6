import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {

    public static int daysBetween(int year_from, int month_from, int day_from, 
                                  int year_to, int month_to, int day_to) {
        
        LocalDate dateFrom = LocalDate.of(year_from, month_from, day_from);
        LocalDate dateTo = LocalDate.of(year_to, month_to, day_to);
        
        long days = ChronoUnit.DAYS.between(dateFrom, dateTo);
        
        return (int) Math.abs(days);
    }

    public static void main(String[] args) {
        int result = daysBetween(2023, 1, 1, 2023, 12, 31);
        System.out.println("Days between: " + result);
    }
}
