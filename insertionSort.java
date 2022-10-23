public class insertionSort {
    public static void printArray(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void insertArray(int arr[]) 
    {
        for (int i = 1; i < arr.length; i++) {
            // Insert ith in sorted position
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            //position will be j+1
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 7, 100, 0, 3 };
        insertArray(arr);
        printArray(arr);
    }
}
















