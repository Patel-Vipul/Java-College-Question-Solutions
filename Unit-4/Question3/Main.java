
class RangeException extends Exception{

    public RangeException(String msg) {
        super(msg);
    }
    
}

public class Main {
    public static void main(String[] args) {

        try {
            
            if(args.length!=5){
                System.out.println("Error! Please Enter 5 ages!");
                return;
            }
            
            int ages[] = new int[5];
        for(int i=0; i<5;){
            try{
                ages[i] = Integer.parseInt(args[i]);
                if(ages[i] < 1 || ages[i]>100){
                    throw new RangeException("Invalid Range! Age should be between 0-100");
                }

                i++;
            }catch(NumberFormatException nfe){
                System.out.println("Invalid Input! Please enter age in integer");
                return;
            }
            catch(RangeException re){
                System.out.println(re.getMessage());
                return;
            }
        }

        float sum = 0.0f;
        for(float age: ages){
            sum += age;
        }

        System.out.println("Average:= "+(sum/5));
        } catch (Exception e) {
            System.out.println("Unexpected error! " + e);
        }

    }
}
