package BasicImpQuestions;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it is Armstrong/not = ");
        int num = sc.nextInt();
        int temp1 = num;
        int length = 0;

        while(temp1!=0){
            temp1=temp1/10;
            length+=1;
        }

        int temp2 = num;
        int arm = 0;
        int rem;

        while(temp2!=0) {
            int mul = 1;
            rem = temp2 % 10;
            for (int i = 0; i <= length; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            temp2=temp2/10;
        }
        if(arm==num){
            System.out.println(num + " is a Armstrong number");
        }else{
            System.out.println(num + " is not a Armstrong number");
        }
    }
}
