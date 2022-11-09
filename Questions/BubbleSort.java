package Questions;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {222, 94, 6, 77, 8, 9, 17, 66};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag++;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }
}
