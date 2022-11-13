package Questions;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int arr[] = {45,67,8989,655,3232,11,556,7,89,88};
        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                if(arr[i] < arr[j]){              //if 2nd Smallest then arr[i] > arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i==1){   //for best time complexity just sort first 2 array and the print the result.
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");  // Print Sort an Array Asc/Desc.
        }
        System.out.println(" ");
        System.out.println("Second largest Element in an Array = " + arr[1]);
    }
}
