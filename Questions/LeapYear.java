package Questions;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year = ");
        int yr = sc.nextInt();

        if(yr % 4 == 0){
            System.out.println(yr + " is a Leap year");
        }else{
            System.out.println(yr + " is Not a Leap year");
        }
    }
}
