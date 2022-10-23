//WAP to find out whether the person is below weight, 
//normal weight or above weight if his weight is taken 
//from the user. If the weight is less than 40 consider it as 
//below weight, If it is more than 80 consider it as over weight,
//if the weight is between 40 to 80 both inclusive consider it as
// normal weight

import java.util.Scanner;

public class WeightDistribution {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        System.out.println("Enter your Weight = ");
        int PersonWeight = weight.nextInt();

        if (PersonWeight <= 40) {
            System.out.println("Below Weight");
        } else if (PersonWeight > 40 && PersonWeight <= 80) {
            System.out.println("Normal Weight");
        } else if (PersonWeight > 80) {
            System.out.println("Above Weight");
        }
    }
}
