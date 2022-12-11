package Questions;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {1, 4, 8, 10, 13, 17};
        int b[] = {2, 3, 5, 7, 9, 11, 12};
        int c[] = merge2SortedArray(a, b);
        printArray(c);
    }

    public static int[] merge2SortedArray(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < m){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < n){
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }

    public static void printArray(int c[]){
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}
