package Questions;
import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BREADTH of a triangle = ");
        float br = sc.nextFloat();
        System.out.println("Enter HEIGHT of a triangle = ");
        float ht = sc.nextFloat();

        double area = (br*ht)/2;
        System.out.println("Area of triangle is = " + area +" cm^2");
    }
}
