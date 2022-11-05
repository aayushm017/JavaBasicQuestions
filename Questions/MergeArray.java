package Questions;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 6, 8};
        int b[] = {3, 5, 7, 8, 9};
        int c[] = new int[a.length + b.length];

        for(int  i = 0; i < a.length ; i++){
            c[i] = a[i];
        }
        for(int  i = 0; i < b.length ; i++){
            c[a.length + i] = b[i];
        }
        for(int  i = 0; i < c.length ; i++){
            System.out.print(c[i] + " ");
        }
    }
}
