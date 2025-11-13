
import java.util.Scanner;


interface Exam {
    boolean pass(int mark);
}

interface Classify{
    String division(int average);
}

class Result implements Exam,Classify{
    public boolean pass(int mark){
        if(mark>=35){
            return  true;
        }
       return false;
    }

    @Override
    public String division(int average){
        if(average>=60){
            return "First";
        }
        else if (average>=50 && average<60) {
            return "Second";
        }
        return "no division";
    }
}

public class Q8_Exam {
    public static void main(String[] args) {
        /*
         *  Write an interface called Exam with a method Pass(int mark) that 
            returns a Boolean. Write another interface called Classify with a 
            method Division(int average) which returns a string. Write a class 
            called Result which implements both Exam and Classify. The pass 
            method should return true if the marks is greater than or equal to 35 
            else false. The division method must return “First” when the 
            parameter average is 60 or more, “second” when average is 50 or 
            more but below 60, “no division” when average is less than 50.
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Your Marks:= ");
         int marks = sc.nextInt();
         System.out.println("Enter Your Average:= ");
         int average = sc.nextInt();

        Result r = new Result();

        System.out.println("Result:=- "+(r.pass(marks)?"Pass" : "Fail"));
        System.out.println("Result:=- "+r.division(average));


    }
}
