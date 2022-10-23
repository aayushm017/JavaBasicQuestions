//Write a program to find the bill for the telephone.
// The telephone charges Rs. 275 from all households 
//and allows 100 units free. If the unit exceeds 
//Rs.100 Rs. 2.00 is charged for extra unit above 
//100 along with Rs. 275

import java.util.Scanner;

public class FindTelephoneBill {
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        int basic_charge = 275;
        int free_units = 100;
        System.out.print("Enter Units of your Telephone Bill = Rs.");
        int units = bill.nextInt();

        if (units > basic_charge) {
            int extra = units - basic_charge;
            int extra_charge = extra * 2;
            int total = basic_charge + extra_charge;
            System.out.println("Total bill= Rs." + total);
        } else {
            System.out.println("Total bill is= Rs." + basic_charge);
        }
    }
}
