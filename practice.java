//import java.nio.charset.MalformedInputException;
//import java.rmi.server.SocketSecurityException;
//
//import javax.sound.midi.Sequencer.SyncMode;
//
///*
// * Method OVERRIDE public class savenumber { void save1(int num) {
// * System.out.println("One number is saved"); }
// * 
// * void save1(int num1, int num2) { System.out.println("Two number is saved"); }
// * 
// * public static void main(String[] args) { savenumber s = new savenumber();
// * s.save1(12345); s.save1(11334, 5656); s.sound(); }
// * 
// * void sound() { System.out.println("All animal Sound"); } }
// * 
// * class cat extends savenumber { void sound() { System.out.println("Meow"); } }
// */
//
///*
// * Abstract Class abstract class Vehicle { int no_of_tyres;
// * 
// * abstract void start(); }
// * 
// * class Car extends Vehicle { void start() {
// * System.out.println("Start with a Key"); } }
// * 
// * class Scooter extends Vehicle { void start() {
// * System.out.println("Start with Kick"); }
// * 
// * public static void main(String[] args) { // Vehicle v = new Vehicle(); Car c
// * = new Car(); c.start();
// * 
// * Scooter sc = new Scooter(); sc.start(); } }
// */
///*
// * Interface
// * 
// * interface I1 { void show(); }
// * 
// * interface I2 { void display(); }
// * 
// * class Test implements I1, I2 { public void show() { System.out.println("1");
// * }
// * 
// * public void display() { System.out.println("2"); }
// * 
// * public static void main(String[] args) { Test t = new Test(); t.show();
// * t.display(); } }
// */
//
///*
// * Encapsulation
// * 
// * class Employee { private String Emp_id;
// * 
// * public void setEmpid(String empid1) { Emp_id = empid1; }
// * 
// * public String getEmpid() { return Emp_id; } }
// * 
// * class Company { public static void main(String[] args) { Employee e = new
// * Employee(); e.setEmpid("Aayush"); System.out.println(e.getEmpid()); } }
// */
///*
// * this keyword class ThisDemo { void display() { System.out.println("Hello"); }
// * 
// * void show() { this.display(); }
// * 
// * public static void main(String[] args) { ThisDemo td = new ThisDemo();
// * td.show(); } }
// */
///*
// * class ThisDemo { ThisDemo() {
// * 
// * System.out.println("no arg constructor"); }
// * 
// * ThisDemo(int a) { this(); System.out.println("Parameterized Constructor"); }
// * 
// * public static void main(String[] args) { ThisDemo td = new ThisDemo(10); } }
// */
///*
// * class ThisDemo { void m1(ThisDemo td) {
// * System.out.println("I am in m1 method"); }
// * 
// * void m2() { m1(this); }
// * 
// * public static void main(String[] args) { ThisDemo td = new ThisDemo();
// * td.m2(); } }
// */
///*
// * Suoer keyword class A { int a = 10; }
// * 
// * class B extends A { int a = 20;
// * 
// * void show(int a) { System.out.println(a); System.out.println(this.a);
// * System.out.println(super.a); }
// * 
// * public static void main(String[] args) { B obj1 = new B(); obj1.show(30); } }
// */
///*
// * class A { void m1() { System.out.println("I am in class A"); } }
// * 
// * class B extends A { void m1() { System.out.println("I am in class B"); }
// * 
// * void show() { m1(); super.m1(); }
// * 
// * public static void main(String[] args) { B ob = new B(); ob.show(); } }
// */
///*
// * super(); class A { A() { System.out.println("I am in class A"); } }
// * 
// * class B extends A { B() { super(); System.out.println("I am in class B"); }
// * 
// * public static void main(String[] args) { B ob = new B(); } }
// */
//
///*
// * final class Test { public static void main(String[] args) { final int i = 10;
// * // i = i + 20; System.out.println(i); } }
// */
///*
// * final class Demo { final void m1() {
// * System.out.println("I am in Demo class"); } }
// * 
// * class Test extends Demo { void m2() {
// * System.out.println("I am in Test class"); }
// * 
// * public static void main(String[] args) { Test t = new Test(); t.m2(); } }
// */
///*
// * Static variable class Employee { int empid; String name; static String
// * company = "SP";
// * 
// * Employee(int empid, String name) { this.empid = empid; this.name = name; }
// * 
// * void display() { System.out.println(empid + " " + name + " " + company); }
// * 
// * public static void main(String[] args) { Employee e1 = new Employee(101,
// * "Aman"); e1.display(); Employee e2 = new Employee(102, "Deepak");
// * e2.display(); } }
// */
///*
// * static method class Test { static void show() { System.out.println("20"); }
// * 
// * public static void main(String[] args) { show(); Xyz.display(); } }
// * 
// * class Xyz { static void display() { System.out.println("10"); } }
// */
///*
// * static class StaticDemo { static void display() { show();
// * System.out.println("1"); }
// * 
// * static void show() { System.out.println("2"); } }
// */
///*
// * class Test { static { System.out.println("Hello"); }
// * 
// * public static void main(String[] args) {
// * System.out.println("I m in main method"); } }
// */
///*
// * Checked Exception import java.io.FileInputStream;
// * 
// * class Test { public static void main(String[] args) { try { FileInputStream
// * fis = new FileInputStream("d:/abc.txt"); } catch (Exception e) {
// * System.out.println(e); } } }
// */
///*
// * try, catch, finally
// * 
// * class Test { public static void main(String[] args) {
// * System.out.println("1"); try { System.out.println("2"); int a = 100, b = 0,
// * c; System.out.println("3");
// * 
// * c = a / b; System.out.println("4"); System.out.println(c);
// * System.out.println("5"); } // catch (ArithmeticException e) { //
// * System.out.println("6"); // e.printStackTrace(); // System.out.println("7");
// * finally { System.out.println("Hello"); } } }
// */
///*
// * class Test { public static void main(String[] args) { try {
// * 
// * } finally {
// * 
// * } catch(ArithmeticException e){ } } }
// */
///*
// * EXCEPTION import java.util.Scanner;
// * 
// * class Voting { public static void main(String[] args) { Scanner sc = new
// * Scanner(System.in); System.out.println("Enter your Age = "); int age =
// * sc.nextInt(); try { if (age < 18) { throw new
// * YoungerAgeException("You are not eligible to vote"); } else {
// * System.out.println("Vote Sucess"); } } catch (Exception e) {
// * e.printStackTrace(); } } }
// */
///*
// * Throws import java.io.FileInputStream; import java.io.FileNotFoundException;
// * 
// * class ReadAndWrite { void readFile() throws FileNotFoundException {
// * FileInputStream fis = new FileInputStream("d:/abc.txt"); }
// * 
// * void saveFile() throws FileNotFoundException { FileInputStream fos = new
// * FileInputStream("d:/abc.txt"); } }
// * 
// * class Test { public static void main(String[] args) { ReadAndWrite rd = new
// * ReadAndWrite(); try { rd.readFile(); } catch (FileNotFoundException e) {
// * e.printStackTrace(); } try { rd.saveFile(); } catch (FileNotFoundException e)
// * { e.printStackTrace(); } } }
// */
///*
// * Customized Exception(CT Exception) class UnderAgeException extends Exception
// * { UnderAgeException() { super("You are under age, not eligible for Vote"); }
// * 
// * UnderAgeException(String message) { super(message); } }
// * 
// * class Voting { public static void main(String[] args) throws
// * UnderAgeException { int age = 9; try { if (age < 18) { throw new
// * UnderAgeException(); } else { System.out.println("You are Eligible"); } }
// * catch (UnderAgeException e) { e.printStackTrace(); }
// * 
// * } }
// */
///*
// * throws exception class UnderAgeException extends RuntimeException {
// * UnderAgeException() { super("You are under age, not eligible for Vote"); }
// * 
// * UnderAgeException(String message) { super(message); } }
// * 
// * class Voting { public static void main(String[] args) throws
// * UnderAgeException { int age = 9; try { if (age < 18) { throw new
// * UnderAgeException(); } else { System.out.println("You are Eligible"); } }
// * catch (UnderAgeException e) { e.printStackTrace(); }
// * 
// * } }
// */
//
///*
// * == operator and .equals operator class Object { public boolean equals(Object
// * obj) { return (this == obj); } }
// * 
// * class String extends Object { public boolean equals(Object sobj) { return
// * (this == sobj); } }
// * 
// * class Demo { public static void main(String[] args) { String s1 = new
// * String("Deepak"); String s2 = new String("Deepak"); System.out.println(s1 ==
// * s2); System.out.println(s1.equals(s2)); } }
// */
///*
// * length method class Test { public static void main(String[] args) { String
// * name = "abc"; String email = "abc@gmail.com"; String pass = "abc123";
// * System.out.println(name.length()); int i = name.length(); if (i == 0) {
// * System.out.println("Name is Empty"); } } }
// */
//
///*
// * isEmpty(); class Test { public static void main(String[] args) { String name
// * = ""; String email = "abc@gmail.com"; String pass = "abc123";
// * System.out.println(name.isEmpty()); if (name.isEmpty() == true) {
// * System.out.println("Name is Empty"); } } }
// */
///*
// * trim method class Test { public static void main(String[] args) { String name
// * = "   abc   "; String email = "abc@gmail.com"; String pass = "abc123"; String
// * s = name.trim(); System.out.println(s); if (name.trim().length() == 0) {
// * System.out.println("Name is Empty"); } } }
// */
///*
// * compareToIgnore class Test { public static void main(String[] args) { String
// * s1 = "aC"; String s2 = "ab"; System.out.println(s1.compareToIgnoreCase(s2));
// * } }
// */
///*
// * subSequence and subString class Test { public static void main(String[] args)
// * { String s = "this is demo"; System.out.println(s.subSequence(3, 9));
// * System.out.println(s.substring(3)); System.out.println(s.substring(3, 11)); }
// * }
// */
///*
// * Different Methods in Strings class Test { public static void main(String[]
// * args) { String s = "deepak"; System.out.println(s.indexOf("e"));
// * System.out.println(s.indexOf("ep")); System.out.println(s.lastIndexOf("e"));
// * System.out.println(s.lastIndexOf("d")); System.out.println(s.charAt(3));
// * System.out.println(s.contains("ep")); System.out.println(s.startsWith("d"));
// * System.out.println(s.startsWith("a")); System.out.println(s.toUpperCase());
// * System.out.println(s.toLowerCase());
// * 
// * int a = 10, b = 20; System.out.println(a + b); String s1 = String.valueOf(a);
// * String s2 = String.valueOf(b); System.out.println(s1 + s2);
// * 
// * char c[] = s.toCharArray(); System.out.println(c); } }
// */
///*
// * StringBuffer class StringBufferDemo { public static void main(String[] args)
// * { StringBuffer sb = new StringBuffer("deepak"); //
// * System.out.println(sb.capacity());
// * 
// * // sb.append("hello"); // System.out.println(sb.capacity());
// * 
// * // sb.append("deepaka java"); // System.out.println(sb.capacity());
// * 
// * // sb.append("deepak java"); // System.out.println(sb.capacity());
// * 
// * // sb.append("deepak java"); // System.out.println(sb.length());
// * 
// * // sb.append("deepak java"); // System.out.println(sb.append("hi"));
// * 
// * // sb.append("deepak java"); // System.out.println(sb.deleteCharAt(2));
// * 
// * // sb.append("deepak java"); // System.out.println(sb.toString());
// * 
// * System.out.println(sb.capacity()); sb.ensureCapacity(100);
// * System.out.println(sb.capacity()); } }
// */
///*
//class Animal {
//   void eat() {
//       System.out.println("I am eating");
//   }
//}
//
//class Dog extends Animal {
//   public static void main(String[] args) {
//       Dog d = new Dog();
//       d.eat();
//   }
//}
//*/
///* Abstraction
//abstract class Bike {
//    abstract void run(); // 100% abstraction achieved
//}
//
//class Honda4 extends Bike {
//    void run() {
//        System.out.println("running safely");
//    }
//
//    public static void main(String args[]) {
//        Bike obj = new Honda4();
//        obj.run();
//    }
//}
//*/
///*
//class My implements Runnable {
//    public void run() {
//        int i = 1;
//        while (true) {
//            System.out.print(i + "Hello");
//            i++;
//        }
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        My m = new My();
//        Thread t = new Thread(m);
//        t.start();
//        int i = 1;
//        while (true) {
//            System.out.print(i + "World");
//            i++;
//        }
//    }
//}
///* getter and setter methods in Thread Priorities
//
//class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//        setPriority(Thread.MIN_PRIORITY + 2);
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        MyThread t = new MyThread("My Thread 1");
//
//        System.out.println("ID = " + t.getId());
//        System.out.println("Name = " + t.getName());
//        System.out.println("Priority = " + t.getPriority());
//        t.start();
//        System.out.println("State = " + t.getState());
//        System.out.println("Alive = " + t.isAlive());
//    }
//}
//*/
///* t.start and t.interrupt in Multithreading
//class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }
//
//    public void run() {
//        int count = 1;
//        while (true) {
//            System.out.println(count++);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        MyThread t = new MyThread("My Thread 1");
//        t.start();
//        t.interrupt();
//    }
//}
//*/
///* Daemon Thread
//class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }
//
//    public void run() {
//        int count = 1;
//        while (true) {
//            System.out.println(count++);
//        }
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        MyThread t = new MyThread("My Thread 1");
//        t.setDaemon(true);
//        t.start();
//        try {
//            Thread.sleep(100);
//        } catch (Exception e) {
//        }
//    }
//}
//*/
//
///* yield Thread
//class MyThread extends Thread {
//
//    public void run() {
//        int count = 1;
//        while (true) {
//            System.out.println(count++ + "My  Thread");
//        }
//    }
//}
//
//public class practice {
//    public static void main(String[] args) throws Exception {
//        MyThread t = new MyThread();
//        t.setDaemon(true);
//        t.start();
//        int count = 1;
//        while (true) {
//            System.out.println(count++ + "Main");
//            Thread.yield();
//        }
//    }
//}
//*/
///*  Synchronization
//class MyData {
//    synchronized public void display(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i));
//            try {
//                Thread.sleep(100);
//            } catch (Exception e) {
//            }
//
//        }
//    }
//}
//
//class MyThread1 extends Thread {
//    MyData d;
//
//    public MyThread1(MyData d) {
//        this.d = d;
//    }
//
//    public void run() {
//        d.display("Hello World");
//    }
//}
//
//class MyThread2 extends Thread {
//    MyData d;
//
//    public MyThread2(MyData d) {
//        this.d = d;
//    }
//
//    public void run() {
//        d.display(" Welcome All");
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        MyData data = new MyData();
//        MyThread1 t1 = new MyThread1(data);
//        MyThread2 t2 = new MyThread2(data);
//        t1.start();
//        t2.start();
//    }
//}
//*/
///* Example of synchronized Inter-Thread 
//class MyData {
//    int value;
//    boolean flag = true;
//
//    synchronized public void set(int v) {
//        while (flag != true) {
//            try {
//                wait();
//            } catch (Exception e) {
//            }
//            value = v;
//            flag = false;
//            notify();
//        }
//    }
//
//    synchronized public int get() {
//        int x = 0;
//        while (flag != false) {
//            try {
//                wait();
//            } catch (Exception e) {
//            }
//            x = value;
//            flag = true;
//            notify();
//            return x;
//        }
//    }
//}
//
//class Producer extends Thread {
//    MyData data;
//
//    public Producer(MyData d) {
//        data = d;
//    }
//
//    public void run() {
//        int count = 1;
//        while (true) {
//            data.set(count);
//            System.out.println("Producer " + count);
//            count++;
//        }
//    }
//}
//
//class Consumer extends Thread {
//    MyData data;
//
//    public Consumer(MyData d) {
//        data = d;
//    }
//
//    public void run() {
//        int value;
//        while (true) {
//            value = data.get();
//            System.out.println("Consumer " + value);
//        }
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        MyData data = new MyData();
//        Producer p = new Producer(data);
//        Consumer c = new Consumer(data);
//        p.start();
//        c.start();
//    }
//}
//*/
///* Teacher Whiteboard example in Multithreading
//class WhiteBoard {
//    String text;
//    int numberOfStudents = 0;
//    int count = 0;
//
//    public void attendance() {
//        numberOfStudents++;
//    }
//
//    synchronized public void write(String t) {
//        System.out.println("Teacher is Writing " + t);
//        while (count != 0)
//            try {
//                wait();
//            } catch (Exception e) {
//            }
//        text = t;
//        count = numberOfStudents;
//        notifyAll();
//
//    }
//
//    synchronized public String read() {
//
//        while (count == 0)
//            try {
//                wait();
//            } catch (Exception e) {
//            }
//
//        String t = text;
//        count--;
//        if (count == 0)
//            notify();
//        return t;
//    }
//
//}
//
//class Teacher extends Thread {
//    WhiteBoard wb;
//
//    String notes[] = { "Java is language", "It is OOPs", "It is Platform Independent", "It supports Thread", "end" };
//
//    public Teacher(WhiteBoard w) {
//        wb = w;
//    }
//
//    public void run() {
//        for (int i = 0; i < notes.length; i++)
//            wb.write(notes[i]);
//    }
//
//}
//
//class Student extends Thread {
//    String name;
//    WhiteBoard wb;
//
//    public Student(String n, WhiteBoard w) {
//        name = n;
//        wb = w;
//    }
//
//    public void run() {
//        String text;
//        wb.attendance();
//
//        do {
//            text = wb.read();
//            System.out.println(name + " Reading " + text);
//            System.out.flush();
//        } while (!text.equals("end"));
//    }
//
//}
//
//public class practice {
//    public static void main(String[] args) {
//        WhiteBoard wb = new WhiteBoard();
//        Teacher t = new Teacher(wb);
//
//        Student s1 = new Student("1. John", wb);
//        Student s2 = new Student("2. Ajay", wb);
//        Student s3 = new Student("3. Kloob", wb);
//        Student s4 = new Student("4. Smith", wb);
//
//        t.start();
//
//        s1.start();
//        s2.start();
//        s3.start();
//        s4.start();
//
//    }
//}
//*/
///* Typecasting
//class practice {
//    public static void main(String[] args) {
//        byte b = 50;
//        b = (byte) (b * 50);
//        System.out.println(b);
//    }
//}
//*/
//
///* Sum of all natural numbers
//import java.util.Scanner;
//
//class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int i = 1;
//        int sum = 0;
//        while (i <= n) {
//            sum = sum + i;
//            i = i + 1;
//        }
//        System.out.println(sum);
//    }
//}
//*/
///* 
//Q.>Fahrenheit to Celsius Table
//
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and 
//Step Size (W), you need to convert all Fahrenheit values from Start to End 
//at the gap of W, into their corresponding Celsius values and print the table.
//Input Format :
//3 integers - S, E and W respectively 
//Output Format :
//Fahrenheit to Celsius conversion table. One line for every Fahrenheit and 
//corresponding Celsius value. On Fahrenheit value and its corresponding Celsius
//value should be separate by tab ("\t")
//Constraints :
//0 <= S <= 80
//S <= E <=  900
//0 <= W <= 40 
//Sample Input 1:
//0 
//100 
//20
//Sample Output 1:
//0   -17
//20  -6
//40  4
//60  15
//80  26
//100 37
//
//import java.util.Scanner;
//
//class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int e = sc.nextInt();
//        int w = sc.nextInt();
//        int f = s;
//
//        while (f <= e) {
//            int c = (5 * (f - 32)) / 9;
//            System.out.println(f + "\t" + c);
//            f = f + w;
//        }
//
//    }
//}
//*/
///* Prime number
//import java.util.Scanner;
//
//class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. to find that it is Prime or Composite?");
//        int n = sc.nextInt();
//        int div = 2;
//
//        boolean isPrime = true;
//        while (div <= n / 2) {
//            if (n % div == 0) {
//                System.out.println(div + " Composite Number");
//                isPrime = false;
//                return;
//            }
//            div = div + 1;
//        }
//        System.out.println(div + " Prime Number");
//        // if (isPrime) {
//        // System.out.println("Prime Number");
//        // } else {
//        // System.out.println("Composite Number");
//        // }
//    }
//}
//*/
///*
//import java.util.Scanner;
//
//class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Basic salary = ");
//        int basic = sc.nextInt();
//        System.out.println("Enter allowance Grade");
//        String allowance = sc.next();
//        int total_salary;
//
//        double hra = basic * 0.2;
//        double da = basic * 0.5;
//        double pf = basic * 0.11;
//
//        if (allowance == "A") {
//            basic = basic + 1700;
//        }
//        if (allowance == "B") {
//            basic = basic + 1500;
//        } else {
//            basic = basic + 1300;
//        }
//        System.out.println(basic);
//    }
//
//}
//*/
///* Add in functions
//import java.util.Scanner;
//
//class practice {
//    public static int add(int a, int b) {
//        int result = a + b;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int result = add(a, b);
//        System.out.println(result);
//    }
//}
//*/
///* Prime number using functions
//import java.util.Scanner;
//
//class practice {
//    public static void prime(int n) {
//        int div = 2;
//        boolean isPrime = true;
//        if (div <= n && n % div == 0) {
//            System.out.println("Composite number");
//            isPrime = false;
//        }
//        div = div + 1;
//        if (isPrime) {
//            System.out.println("Prime Number");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        prime(n);
//    }
//}
//*/
///*
//class practice {
//    public static int func(int a) {
//        a += 10;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int a = 5;
//        func(a);
//        System.out.println(a);
//    }
//}
//*/
//
///* Count Digit
//class practice {
//    public static double countDigit(int x) {
//        double res = 0;
//        while (x > 0) {
//            x = x / 10;
//            res++;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        double res = countDigit(455398456);
//        System.out.println(res);
//    }
//}
//*/
///* Palindrome number
//class practice {
//    public static int isPal(int n) {
//        int rev = 0;
//        int temp = n;
//        while (temp != 0) {
//            int ld = temp % 10;
//            rev = rev * 10 + ld;
//            temp = temp / 10;
//        }
//        return (rev = n);
//    }
//
//    public static void main(String[] args) {
//        int rev = isPal(78987);
//        System.out.println("Palindrome");
//    }
//}
//*/
//import java.util.Scanner;
//
//class practice {
//    public static int factorial(int n) {
//        int res = 1;
//        for (int i = 2; i <= n; i++) {
//            res = res * i;
//            System.out.println(res);
//        }
//        return n;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        factorial(n);
//    }
//}


//class practice {
//    public static void main(String[] args) {
//        long inp = 123234545;
//        int count = (int) Math.floor(Math.log10(inp) + 1);
//        System.out.println(count);
//    }
//}

//how is an infinite loop declared in java? - tutorialsinhand.com
//public class practice {
//	//main method:entry point to java code
//	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("infinite loop in java");
//		}
//	}
//}
