class LinearSearch {
    public static int search(int arr[], int val) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 60, 53, 76, 8, 4 };
        int val = 9;
        int result = search(arr, val);
        if (result == -1) {
            System.out.println("Element is not present in an Array");
        } else {
            System.out.println("Yes, element is present in " + result + "th index");
        }
    }
}