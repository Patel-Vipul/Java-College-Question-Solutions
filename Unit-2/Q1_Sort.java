
import java.util.Arrays;



public class Q1_Sort{
    public static void main(String[] args) {
        /*Q1. Write a program to sort the elements of one dimensional array. 
Read value of array elements through command line argument.  */

        if(args.length == 0){
            System.out.println("Please enter array elements as command line arguments!");
            return;
        }

        int arr[] = new  int[args.length];

        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }


        Arrays.sort(arr);

        System.out.println("Sorted Array");
        for(int num: arr){
            System.out.print("\t"+num);
        }

    }
}