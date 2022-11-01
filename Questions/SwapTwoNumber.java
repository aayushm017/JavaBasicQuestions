package Questions;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 30, b = 80;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
