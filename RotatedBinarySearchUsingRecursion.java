public class RotatedBinarySearchUsingRecursion {
    public static int rbs(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return rbs(arr, target, s, m-1);
            }
            return rbs(arr, target, m+1, e);
        }

        if(target >= arr[m] && target <= arr[e]){
                return rbs(arr, target, m+1, e);
            }
            return rbs(arr, target, s, m-1);
    }


    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,30,90};
        System.out.println(rbs(arr, 30, 0, arr.length-1));
    }
}
