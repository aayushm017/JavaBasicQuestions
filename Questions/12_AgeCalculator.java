package Questions;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1999, 12,17);
        int years = Period.between(birthDate, today).getYears();

        System.out.println("D.O.B = " + birthDate);
        System.out.println("Today's Date = " + today);
        System.out.println("I am " + years + " years old");
    }
}
