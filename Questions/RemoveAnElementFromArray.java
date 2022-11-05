package Questions;
import java.util.Scanner;

public class RemoveAnElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be removed = ");
        int  del_n = sc.nextInt();
        int arr[] = {3, 6, 8, 90, 10};
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i] == del_n){
                for (int j = i; j < n - 1; j++){
                    arr[j] = arr[j+1];
                }
                count++;
                break;
            }
        }
        n--;
        if(count == 0){
            System.out.println("Element Not Found");
        }
        else{
            for (int i = 0; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
