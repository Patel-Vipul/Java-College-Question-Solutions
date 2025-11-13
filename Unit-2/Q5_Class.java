
interface numbers{
    int process(int x, int y);
}

class Sum implements numbers{

    @Override
    public int process(int x, int y){
        int sum = x+y;
        return sum;
    }
}

class Average implements numbers{

    @Override
    public int process(int x, int y){
        int average = (x+y)/2;
        return average;
    }
}

public class Q5_Class {
    public static void main(String[] args) {
        /*Q5. Write an interface called numbers, with a method in Process(int x, 
int y). Write a class called Sum, in which the method Process finds 
the sum of two numbers and returns an int value. Write another 
class called Average, in which the Process method finds the 
average of the two numbers and returns an int. */

        // Sum s = new Sum();
        // Average a = new Average();

        // int sum = s.process(4, 5);
        // int average = a.process(4, 10);

        numbers n;
        n = new Sum();
        int sum = n.process(4, 5);

        n = new Average();
        int average = n.process(4,8);

        System.out.println("Sum:= "+sum);
        System.out.println("Average:= "+average);

    }
}
