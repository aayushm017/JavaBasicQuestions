package Questions;
import java.util.Scanner;

public class InsertAnElementInArray {
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 6, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be inserted = ");
        int n = sc.nextInt();
        System.out.println("Enter position at which you want to insert = ");
        int pos = sc.nextInt();

        for(int i = arr.length - 1; i >= pos - 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = n;

        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
