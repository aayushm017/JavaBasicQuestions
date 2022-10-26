package Questions;
import java.util.*;

public class grossSalaryFinder {
        double TA, DA, PF, gross, basic_salary;

        public void accept(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Basic Salary = ");
            basic_salary = sc.nextInt();
        }

        public void calculate(){
            if(basic_salary > 10000){
                TA = basic_salary * 0.02;
                DA = basic_salary * 0.03;
                PF = basic_salary * 0.5;
                display();
            }
            else if (basic_salary > 5000) {
                TA = 0;
                DA = basic_salary * 0.02;
                PF = basic_salary * 0.5;
                display();
            }
            else if (basic_salary < 5000) {
                TA = 0;
                DA = 0;
                PF = 0;
                display();
            }
        }

        public void display() {
            gross = basic_salary + TA + DA - PF;
            System.out.println("Transport Allowance = " + TA);
            System.out.println("Dearness Allowance = " + DA);
            System.out.println("Provident Fund (PF) = " + PF);
            System.out.println("Gross and Net Salary = " + gross);
            System.exit(0);
        }

    public static void main(String[] args) {
            grossSalaryFinder gs = new grossSalaryFinder();
            gs.accept();
            gs.calculate();
            gs.display();
    }
}
