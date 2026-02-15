package Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateApi {
    public static void main(String[] args) {
    	
    	// issues with older version of date and time 
    	// date objects were mutable - could be changed , less thread safe , less convinient
    	// limited zones functionality
    	
    	
    	
        LocalDate date  = LocalDate.now();
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd---MM-yyyy");
        String output  = date.format(formatter);
        System.out.println(output);

        LocalDate daten = LocalDate.of(2500,05,02);
        System.out.println(daten.getMonth());
        System.out.println(daten.getDayOfMonth());
        
        daten.minusDays(25);
        daten.isAfter(date);
        
        
        // local time 
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        System.out.println(time.getLong(null));
        
        LocalTime timen = LocalTime.of(14, 30 , 30);
        System.out.println(timen.getHour());
        LocalTime.parse("15:30:30");
        
        
    }
}
