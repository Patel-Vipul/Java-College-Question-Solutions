
import java.util.Scanner;

public class Q6_Area {

    //method to calculate the area of square
    float Area(float length){
        return  length*length;
    }

    //method to calculate the area of rectangle
    float Area(float length, float breadth){
        return length*breadth;
    }

    public static void main(String[] args) {
        /*
         * rite a program to calculate the area of square and rectangle by 
            overloading the area method. 
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length:= ");
        float length = sc.nextFloat();
        System.out.println("Enter the Breadth:= ");
        float breadth = sc.nextFloat();

        Q6_Area obj = new Q6_Area();
        
        System.out.println(obj.Area(length));
        System.out.println(obj.Area(length,breadth));

    }
    
}
