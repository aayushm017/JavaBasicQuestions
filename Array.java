
/*
 * public class Array {
 * public static void main(String[] args) {
 * int[] ros;
 * ros = new int[5];
 * System.out.println(ros[4]);
 * String[] arr = new String[4];
 * System.out.println(arr[0]);
 * }
 * }
 */
/*
 * Some important Syntax's:-
 * import java.util.Arrays;
 * import java.util.Scanner;
 * 
 * public class Array {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * // Array of primitives
  int[] arr = new int[5];
 * //arr[0] = 3;
 * //arr[1] = 423;
 * //arr[2] = 76;
 * //arr[3] = 6;
 * //arr[4] = 89;
 * 
 * // System.out.println(arr[3]);
 * // input using for loops
 * // for (int i = 0; i < arr.length; i++) {
 * // arr[i] = sc.nextInt();
 * // }
 * // System.out.println(Arrays.toString(arr));
 * 
  for (int i = 0; i < arr.length; i++) {
 System.out.print(arr[i] + " ");
  }
 * 
 * //Enhanced for-loop
 * // for (int num : arr) {
 * // System.out.print(num + " ");
 * // }
 * 
 * // Array of Objects
 * String[] str = new String[4];
 * for (int i = 0; i < str.length; i++) {
 * str[i] = sc.next();
 * }
 * System.out.println(Arrays.toString(str));
 * 
 * // modify
 * str[2] = "aayush";
 * System.out.println(Arrays.toString(str));
 * }
 * }
 */
/*
 * Change the number in an Array.
 * import java.util.*;
 * 
 * public class Array {
 * public static void main(String[] args) {
 * int nums[] = { 3, 4, 5, 12 };
 * System.out.println(Arrays.toString(nums));
 * change(nums);
 * System.out.println(Arrays.toString(nums));
 * }
 * 
 * static void change(int[] arr) {
 * arr[3] = 99;
 * }
 * }
 */

/*
 * 2-D Array
 * import java.util.*;
 * 
 * class MutliDArray {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int[][] arr = new int[3][3];
 * System.out.println(arr.length);
 * 
 * // Input
 * for (int row = 0; row < arr.length; row++) {
 * 
 * for (int col = 0; col < arr[row].length; col++) {
 * arr[row][col] = sc.nextInt();
 * }
 * }
 * 
 * // Output
 * // for (int row = 0; row < arr.length; row++) {
 * 
 * // for (int col = 0; col < arr[row].length; col++) {
 * // System.out.print(arr[row][col] + " ");
 * // }
 * // System.out.println();
 * // }
 * 
 * // OR
 * // Output
 * // for (int row = 0; row < arr.length; row++) {
 * // System.out.println(Arrays.toString(arr[row]));
 * // }
 * 
 * // Or Output as Enhanced for-loop
 * for (int[] a : arr) {
 * System.out.println(Arrays.toString(a));
 * }
 * 
 * }
 * }
 */

/*
 * Requirement of arr[row].length is to print different size of rows in an
 * arrays
 * 
 * class MutliDArray {
 * public static void main(String[] args) {
 * int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 4 }, { 1, 5 } };
 * 
 * for (int row = 0; row < arr.length; row++) {
 * 
 * for (int col = 0; col < arr[row].length; col++) {
 * System.out.print(arr[row][col] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */
/*
 * One dimensional ArrayList
 * import java.util.Scanner;
 * import java.util.ArrayList;
 * 
 * public class Array {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * ArrayList<Integer> list = new ArrayList<>();
 * 
 * // list.add(32);
 * // list.add(12);
 * // list.add(35);
 * // list.add(82);
 * // list.add(52);
 * // list.add(388);
 * // list.add(355);
 * // list.add(334);
 * // list.add(329);
 * // list.add(334);
 * // System.out.println(list.contains(38));
 * // list.set(0, 99);
 * // list.remove(2);
 * // System.out.println(list);
 * 
 * // input
 * for (int i = 0; i < 5; i++) {
 * list.add(sc.nextInt());
 * 
 * // get item in an index
 * for (i = 0; i < 5; i++) {
 * System.out.println(list.get(i)); // pass index here, list[index] syntax will
 * not work here.
 * }
 * System.out.println(list);
 * }
 * }
 * }
 */

