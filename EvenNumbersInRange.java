//Wap to generate even numbers in a given Range

public class EvenNumbersInRange {
    public static void main(String[] args) {
        for (int i = 100; i <= 125; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenNum b/w a Range = " + i);
            }
        }
    }
}
