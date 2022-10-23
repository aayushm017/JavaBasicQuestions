/* Input and Printing 2d array

import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows= ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns= ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the number of rows= "+ rows +" and columns= "+cols);
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
*/

/* Input and Printing 2d array with functions
import java.util.*;

public class TwoDArray {
    public static void printArray(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows= ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns= ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the number of rows= "+ rows +" and columns= "+cols);
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] takeInp=takeInput();
        printArray(takeInp);
    }
}
*/

/* LARGEST COLUMN SUM */
import java.util.*;

public class TwoDArray {
    public static int largestCol(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0; j<cols; j++){
            int sum=0;
            for(int i=0; i<rows; i++){
                sum=sum+arr[i][j];
            }
           if(sum>largest){
           largest =sum;
           }
        }
        return largest;
    }

    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows= ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns= ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the number of rows= "+ rows +" and columns= "+cols);
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] takeInp=takeInput();
        int sum=largestCol(takeInp);
        System.out.println("Largest Column Sum= "+ sum);
    }
}
