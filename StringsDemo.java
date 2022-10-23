
/* String Basics


import java.util.Scanner;
public class StringsDemo {
    public static void main(String[] args) {
        char arr[]={'C', 'o', 'd', 'i', 'n', 'g'};
        String str1="Co di ng";
        String str2=" is fun";
        String str3="Coding";
        System.out.println(str1.length());    //Length of the string
        System.out.println(str1.charAt(2)) ;  // Fetch the charecter from the same index
//        str1=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3)); //str1==str3 then O/P=0 else it will return the ASCII gap between the charecters.
        System.out.println(str1.contains("ing"));  // it checks that the string contains the charecters(ing)
        System.out.println(str1.substring(2));  //selects the string index and print it along with other indexes.
        String substr=str1.substring(1,5);  //in this format 5th index will be inclusive it will not be printed.
        System.out.println(substr);

        Scanner sc=new Scanner(System.in);
        String str=sc.next(); //next will not include the space, it will stop the line before space.
        System.out.println(str+" "+str.length());
        String str5=sc.nextLine(); // it will include everything till \n space also..
        System.out.println(str5+" "+str5.length());
        }
}
*/

// Print all chars of string in separate lines
/*
import java.util.Scanner;

public class StringsDemo
{
    public static void printChars(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String= ");
        String str=sc.nextLine();
        printChars(str);
    }
}
*/


/* Count the number of Words


import java.util.Scanner;

public class StringsDemo
{
    public static int countWords(String str){
        if(str.length()==0){
            return 0;
        }
        int spaces=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
                ++spaces;
            }
        }
        return spaces+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type words= ");
        String str=sc.nextLine();
        int count= countWords(str);
        System.out.println(count);
    }
}
*/

/* Reverse String

public class StringsDemo {
    public static String reverseString(String str){
        String reverseString="";
        for(int i=str.length()-1; i>=0; i--){  //reversing the string
            reverseString+=str.charAt(i);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        String str="abcde";
        String reversedString=reverseString(str);
        System.out.println(reversedString);
    }
}
*/

/*    Strings Palindrome Number

public class StringsDemo {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                ++left;
                --right;
            }
        }
        return true;
    }
        public static void main(String[] args) {
            String str = "aayush";
            System.out.println(isPalindrome(str));
        }
}
*/


/* Substring Hint

//p,q,r,s
pq,qr,rs
pqr,qrs
pqrs
 */

