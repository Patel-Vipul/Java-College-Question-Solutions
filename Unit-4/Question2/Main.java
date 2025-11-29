import java.util.InputMismatchException;
import java.util.Scanner;


class RangeException extends Exception{
    RangeException(String msg){
        super(msg);
    }
}

public class Main{
    public static void main(String[] args) {
        
        try{

            Scanner sc = new Scanner(System.in);
            float m1=0, m2=0, m3=0;
            boolean isValid = false;

            while(!isValid){

                try {
                    
                    System.out.println("Enter Marks of Subject1:= ");
                    m1 = sc.nextFloat();
                    System.out.println("Enter marks of subject2:- ");
                    m2= sc.nextFloat();
                    System.out.println("Enter marks of subject3:- ");
                    m3 = sc.nextFloat();

                    if(m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100){
                        throw new RangeException("Invalid Range! Makrs should be between 0-100");
                    }

                    isValid = true;

                } catch (InputMismatchException ime) {
                    System.out.println("Invalid Input! Please Enter Valid Marks "+ime);
                    sc.nextLine();
                }
                catch(RangeException re){
                    System.out.println("Error "+re.getMessage());
                    System.out.println("Please re-enter marks");
                }catch(Exception e){
                    System.out.println("Unexpected Error "+e);
                    System.out.println("Please try again");
                }

            }

            try{
                float percent = ((m1+m2+m3)/300)*100;
                if(m1<40 || m2<40 || m3<40){
                    System.out.println("Fail!");
                }
                else{
                    System.out.println("Pass"+" "+percent+"%");
                }

            }catch(Exception e){
                System.out.println("Calculation error! Please try again");
            }

        }catch(Exception e){
            System.out.println("Unexcepted Error! "+e);
        }

    }
}