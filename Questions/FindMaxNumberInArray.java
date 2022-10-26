package Questions;

public class FindMaxNumberInArray {
    public static void main(String[] args) {
        int arr[] = {33, 6, 7 ,8, 888, 3, 323};
        int max = arr[0];

        for(int i=1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number = " +  max);
    }
}
