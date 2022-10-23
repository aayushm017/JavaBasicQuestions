//Create a class which  will contain the variables and three
// methods  accept, calculate and display for find the sum 
//and average of a student who has appeared for three subjects

import java.util.Scanner;

public class Class1 {
    Scanner sc = new Scanner(System.in);
    int Hindi, English, Maths, total, avg, sum;

    void accept() {
        System.out.println("Marks of 3 subjects= ");
        System.out.println("HINDI = ");
        Hindi = sc.nextInt();
        System.out.println("ENGLISH = ");
        English = sc.nextInt();
        System.out.println("MATHS = ");
        Maths = sc.nextInt();
    }

    void calculate() {
        sum = Hindi + English + Maths;
        avg = (Hindi + English + Maths) / 3;
    }

    void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        Class1 res = new Class1();
        res.accept();
        res.calculate();
        res.display();
    }
}
