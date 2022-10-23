//WAP to generate 1,4,9,16,12,...,100

public class Series1 {
    public static void main(String[] args) {
        int series = 1, i = 3;
        while (series <= 100) {
            System.out.print(" " + series);
            series = series + i;
            i = i + 2;
        }
    }
}
