//Create a class which will contain the variables 
//and two methods calculate and display for finding 
//the total, average and status of the student.
//The student has appeared for three subjects. 
//The status of the student has to be decided using 
//the following table. If average >=60 first division, 
//average>=45 second division, average >=30 third division,
//average <30 fail. If the student gets less than 30 in 
//any of the subject he is considered as fail

import java.util.Scanner;

class Result2 {
    Scanner sc = new Scanner(System.in);
    float avg;
    int total, English, Hindi, Maths, ch;

    void calculate() {
        System.out.println("Marks in 3 subjects");
        System.out.println("English = ");
        English = sc.nextInt();
        System.out.println("Hindi = ");
        Hindi = sc.nextInt();
        System.out.println("Maths = ");
        Maths = sc.nextInt();

        total = English + Hindi + Maths;
        System.out.println("Total = ");
        avg = total / 3;
        System.out.println("Average = " + avg);

        if (avg >= 60) {
            ch = 1;
        } else if (avg >= 45) {
            ch = 2;
        } else if (avg >= 30) {
            ch = 3;
        } else {
            ch = 0;
        }

        if (English < 30 || Hindi < 30 || Maths < 30) {
            ch = 0;
        }
    }

    void display() {
        if (ch == 1) {
            System.out.println("Status : 1st Division : PASSED");
        } else if (ch == 2) {
            System.out.println("Status : 2nd Division : PASSED");
        } else if (ch == 3) {
            System.out.println("Status : 3rd Division : PASSED");
        } else if (ch == 0) {
            System.out.println("Status : FAILED in one or multiple subjects!!");
        }
    }

    public static void main(String[] args) {
        Result2 res = new Result2();
        res.calculate();
        res.display();
    }
}
