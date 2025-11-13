import java.util.Scanner;

public class Q3_Bill {
    public static void main(String[] args) {
        /*
         * A car accessories shop assigns code 1 to seat covers, 2 to steering
         * wheel covers , 3 to car lighting and 4 for air purifiers. All other
         * items have code 5 or more.
         * While selling the goods, a sales tax of 2% to seat covers ,3% to
         * steering wheel covers, 4% to car lighting, 2.5% to air purifiers and
         * 1.2% for all other items is charged. A list containing the product code
         * and price is given for making a bill. Write a java program using switch
         * statements to prepare a bill.
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Amount:= ");;
        float price = sc.nextFloat();

        System.out.println("Enter the Item-Code:= ");
        int code = sc.nextInt();

        float tax;
        String item;

        switch(code){
            case 1:
            tax = price * 0.02f;
            item = "Seat Covers";
            break;

            case 2:
            tax = price * 0.03f;
            item = "Steering Wheels";
            break;

            case 3 :
            tax = price * 0.04f;
            item = "Car Lightings";
            break;

            case 4:
            tax = price * 0.025f;
            item = "Air Purifiers";
            break;

            default:
            tax = price * 0.012f;
            item = "Other Items";
        }

        System.out.println("Amount := "+ price);
        System.out.println("Tax Amount:= "+tax+"%");
        System.out.println("Net Amount:= "+(price+tax));

        sc.close();
    }
}
