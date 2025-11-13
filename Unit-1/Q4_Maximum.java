public class Q4_Maximum {
    public static void main(String[] args) {

        /*
         * Q4. Write a java program to scan 3 integer values from the command line
         * argument and display the maximum number using conditional
         * operator.
         */

         if(args.length != 3){
            System.out.println("Please Enter 3 Numbers! ");
         }

         int num1 = Integer.parseInt(args[0]);
         int num2 = Integer.parseInt(args[1]);
         int num3 = Integer.parseInt(args[2]);

         int max = (num1 > num2) ? (num1>num3 ? num1 : num3) : (num2>num3 ? num2: num3) ;


         System.out.println("Maximum Number is := "+max);
    }
}