/*
 * MultiDimensional ArrayList
 * import java.util.*;
 * 
 * public class Array {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * ArrayList<ArrayList<Integer>> list = new ArrayList<>();
 * 
 * // initialization
 * for (int i = 0; i < 3; i++) {
 * list.add(new ArrayList<>());
 * }
 * 
 * // add elements
 * for (int i = 0; i < 3; i++) {
 * for (int j = 0; j < 3; j++) {
 * list.get(i).add(sc.nextInt());
 * }
 * }
 * System.out.println(list);
 * }
 * }
 */

/*
 * reverse an Array
 * public class Array {
 * public static void main(String[] args) {
 * int arr[] = { 12, 55, 67, 4, 3 };
 * // swap(arr, 0, 3);
 * reverse(arr);
 * System.out.println(Arrays.toString(arr));
 * }
 * 
 * static void reverse(int arr[]) {
 * int start = 0;
 * int end = arr.length - 1;
 * while (start < end) {
 * swap(arr, start, end);
 * start++;
 * end--;
 * }
 * }
 * 
 * static void swap(int arr[], int index1, int index2) {
 * int temp = arr[index1];
 * arr[index1] = arr[index2];
 * arr[index2] = temp;
 * }
 * }
 */
/*
 * MAX VALUE IN AN ARRAY
 * class Array {
 * public static void main(String[] args) {
 * int arr[] = { 23, 66, 74, 323, 89 };
 * System.out.println(maxVal(arr, 0, 4));
 * }
 * 
 * static int maxVal(int arr[], int start, int end) {
 * int Max = arr[start];
 * for (int i = start; i <= end; i++) {
 * if (arr[i] > Max) {
 * Max = arr[i];
 * }
 * }
 * return Max;
 * }
 * }
 */
/*
 * class Array {
 * public static void main(String[] args) {
 * int arr[] = { 12, 5, 6, 788, 3 };
 * System.out.println(max(arr));
 * }
 * 
 * static int max(int arr[]) {
 * int maxVal = 0;
 * for (int i = 1; i < arr.length; i++) {
 * if (arr[i] > maxVal) {
 * maxVal = arr[i];
 * }
 * }
 * return maxVal;
 * }
 * }
 */

// CODING NINJA

/*
 * Initializing an Array
 * import java.util.Scanner;
 * 
 * class Array {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter number of elements = ");
 * int n = sc.nextInt();
 * int a[] = new int[n];
 * 
 * for (int i = 0; i < n; i++) {
 * System.out.print("Enter element at " + i + "th index = ");
 * a[i] = sc.nextInt();
 * }
 * for (int i = 0; i < n; i++) {
 * System.out.println(a[i]);
 * }
 * }
 * }
 */

/*
  Initializing Array using Functions
  import java.util.Scanner;
  
  class Array {
  public static int[] takeArray() {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of elements = ");
  int n = sc.nextInt();
  int arr[] = new int[n];
  
  for (int i = 0; i < n; i++) {
  System.out.print("Enter element at " + i + "th index = ");
  arr[i] = sc.nextInt();
  }
  return arr;
  }
  
  public static void printArray(int arr[]) {
  int n = arr.length;
  for (int i = 0; i < n; i++) {
  System.out.println(arr[i]);
  }
  }
  
  public static void main(String[] args) {
  int arr[] = takeArray();
  printArray(arr);
  }
  }
 /
 
/*
 * Finding the largest number
 * import java.util.Scanner;
 * 
 * class Array {
 * public static int[] takeArray() {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter number of elements = ");
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * 
 * for (int i = 0; i < n; i++) {
 * System.out.print("Enter element at " + i + "th index = ");
 * arr[i] = sc.nextInt();
 * }
 * return arr;
 * }
 * 
 * public static int largest(int arr[]) {
 * int max = Integer.MIN_VALUE;
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] > max) {
 * max = arr[i];
 * }
 * }
 * return max;
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = takeArray();
 * int max = largest(arr);
 * System.out.println(max);
 * }
 * }
 */
