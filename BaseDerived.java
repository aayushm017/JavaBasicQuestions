
//The base class contains the variables ‘a’ and ‘b’
//and a function to accept both the variables.
//The derived class contains a variable ‘c’ and 
//the functions to add, subtract, multiply and divide 
//those two numbers and display the result.
import java.util.Scanner;

class Base {
    float a, b;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b = ");
        a = sc.nextFloat();
        b = sc.nextFloat();
    }
}

class Derived extends Base {
    float c;

    void add() {
        c = a + b;
        System.out.println("Add numbers a and b = " + c);
    }

    void sub() {
        c = a - b;
        System.out.println("Subtract numbers a and b = " + c);
    }

    void mul() {
        c = a * b;
        System.out.println("Multiply numbers a and b = " + c);
    }

    void div() {
        c = (a / b);
        System.out.println("Divide numbers a and b = " + c);
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.accept();
        d.add();
        d.sub();
        d.mul();
        d.div();
    }
}
