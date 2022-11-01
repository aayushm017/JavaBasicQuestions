package Questions;
import java.util.*;

public class AreaCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a Circle = ");
        double radius = sc.nextDouble();

        double area =  Math.PI * (radius * radius);
        System.out.println("Area of Circle = " + area);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference/Perimeter of Circle = " + circumference);
    }
}
