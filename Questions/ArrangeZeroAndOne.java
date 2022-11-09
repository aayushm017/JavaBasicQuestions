package Questions;

public class ArrangeZeroAndOne {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 0};

        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > i; j--){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
