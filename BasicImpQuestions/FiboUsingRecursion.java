package BasicImpQuestions;

public class FiboUsingRecursion {

    static int a=0, b=1, c;
    public static void main(String[] args) {
        System.out.print(a + " " + b);
        FiboUsingRecursion ob = new FiboUsingRecursion();
        ob.printfb(15);
    }

    void printfb(int i){
        if(i>=1){
            c=a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
            printfb(i-1);
        }
    }
}
