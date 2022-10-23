//WAP to generate 1,8,27,64,125,...,1000

public class Series2 {
    public static void main(String[] args) {
        int i = 1, series = 1;
        while (i <= 10) {
            series = i * i * i;
            System.out.print("  " + series);
            i++;
        }
    }
}
