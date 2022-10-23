
//Create a class which will contain the variables
// and three methods accept, calculate and display 
//for finding the status of the student who has 
//appeared for three subjects and his marks were 
//recorded individually. In the calculation part it 
//should display the total, average and the status. 
//If average is greater than or equal to 40 consider 
//him pass else fail.
import java.util.Scanner;

class Status {
    Scanner sc = new Scanner(System.in);
    int Hindi, English, Maths, total, avg, ind_marks;

    public void accept() {
        System.out.println("Marks of 3 subjects= ");
        System.out.println("HINDI = ");
        Hindi = sc.nextInt();
        System.out.println("ENGLISH = ");
        English = sc.nextInt();
        System.out.println("MATHS = ");
        Maths = sc.nextInt();
    }

    public void calculate() {
        total = Hindi + English + Maths;
        avg = (Hindi + English + Maths) / 2;
        System.out.println("Average = " + avg);

        if (avg < 40) {
            ind_marks = 0;
        } else if (Hindi < 40 || English < 40 || Maths < 40) {
            ind_marks = 0;
        } else {
            ind_marks = 1;
        }
    }

    public void display() {
        if (ind_marks == 0) {
            System.out.println("Status = FAIL");
        } else {
            System.out.println("Status = PASS ");
        }
    }

    public static void main(String[] args) {
        Status res = new Status();
        res.accept();
        res.calculate();
        res.display();
    }

}
