package Questions;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {3, 3, 5, 8, 9, 9, 11, 11};
        int temp[] = new int[arr.length];
        int j = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1]; //print the last element to temp[j] array which is left in the arr[i]

        for (int i = 0 ; i < arr.length; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
