
import java.util.Scanner;

public class Q2_Reverse {
    public static void main(String[] args) {
        
        /*Q2. Write a program to create an array to store 5 integer values. Also 
initialize the array with 5 numbers and display the array Elements 
in reverse order.  */

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter the elements of the array:=");
        for(int i=0; i<arr.length; i++){
            System.out.print("\nElement "+(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed Array:- ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print("\t"+arr[i]);
        }

        sc.close();

    }
}
