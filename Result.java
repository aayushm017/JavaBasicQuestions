import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects = ");
        System.out.println("Maths = ");
        int Maths = sc.nextInt();
        System.out.println("English = ");
        int English = sc.nextInt();
        System.out.println("Hindi = ");
        int Hindi = sc.nextInt();
        System.out.println("SST = ");
        int SST = sc.nextInt();
        System.out.println("Computer = ");
        int Computer = sc.nextInt();
        int Total;
        float Avg;

        // Calculating Total Marks;
        Total = Maths + English + Hindi + SST + Computer;
        System.out.println("Total Marks= " + Total);

        // Evaluating the student is Passed or Fail;
        if (Maths < 33 || Hindi < 33 || SST < 33 || English < 33 || Computer < 33) {
            System.out.println("#Failed in one or multiple subjects");
        } else {
            System.out.println("#Passed");
        }

        // Calculating Average;
        Avg = Total / 5;
        System.out.println("Average= " + Avg);

        // Evaluating Grades in Average;
        if (Avg >= 0 && Avg < 33) {
            System.out.println("Fail");
        } else if (Avg > 33 && Avg <= 45) {
            System.out.println("Grade D");
        } else if (Avg > 45 && Avg <= 60) {
            System.out.println("Grade C");
        } else if (Avg > 60 && Avg <= 75) {
            System.out.println("Grade B");
        } else if (Avg > 75 && Avg <= 90) {
            System.out.println("Grade A");
        } else if (Avg > 90 && Avg <= 100) {
            System.out.println("Grade A+");
        }

    }
}
