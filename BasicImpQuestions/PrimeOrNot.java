package BasicImpQuestions;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n=17, temp=0;
        for(int i = 2; i <= n-1; i++){
            if(n%i==0) {
                temp = temp + 1;
            }
        }
        if(temp==0){
            System.out.println("A prime number");
        }else{
            System.out.println("Not a Prime number");
        }
    }
}
