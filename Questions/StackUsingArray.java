package Questions;
import java.util.Scanner;

public class StackUsingArray {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] stack = new int[n];
    int top = 0;

    public boolean isEmpty(){
       return top<=0;
    }

    public int size(){
        return top;
    }

    public void push(int data){
        if(top >= n){
            System.out.println("Overflow");
        }else
        stack[top++] = data;
    }

    public int pop(){
        if(top <= 0){
            System.out.println("Underflow");
            return -1;
        }else{
            int data = stack[top--];
            return data;
        }
    }

    public int peek(){
        int data = stack[top];
        return data;
    }

    public void show() {
        for(int n : stack)
            System.out.print(n + " ");
    }
}
