import java.util.Scanner;
public class Q2_EMI {

    public static void main(String[] args) {

        /*
         * motor cycle dealer sells two-wheelers to his customer on loan,
         * which is to be repaid in 5 years. The dealer charges simple interest
         * for the whole term on the day of giving the loan itself. The total
         * amount is then divided by 60(months) and is collected as equated
         * monthly installment (EMI). Write a program to calculate the EMI for
         * a loan of Rs. X, where X is given from command line argument. Print
         * the EMI value in rupees
         */

        // Scanner sc = new Scanner(System.in);

        if(args.length <=0) {
            System.out.println("Please Enter the Cost");
        }
        float cost = Float.parseFloat(args[0]);

        int rate = 5;
        int time = 5;

        float smi = (cost*rate*time)/100;

        float totalAmount = cost+smi;

        float monthlyInstallment = totalAmount/(time*12);

        System.out.println("Total Amount (with Interest) is "+totalAmount+" and EMI is "+monthlyInstallment);


    }
}
