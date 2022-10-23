//Create a constructor which will initialize the 
//values of the variable a= 5 and b=10 and
//display the values of a and b with a display function

public class Display {
    int a, b;

    Display(int a, int b) {
        System.out.println("Initializing a and b in display function");
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Display di = new Display(5, 10);
        System.out.println("a = " + di.a + ", b = " + di.b);
    }
}
