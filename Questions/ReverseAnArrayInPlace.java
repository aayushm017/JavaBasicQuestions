package Questions;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 8, 9, 3, 2, 8};
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          i++;
          j--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
