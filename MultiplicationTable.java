//WAP to generate the multiplication table of a given number in
// the following format. If the input number is 2 then the 
//output is
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//: : : : :
//2 * 10 = 20

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number for which u want a table");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
