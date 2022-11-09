package Questions;
import java.util.Scanner;

public class StackMain extends StackUsingArray{
    public static void main(String[] args) {
        StackMain nums = new StackMain();
        nums.push(15);
        nums.push(5);
//        nums.push(1);
//        nums.push(775);
//        nums.pop();
        nums.pop();
        System.out.println(nums.top);
        System.out.println(nums.size());
        nums.show();
    }
}
