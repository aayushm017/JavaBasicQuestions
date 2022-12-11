package Questions;

public class FindMinNumberInArray {
    public static void main(String[] args) {
        int arr[] = {33, 6, 7 ,8, 888, 323};
        int min = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Smallest number = " +  min);
        System.out.println("Index of Smallest number = " + index);
    }
}
