package Questions;
import java.util.*;

public class RoundANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal point number = ");
        double dec = sc.nextDouble();

        System.out.format("Round Number = %.2f", dec);
    }
}
