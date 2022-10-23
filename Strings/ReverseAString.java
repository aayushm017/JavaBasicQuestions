package Strings;

public class ReverseAString {
//    public static void main(String[] args) {
//        String name = "aayush";
//        int length = name.length();
//        String rev = "";
//        for(int i=length-1; i>=0; i--){
//            rev=rev+name.charAt(i);
//        }
//        System.out.println(rev);
//   }

    public static char[] reverseString(String s) {
        char[] inp = s.toCharArray();
        int end = inp.length-1;
        int start = 0;

        while(start<end){
            char temp = inp[end];
            inp[end]=inp[start];
            inp[start]=temp;
            end--;
            start++;
        }
        return inp;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("aayush"));
    }
}
