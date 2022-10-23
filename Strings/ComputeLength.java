package Strings;

public class ComputeLength {
    public static void main(String[] args) {
        String str = "Aayush is a good boy";
        str = str.concat("\0");
        char[] y = str.toCharArray();

        int count = 0, i = 0;
        while(y[i]!='\0'){
            count++;
            i++;
        }
        System.out.println(count);

        //Using Inbuilt function
//        System.out.println(str.length());
    }
}
