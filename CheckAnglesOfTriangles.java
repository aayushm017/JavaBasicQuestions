//WAP to find out the greatest angle of the triangle if the 
//angles is given by the user

import java.util.Scanner;

public class CheckAnglesOfTriangles {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter 3 angles of a Triangle");
        int a = triangle.nextInt();
        int b = triangle.nextInt();
        int c = triangle.nextInt();
        int total = a + b + c;

        if (total <= 180) {
            if (a > b)
                System.out.println(a + " degree is greater");
            else if (b > c)
                System.out.println(b + " degree is greater");
            else
                System.out.println(c + " degree is greater");
        } else {
            System.out.println("Inaccurate Triangle");
        }
    }
}
