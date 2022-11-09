package Questions;

public class CopyOneStringIntoAnother {
    public static void main(String[] args) {
        String x = "ABC TECH";
        char[] y = x.toCharArray();
        int size = y.length;
        int  i = 0;
        char a[] = new char[size];

        while(i != size){
            a[i] = y[i];
            i++;
        }
        System.out.println(y);
        System.out.println(a);
    }
}
