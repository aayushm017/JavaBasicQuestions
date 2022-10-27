package Questions;
import java.util.*;

public class AverageandResult {
    float average;
    int eng, hin, math;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of English subject = ");
        eng = sc.nextInt();
        System.out.println("Enter marks of Hindi subject = ");
        hin = sc.nextInt();
        System.out.println("Enter marks of Maths subject = ");
        math = sc.nextInt();
    }

    public void calculate(){
        average = (eng + hin+ math) / 3;

        if(eng>35 && hin>35 && math>35) {
            if (average >= 60) {
                System.out.println("1st Division : " + average);
                System.exit(0);
            } else if (average >= 40) {
                System.out.println("2nd Division : " + average);
                System.exit(0);
            } else if (average >= 35) {
                System.out.println("3rd Division : " + average);
                System.exit(0);
            } else if (average < 35) {
                System.out.println("Failed : " + average);
                System.exit(0);
            }
        }else{
            System.out.println("Failed in One or Subjects");
        }
    }

    public static void main(String[] args) {
        AverageandResult avgr = new AverageandResult();
        avgr.accept();
        avgr.calculate();
    }
}
