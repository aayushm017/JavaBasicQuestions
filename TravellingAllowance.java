//WAPto find the travelling allowance for a employee.
// The company gives the traveling allowance on the following table
//Distance  Amount
//<=20  Rs. 200
//>20 & <=50 Rs 200 + Rs 3 per extra kilometer above 20
//>50 & <=100 Rs 500 + Rs 3 per extra kilometer above 50
//>100  Rs 10 per kilometer

import java.util.Scanner;

public class TravellingAllowance {
    public static void main(String[] args) {
        Scanner travel = new Scanner(System.in);
        System.out.println("Enter Distance in kilometers you Travel = ");
        int allowance = travel.nextInt();
        int basic_allowance = 200;

        if (allowance <= 20) {
            System.out.println("Allowance given Rs." + basic_allowance);
        }
        if (allowance > 20 && allowance <= 50) {
            allowance -= 20;
            basic_allowance += (allowance * 3);
            System.out.println("Allowance = Rs." + basic_allowance);
        } else if (allowance > 50 && allowance <= 100) {
            basic_allowance = 500;
            allowance -= 50;
            basic_allowance += (3 * allowance);
            System.out.println("Allowance = Rs." + basic_allowance);
        } else if (allowance >= 100) {
            basic_allowance = 500;
            allowance -= 100;
            basic_allowance += (10 * allowance);
            System.out.println("Allowance = Rs." + basic_allowance);
        }
    }
}
