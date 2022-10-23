// WAP to generate even number from 100 to 80

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 100; i >= 80; i--) {
            if (i % 2 == 0) {
                System.out.print(i+ "," );
            }
        }
    }
}
