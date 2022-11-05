package Questions;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 2, 1, 6, 7, 9};
        int temp[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            temp[i] = arr[i];
            System.out.print(temp[i] + " ");
        }
    }
}
