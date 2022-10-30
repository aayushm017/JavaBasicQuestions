package Questions;
import java.util.*;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        //if celcius to fahrenheit

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter temperature in Celcius = ");
//        float celcius = sc.nextInt();
//
//        float fahrenheit = (9 * celcius)/5 + 32;
//        System.out.println("Fahrenheit  = " + fahrenheit);


        //if fahrenheit to celcius then C = (F - 32)5 /9

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit = ");
        float fahrenheit = sc.nextFloat();

        float celcius = (fahrenheit - 32) * 5  / 9;
        System.out.println("Celcius  = " + celcius);
    }
}


