
import java.util.Scanner;


abstract class Calculation{
    abstract float area(float length, float breadth);
}

class Reactangle extends Calculation{
    public float area(float length, float breadth){
        return length*breadth;
    }
}

class Triangle extends Calculation{
    public float area(float length, float breadth){
        return 0.5f*length*breadth;
    }
}

public class Q9_Area {
    public static void main(String[] args) {
        /*
         * Create class calculation with an abstract method area( ). Create 
            Rectangle and Triangle subclasses of calculation and find area of 
            rectangle and triangle. 
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Length:= ");
         float length =  sc.nextFloat();
        System.out.println("Enter Breadth:= ");
        float breadth = sc.nextFloat();

        Calculation c ;
        c = new Reactangle();
        System.out.println("Area of Reactangle:= "+c.area(length, breadth));

        c = new Triangle();
        System.out.println("Area of Reactangle:= "+c.area(length, breadth));

    }
}
