//WAP to generate 1,10,2,9,3,8,4,...,10,1

public class Series4 {
    public static void main(String[] args) {
        int i = 1, series = 10;
        while (i <= 10) {
            System.out.print(i + " " + series + " ");
            i++;
            series--;
        }
    }
}