/*
 * Add the elements in an array
 * import java.util.Scanner;
 * 
 * class Array {
 * public static int[] takeInput() {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter number of elements = ");
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * 
 * for (int i = 0; i < n; i++) {
 * System.out.print("Enter element at " + i + "th index = ");
 * arr[i] = sc.nextInt();
 * }
 * return arr;
 * }
 * 
 * public static int sum(int arr[]) {
 * int result = 0;
 * for (int i = 0; i < arr.length; i++) {
 * result = result + arr[i];
 * }
 * return result;
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = takeInput();
 * int res = sum(arr);
 * System.out.println(res);
 * }
 * }
 */
/*
 * Print All Pairs
 * class Array {
 * public static void printAllPairs(int arr[]) {
 * int n = arr.length;
 * for (int i = 0; i < n - 1; i++) {
 * for (int j = i + 1; j < n; j++) {
 * System.out.println("(" + arr[i] + "," + arr[j] + ")");
 * }
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 1, 2, 4, 7, 9 };
 * printAllPairs(arr);
 * }
 * }
 */
/*
 * Arrange in an aarray
 * class Array {
 * public static void arrange(int[] arr) {
 * int n = arr.length;
 * int left = 0;
 * int right = n - 1;
 * int counter = 1;
 * 
 * while (left <= right) {
 * if (counter % 2 == 1) {
 * arr[left] = counter;
 * counter += 1;
 * left++;
 * System.out.print(left);
 * } else {
 * arr[right] = counter;
 * counter += 1;
 * right--;
 * System.out.print(right);
 * }
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 1, 3, 5, 6, 4, 2 };
 * arrange(arr);
 * }
 * }
 */
/*
 * Alternate
 * class Array {
 * public static void Alternate(int arr[]) {
 * int n = arr.length;
 * for (int i = 0; i < n - 1; i = +2) {
 * int temp = arr[i];
 * arr[i] = arr[i + 1];
 * arr[i + 1] = temp;
 * System.out.println(arr[i]);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 2, 7, 34, 12, 5, 3, 6 };
 * Alternate(arr);
 * }
 * }
 */

/*******
 * Ceiling of a number (Same as Binary Search)
 * 
 * public class Array {
 * public static int binSearch(int arr[], int n) {
 * int start = 0;
 * int end = arr.length - 1;
 * 
 * while (start <= end) {
 * int mid = (start + end) / 2;
 * if (arr[mid] < n) {
 * start = mid + 1;
 * } else if (arr[mid] > n) {
 * end = mid - 1;
 * } else {
 * return mid;
 * }
 * }
 * return start;
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 5, 9, 16, 34, 89, 90, 95, 99, 105, 110 };
 * int index = binSearch(arr, 29);
 * System.out.println("Index is " + index);
 * }
 * }
 */

// public class Array {
//     public static int binSearch(char[] letters, char target) {
//         int start = 0;
//         int end = letters.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (letters[mid] == target)
//                 return mid;
//             else if (letters[mid] > target)
//                 end = mid - 1;
//             else
//                 start = mid + 1;
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         char letters[] = { 'c', 'f', 'j' };
//         int index = binSearch(letters, 'k');
//         System.out.println("Index is " + index);
//     }
// }

//   Example to print an Array
/*
public static void printArray(int arr[]){
int n=arr.length;
for(int i=0; i<n; i++){
  System.out.println(arr[i]);
}
}
public static void main(String[] args) {
  int arr[]={1,5,3,6,8,99};
  selectionSort(arr);
  printArray(arr);
}
*/