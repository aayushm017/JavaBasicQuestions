package Questions;

public class FindMinNumberInArray {
    public static void main(String[] args) {
        int arr[] = {33, 6, 7 ,8, 888, 3, 323};
        int min = arr[0];

        for(int i=1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number = " +  min);
    }
}
