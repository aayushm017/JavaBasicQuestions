
//The base class contains the variables ‘p’ and ‘r’ 
//and a function to accept both the variables.
//The derived class contains the variable t and a 
//function to calculate the simple interest and display
// the result. There should be four derived classes for
// calculating for 1 year, 2 year, 3 year and 4 years

import java.util.Scanner;

class SimpleInt4yrs {
    float p, r;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate and principle");
        r = sc.nextFloat();
        p = sc.nextFloat();
    }
}

class Der1 extends SimpleInt4yrs {
    float t, a;

    void calculate1() {
        a = (p * r * t) / 100;
        System.out.println("Simple interest of 1st year = " + a);
    }

    public static void main(String[] args) {
        Der1 d2 = new Der1();
        d2.accept();
        d2.calculate1();
    }
}
/*
 * class Derived2 {
 * 
 * }
 * 
 * class Derived3 {
 * 
 * }
 * 
 * class Derived4 {
 * 
 * }
 */