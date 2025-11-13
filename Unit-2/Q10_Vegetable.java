
abstract class Vegetable{
     String color;
    Vegetable(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }
}

class Cabbage extends Vegetable{
    Cabbage(String color){
        super(color);
    }

    public String toString(){
        return "Cabbage is "+color;
    }
}

class Carrot extends Vegetable{
    Carrot(String color){
        super(color);
    }
    public String toString(){
        return "Carrot is "+color;
    }
}

class Potato extends Vegetable{
    Potato(String color){
        super(color);
    }

    public String toString(){
        return "Potato is "+color;
    }
}

public class Q10_Vegetable {
    public static void main(String[] args) {
        
        /*Q10. The abstract Vegetable class has four subclasses named cabbage, 
carrot and potato. Write an application that demonstrates how to 
establish this class hierarchy. Declare one instance variable of type 
string that indicates the color of a vegetable. Create and display 
instances of these object. Override the toString() method of object 
to return a string with the name of the vegetable and its color. {
            
        } */

        Vegetable v;
        v = new Cabbage("Green");
        System.out.println(v.toString());
        v = new Carrot("Red");
        System.out.println(v.toString());
        v = new Potato("Brown");
        System.out.println(v.toString());

        System.out.println(v);
    }
    
}
