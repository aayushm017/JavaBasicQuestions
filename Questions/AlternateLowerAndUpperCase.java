package Questions;

public class AlternateLowerAndUpperCase {
    public static void main(String[] args) {

        String x = "I am Aayush";
        StringBuilder word =  new StringBuilder(x); //creates a mutable sequence of characters.
        int size = word.length();

        int  i = 0;
        while(i != size) {
            if(i % 2 == 0) {
                word.setCharAt(i, Character.toLowerCase(word.charAt(i)));
                i++;
            } else {
                word.setCharAt(i, Character.toUpperCase(word.charAt(i)));
                i++;
            }
        }
        System.out.println(x);
        System.out.println(word);
    }
}
