package Questions;

public class MergeAndSort {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 6, 8};
        int b[] = {3, 5, 7, 8, 9};
        int c[] = new int[a.length + b.length];
        int temp = 0;

        for(int  i = 0; i < a.length ; i++){
            c[i] = a[i];
        }
        for(int  i = 0; i < b.length ; i++){
            c[a.length + i] = b[i];
        }
        for(int  i = 0; i < c.length ; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println(" "); //if any printing is happening after this, then it will print in the next line.

        //Sort
        for(int i = 0; i < c.length; i++){
            for(int j = i + 1; j < c.length; j++){
                if(c[i] > c[j]){
                   temp = c[i];
                   c[i] = c[j];
                   c[j] = temp;
                }
            }
        }
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}
