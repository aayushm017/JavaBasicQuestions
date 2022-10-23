//WAP to sum a natural number b/w 1-10
package BasicImpQuestions;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("Sum of natnum b/w 1-10 = " + sum);
        }
    }
}
