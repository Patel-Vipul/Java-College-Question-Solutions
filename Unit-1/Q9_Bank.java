
class Bank{

    private float amount;
    private float rate;
    private int time;

    public Bank(float amount, float rate, int time) {
        this.amount = amount;
        this.rate = rate;
        this.time = time;
    }

    double compoundInterest(){
        double finalAmount = this.amount * Math.pow(1+this.rate/100,5);
        return finalAmount;
    }

    void display(){
        System.out.println("-----Bank-----");
        System.out.println("Total Interest:= "+(compoundInterest()-this.amount));
        System.out.println("Net Amount:= "+compoundInterest());
    }
    
}

public class Q9_Bank {
    public static void main(String[] args) {
        /* Q9. A bank gives 6.5% per annum interest on deposits made in that 
bank. Write a program to calculate the total amount that a person 
will receive after the end of 5 years for a deposit of Rs.5000 for 
compound interest. Create necessary methods and constructors too  */

        float amount = 5000.f;
        Bank b = new Bank(amount, 6.5f, 5);

        b.display();

    }
}
