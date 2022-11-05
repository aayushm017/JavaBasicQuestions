package Questions;
import java.util.Scanner;

public class SpiralMatrixPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row = ");
        int m = sc.nextInt();
        System.out.println("Enter column = ");
        int n = sc.nextInt();
        System.out.println("Enter m * n matrices = ");
        int arr[][] = new int[m][n];
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int min_row = 0;
        int min_col = 0;
        int max_row = arr.length - 1;
        int max_col = arr[0].length - 1;
        int total = m * n;
        int count = 0;

        while (count < total) {
            // Left wall
            for (int i = min_row, j = min_col; i <= max_row && count < total; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            min_col++;

            // Bottom wall
            for (int i = max_row, j = min_col; j <= max_col && count < total; j++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            max_row--;

            // Right wall
            for (int i = max_row, j = max_col; i >= min_row && count < total; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            max_col--;

            // Top wall
            for (int i = min_row, j = max_col; j >= min_col && count < total; j--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            min_row++;
        }
    }
}
