package Questions;

// XOR gate (Important question to find unique number from duplicate number)
// x^0 = x;  x^y = y^x;  x^(x^z) = (x^y)^z ; x^x = 0 (this formula is used in this code).

public class SingleNumberLeetcode {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 4};
        int xor = 0;

        for(int i = 0; i < arr.length; i++){
            xor = xor^arr[i];
        }
        System.out.println("Unique/Single number = " + xor);
    }
}
