
//The base class contains the variables ‘a’ and ‘b’ 
//and a function to accept both the variables. 
//One derived class contains a function to calculate the      
//area of a rectangle and display the result and the other 
//derived class contains a function to calculate the 
//perimeter of the rectangle and display the result.
import java.util.Scanner;

class BaseDer {
    float len, wid, area, per;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of a rectangle = ");
        len = sc.nextFloat();
        wid = sc.nextFloat();
    }
}

class Derived1 extends BaseDer {
    void calculateArea() {
        area = len * wid;
        System.out.println("Area of a rectangle = " + area);
    }
}

class Derived2 extends Derived1 {
    void calculatePerimeter() {
        per = 2 * (len + wid);
        System.out.println("Perimeter of a rectangle = " + per);
    }

    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        d2.accept();
        d2.calculateArea();
        d2.calculatePerimeter();
    }
}
