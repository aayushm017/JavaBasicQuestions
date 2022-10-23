//Create a class which will contain  the variables 
//and three methods accept, calculate and display 
//for finding the values of sin, cos and tan for a given angle

import java.util.Scanner;

public class Angle {
    Scanner sc = new Scanner(System.in);
    float hypo, perpen, base, sin, cos, tan;

    void accept() {
        System.out.println("Write the 3 angles = ");
        hypo = sc.nextFloat();
        perpen = sc.nextFloat();
        base = sc.nextFloat();
    }

    void calculate() {
        sin = perpen / hypo;
        cos = base / hypo;
        tan = perpen / base;
    }

    void display() {
        System.out.println("Value of a given Angle = " + sin + ", " + cos + ", " + tan);
    }

    public static void main(String[] args) {
        Angle tri = new Angle();
        tri.accept();
        tri.calculate();
        tri.display();
    }
}
