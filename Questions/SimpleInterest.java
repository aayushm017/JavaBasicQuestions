package Questions;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount in Rs. = ");
        float pri = sc.nextFloat();
        System.out.println("Enter the Rate of interest in % = ");
        float inter = sc.nextFloat();
        System.out.println("Enter the Time period in Days = ");
        int time = sc.nextInt();

        float SI = (pri * inter * time) / 100;
        System.out.println("Simple Interest = " + SI);
    }
}
