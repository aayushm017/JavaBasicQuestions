//WAP to generate odd numbers from 21-45

public class OddNumbers {

    public static void main(String[] args) {
        for (int i = 21; i <= 45; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers from 21-45 = " + i);
            }
        }
    }
}
