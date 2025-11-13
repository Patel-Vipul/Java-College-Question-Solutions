
import java.util.Scanner;

//     public static void main(String[] args) {
//         /* Q8. A shop during festival season offers a discount 10% for purchase 
// made up to Rs.1,000,12% for purchase value of Rs.1,000 or more up 
// to Rs 1,500 and 15% for purchase value of Rs.1,500 or more. Write 
// a program to implement the above scheme for a given sales and 
// print out the sales and print out the sales value, discount and net 
// amount payable by a customer. Create necessary methods and 
// constructors.  */

//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the Price:= ");
//         float amount = sc.nextFloat();

//         float finalAmount = amount; 

//         if(finalAmount>1500){
//             finalAmount = finalAmount-(finalAmount*0.15f);
//         }
//         else if(finalAmount>1000 && finalAmount<=1500){
//             finalAmount = finalAmount-(finalAmount*0.12f);
//         }
//         else if(finalAmount<=1000){
//             finalAmount = finalAmount-(finalAmount*0.10f);
//         }

//         System.out.print("\n Total Price := "+amount);
//         System.out.print("\n Total discount := "+(amount-finalAmount));
//         System.out.print("\n Net Price := "+finalAmount);

//     }
    
// }

class Discount{

    private float amount;

    //constructor
    public Discount(float amount) {
        this.amount = amount;
    }

    //method To calculate the discount
    float getDiscount(){
        float discount = amount;

        if(discount>=1500){
            discount -= discount*0.15f;
        }
        else if(discount>=1000 && discount<1500){
            discount -= discount*0.12f;
        }
        else if(discount<1000){
            discount -= discount*0.10f;
        }

        return discount;
    }

    void displayBill(){
        System.out.println("-----Bill Details-----");
        System.out.println("Sales Amount:= "+this.amount);
        System.out.println("Discount:= "+(amount - getDiscount()));
        System.out.println("Net Payable Amount:= "+getDiscount());
    }
    
}

public class Q8_Discount{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Price:= ");
        float amount = sc.nextFloat();

        Discount d = new Discount(amount);
        d.displayBill();

    }
}