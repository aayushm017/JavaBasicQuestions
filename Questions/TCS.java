package Questions;
import java.util.Scanner;

public class TCS {
    public int findMaxDigit(int num){
        int rem;
        int max = 0;

        while (num != 0){
            rem = num % 10;
            if (rem > max){
                max = rem;
            }
            num = num / 10;
        }
        return max;
    }

    public int main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters of a Barcode = ");
        String s = sc.nextLine();
        char[] y = s.toCharArray();
        int size = y.length;
        int price = 0;

        for (int i = 0; i < size; i++){
            if (Character.isDigit(y[i])){
                price += (y[i] - 48);   // -48 the ASCII value of numeric character like 1 is 49 so 49 - 48 = 1;
            }
            else {
                price += (int)(findMaxDigit(y[i]));
            }
        }
        return price;
    }

    public static void main(String[] args) {
        TCS n = new TCS();
        int price = n.main();
        System.out.println(price);
    }
}
