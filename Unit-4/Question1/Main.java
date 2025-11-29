import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = 0;

            //validate  input n(must be integer and n>=2)
            while(true){
                System.out.print("How many do you want to enter(>=2):= ");
                try {
                    n = sc.nextInt();
                    if(n<2){
                        System.out.println("You must enter 2 numbers. Please, try again!");
                        continue;
                    }
                    break;
                } catch (InputMismatchException ime) {
                    System.out.println("Invalid Input!. Please Enter Valid Integer");
                    sc.nextLine();
                }
            }

            //Element
            int numbers[] = new int[n];
            System.out.println("--------Enter "+"n"+" Integers--------");

            
           for(int i=0; i<n; ){
            System.out.print("Element "+(i+1)+":- ");

            //validate element inputs
             try{
                numbers[i] = sc.nextInt();
                i++;
            }
            catch(InputMismatchException ime){
                System.out.println("Invalid Input. Please, Enter valid integer!");
                sc.nextLine();
            }

           }

           //Smallest and second smallest
           int lowest = Integer.MAX_VALUE;
           int secondLowest = Integer.MAX_VALUE;

           for(int num:  numbers){
            if(num<lowest){
                secondLowest = lowest;
                lowest = num;
            }
            else if(num<secondLowest && num!=lowest){
                secondLowest = num;
            }
           }

           System.out.println("Lowest Number:= "+lowest);
           
           
           if(secondLowest == Integer.MAX_VALUE){
            System.out.println("Second Lowest Number:= (no-distict number is found, all are same)");
           }
           else{
            System.out.println("Second Lowest Number:= "+secondLowest);
           }

        }
        catch(Exception e){
            System.out.println("Unexpected error occured: "+e.getMessage());
            e.printStackTrace();;
        }
    }
}