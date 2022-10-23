import java.util.Scanner;
import java.util.Random;

class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int p1 = 0;
        int p2 = 0;
        System.out.println("How may chances?: ");
        int chances = sc.nextInt();
        for (int i = 1; i < chances; i++) {
            int pl1 = rand.nextInt(6) + 1;
            int pl2 = rand.nextInt(6) + 1;

            if (pl1 > pl2) {
                p1 += 1;
            } else if (pl1 < pl2) {
                p2 += 1;
            }
            System.out.printf("p1 score: %d\n  p2 score: %d\n", p1, p2);
        }
        if (p1 > p2) {
            System.out.println("player 1 won!");
        } else if (p1 < p2) {
            System.out.println("player 2 won!");
        } else {
            System.out.println("It was tie!");
        }
    }
}