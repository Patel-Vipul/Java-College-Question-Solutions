
import java.util.Scanner;


class ComplexNumber{
    
    private float real;
    private float imag;

    //construtctor
    public ComplexNumber(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }

    // method to add
    ComplexNumber add(ComplexNumber c){
        float r = this.real+c.real;
        float i = this.imag+c.imag;

        return new ComplexNumber(r, i);     //return new object
    }
    
    //method to subtract
    ComplexNumber subtract(ComplexNumber c){
        float r = this.real - c.real;
        float i = this.imag - c.imag;
        return new ComplexNumber(r,i);
    }

    //method to multiply
    ComplexNumber multiply(ComplexNumber c){
        float r = (this.real*c.real) - (this.imag*c.imag);
        float i = (this.real*c.imag) + (this.imag*c.real);
        return new ComplexNumber(r,i);
    }

    //function to display
    void display(){
        System.out.println(real+"+"+imag+"i");
    }
    
    //getters
    float getReal(){
        return this.real;
    }

    float getImag(){
        return this.imag;
    }
}



public class Q7_ComplexNumber {
    public static void main(String[] args) {
        
        /*
         * Q7. Create a complex number class. The class should have a constructor 
and methods to add, subtract and multiply two complex numbers 
and to return the real and imaginary parts. 
         */

         Scanner sc = new Scanner(System.in);

         System.out.print("\nEnter r1:= ");
         float real1 = sc.nextFloat();
         System.out.print("\nEnter i1:= ");
         float imag1 = sc.nextFloat();
         System.out.print("\nEnter r2:= ");
         float real2 = sc.nextFloat();
         System.out.print("\nEnter i2:= ");
         float imag2 = sc.nextFloat(); 

         ComplexNumber c1 = new ComplexNumber(real1, imag1);
         ComplexNumber c2 = new ComplexNumber(real2, imag2);

         ComplexNumber sum = c1.add(c2);
         ComplexNumber diff = c1.subtract(c2);
         ComplexNumber product = c1.multiply(c2);

         System.out.println("First Number:= "); c1.display();
         System.out.println("Second Number:= "); c2.display();

         System.out.println("Addition:= "); sum.display();
         System.out.println("Subtraction:= "); diff.display();
         System.out.println("Multiplication:= "); product.display();
    }
}
