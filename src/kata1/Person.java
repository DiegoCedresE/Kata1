package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

    //test
public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        int today = Period.between(birthdate, LocalDate.now()).getYears();
        return today;
        
      // return (int) (milliSecondsToYear(today.getTimeInMillis()) - birthdate.getTimeInMillis());
    }
    
    private long milliSecondsToYear(long milles){
        return milles;
    }

}
