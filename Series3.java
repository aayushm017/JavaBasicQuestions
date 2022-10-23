//WAP to generate 1,2,4,8,16,....1024

public class Series3 {
    public static void main(String[] args) {
        int i = 1, series = 1;
        while (series <= 1024) {
            System.out.print("  " + series);
            series = series + i;
            i = series;
        }
    }
}
