//Create a class, which will contain the variables
// and three methods accept, calculate and display
// for finding gross salary and net salary of the employee.
// The user feeds the basic salary, DA is 10% of basic salary,
// TA is 15% of the basic salary, and HRA is 20% of the 
//basic salary. If the gross exceeds 8000 the tax is 10% 
//of the extra amount above 8000

import java.util.Scanner;

class Main {
    double DA;
    double TA;
    double HRA;
    double net_salary;
    double gross_salary;
    String tax;

    public void accept() {
        System.out.println("Enter Your Basic salary here");
        Scanner sc = new Scanner(System.in);
        net_salary = sc.nextDouble();
    }

    public void calculate() {
        DA = net_salary * .1;
        TA = net_salary * .15;
        HRA = net_salary * .20;
        gross_salary = DA + TA + HRA + net_salary;
        if (gross_salary >= 8000) {
            net_salary = (gross_salary * .10) + gross_salary;
            tax = "Included";
        } else {
            net_salary = gross_salary;
            tax = "Not Included";
        }
    }

    public void display() {
        System.out.println("Net Salary: " + net_salary);
        System.out.println("DA: " + DA);
        System.out.println("TA: " + TA);
        System.out.println("HRA: " + HRA);
        System.out.println("TAX: " + tax);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Main amt = new Main();
        amt.accept();
        amt.calculate();
        amt.display();
    }
}