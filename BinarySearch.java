
public class BinarySearch
{
    public static int binSearch(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < n) {
                start = mid + 1;
            } else if (arr[mid] > n) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 9, 16, 34, 89, 90, 95, 99, 105, 110 };
        int searchResult = binSearch(arr, 95);
        System.out.println("Index is " + searchResult);
    }
}
