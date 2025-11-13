

abstract class Vehicle{
    abstract int numWheels();
}

class Car extends Vehicle{
    int numWheels(){
        return 4;
    }
}

class Truck extends Vehicle{
    int numWheels(){
        return 6;
    }
}

public class Q7_Vehicle {
    public static void main(String[] args) {
        /*
         * Q7. Declare an abstract class Vehicle with an abstract method named 
numWheels().provide subclasses Car and Truck that each 
implements this method. Create instance of these subclasses and 
demonstrate the use of this method 
         */

         Car c = new Car();
        Truck t = new Truck();

        System.out.println("Car has "+c.numWheels()+" Wheels");
        System.out.println("Truck has "+t.numWheels()+" Wheels");

    }
}
