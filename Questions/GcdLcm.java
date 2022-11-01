package Questions;

public class GcdLcm {
    public static void main(String[] args) {
        int n1, n2, on1, on2, rem;
        n1 = 24;
        n2 = 30;
        on1 = n1;
        on2 = n2;

        while(n1 % n2 != 0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        int lcm = (on1 * on2) / 2;
        System.out.println("LCM = " + lcm);
        System.out.println("HCF/GCD = " + gcd);
    }
}
