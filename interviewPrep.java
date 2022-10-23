/*               All Binary search Problems here


Find position of an element in a sorted array of infinite numbers??

public class interviewPrep {
    public static int ans(int arr[], int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println("Target Index= " + ans(arr, target));
    }
}
*/

/* Peak index mountain array 

class interviewPrep {
    public static int peakIndexMountainArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 7, 6, 3, 2 };
        int index = peakIndexMountainArray(arr);
        System.out.println(index);
    }
}
*/
/********************************************** */

//*********RECURSION********/

//TODO: Question LEETCODE: 1342
// Return the steps that shows how many many times a number is divided or
// subtracted so to make 0..

class interviewPrep{
    public static void main(String[] args) {
        System.out.println(numberOfSteps(148));
    }
    public static int numberOfSteps(int num){
        return helper(num, 0);
    }
    //TODO: special pattern, how to pass a number to above calls
    public static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}



















