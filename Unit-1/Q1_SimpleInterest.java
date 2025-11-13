
import java.util.Scanner;

public class Q1_SimpleInterest{
    public static void main(String[] args){

        //Q1. Write a program to evaluate simple interest of a given principle,rate and time.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount:= ");
        float amount = sc.nextFloat();

        System.out.println("Enter Rate of Interest:= ");
        float rate = sc.nextFloat();

        System.out.println("Enter Time(in years):= ");
        float year = sc.nextFloat();

        float simpleInterest = (amount*rate*year)/100;

        System.out.println("Rate of Interst is "+simpleInterest);

        sc.close();
    }
}