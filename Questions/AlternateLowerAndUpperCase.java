package Questions;

public class AlternateLowerAndUpperCase {
    public static void main(String[] args) {

        String x = "I am Aayush";
        System.out.println(x);
        StringBuilder word =  new StringBuilder(x);

        for (int i = 0; i < word.length(); i++) {
            if(i % 2 == 0)
                word.setCharAt(i, Character.toLowerCase(word.charAt(i)));
            else
                word.setCharAt(i, Character.toUpperCase(word.charAt(i)));
        }
        System.out.println(word);
    }
}
