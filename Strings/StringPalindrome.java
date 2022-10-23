package Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String x = "too Hot to HOT";   //1> Create a String object with x as the reference
        x = x.replace(" ", "");
        x = x.toLowerCase();

        //Copy one String into another
        char[] y =  x.toCharArray();   //2> Extract the data from string object and place in a character y.
        int size = y.length;           //3> Compute length of Array y.
        char[] a = new char[size];     //4> Create a new Array a with size same as y.

        int i = 0;                     //5>Create an index variable i and initialize to 0.
        while(i!=size){
            a[size-1-i] = y[i];        //6> Copy the data from y array to a array. a[i]=y[i]
            i++;
        }

        //Checking Palindrome or not
        i=0;
        while(i!=size){
            if(a[i]!=y[i]){
                System.out.println("Not a palindrome string");
                System.exit(0);         //will print the above statement once
            }else{
                i++;
                continue;
            }
        }
        System.out.println("Palindrome");
    }
}
