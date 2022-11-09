package Questions;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 66, 2, 5 ,3 ,2 ,111, 565, 56, 8};
        int min, temp = 0;
        for(int  i = 0; i < arr.length; i++){
            min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
