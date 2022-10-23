//Create a constructor which will initialize the 
//value of time =6. The user enters the principal 
//and the rate to its computer. 
//Find the simple interest for the given
//principal and ratevalue of time =6. 
//The user enters the principal and the rate to its computer. 
//Find the simple interest for the given principal and rate

import java.util.Scanner;

class SimpleInterest {
    float rate, time, principle, simple_interest;

    SimpleInterest(float rate, float principle, float time) {
        simple_interest = (principle * rate * time) / 100;
        System.out.println("Simple Interest of the given Value = " + simple_interest);
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(1000, 50, 6);
    }
}
