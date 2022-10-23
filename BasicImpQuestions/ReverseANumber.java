package BasicImpQuestions;

public class ReverseANumber {
    public static void main(String[] args) {
            int x =-677657, rev =0, rem;
        if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10) {
            System.out.println(0);
        }
            while(x!=0)
            {
                rem = x % 10;
                rev = rev * 10+ rem;
                x /= 10;
            }
        System.out.println(rev);
    }
}

