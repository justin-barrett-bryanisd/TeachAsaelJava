
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jbarrett
 */
public class Employee {

    private String name;
    private int hours;
    final private double pay;
    public final static double MIN_WAGE = 7.25;

    public Employee(String name, int hours, double pay) {
        this.name = name;
        this.hours = hours;

        if (pay < MIN_WAGE) {
            this.pay = MIN_WAGE + .01;
        } else {
            this.pay = pay;
        }
        //code to be done for all Employees
        System.out.println("a");

    }

    public Employee(String name) {
        this(name, 1, 7.25);
        System.out.println("b");
    }

    public Employee() {
        this("No name yet");
        System.out.println("c");
    }

    public void printDetails() {
        System.out.println("++++++++++++++++++");
        System.out.println(name);
        DecimalFormat df = new DecimalFormat("$0.00");
        System.out.println("Pay: " + df.format(pay));
        System.out.println("Hours worked: " + hours);
    }

    public double getPay() {
        return pay;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Precondition: time > 0
    Postcondition: time is added to hours worked
     */
    public void addTime(int time) {
        hours += time;
    }

    /*
    Precondition: pay > 0
    Postcondition: 
            returns the amount to pay the employee
            resets their hours
     */
    public double processTimeCard() {
        double payment = pay * hours;
        hours = 0;
        return payment;
    }

    public void printNameTag() {
        System.out.println("-----------------");
        System.out.println("| " + getNameTagString(name) + " |");
        System.out.println("-----------------");
    }

    public static String getNameTagString(String str) {
        Scanner scan = new Scanner(str);
        String first = scan.next();
        String last = scan.nextLine().trim();
        return first.substring(0, 1).toUpperCase() + ". " + last.substring(0, 1).toUpperCase() + last.substring(1);
    }

}
