//WAP to check a year is Leap year or not
package Questions;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year to find it is a Leap year or not? = ");
        int yr = sc.nextInt();

        if (yr % 4 == 0) {
            System.out.println(yr + " is a Leap Year");
        } else {
            System.out.println(yr + " is not a Leap Year");
        }
    }
}
