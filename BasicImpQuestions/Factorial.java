package BasicImpQuestions;

import java.util.Scanner;

class Factorial {
//    public static void main(String args[]) {
//        Scanner kb = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = kb.nextInt();
//        int fact = 1;
//
//        for(int i=n; i>=1; i--){
//            fact=fact*i;
//        }
//        System.out.println("Factorial is = " + fact);
//    }

    //Using Recursion
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number for which you want to calculate factorial = ");
        int n=sc.nextInt();

        Factorial fac=new Factorial();
        fac.calcFact(n);
        System.out.println("Factorial is "+ fact);
    }
    void calcFact(int n){
        if(n>=1){
            fact=fact*n;
            calcFact(n-1);
        }
    }
}