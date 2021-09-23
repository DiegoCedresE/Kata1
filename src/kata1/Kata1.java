package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {
    //test
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2018, 9, 24);
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }

}
