//WAP to generate odd numbers b/w a given range

public class OddNumberInRange {
    public static void main(String[] args) {
        for (int i = 100; i <= 125; i++) {
            if (i % 2 != 0) {
                System.out.println("OddNum b/w a Range= " + i);
            }
        }
    }
}
