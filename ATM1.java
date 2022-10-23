import java.util.Scanner;

class ATM1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount to Withdraw = ");
        float cash = sc.nextFloat();
        System.out.println("Balance= ");
        float bal = sc.nextFloat();

        if (cash % 5 == 0) {
            System.out.println("Cash accepted!!");
            float total = cash + 0.50f;
            bal = bal - total;
            System.out.println("Remaining Balance = " + bal);
        } else {
            System.out.println("Amount is not Divisible by 5= " + bal);
        }

    }
}
