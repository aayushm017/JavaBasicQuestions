package Questions;
import java.util.Scanner;

public class RemoveIndexFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index position which will be deleted = ");
        int del_index = sc.nextInt();
        int arr[] = {2, 10, 8, 22, 34, 19, 3};
        int n = arr.length;

        for(int i = del_index; i < n - 1; i++){
            arr[i] = arr[i+1];
        }
        n--; // automatically removing the elements from arr.length-1

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
