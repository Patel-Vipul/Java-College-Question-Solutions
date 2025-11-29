
class OddException extends  Exception{

    public OddException(String msg) {
        super(msg);
    }
    
}

public class Main {
    public static void main(String[] args) {
        
        try {
            
            if(args.length!=5){
                System.out.println("Please pass 5 numbers as argument on command-line");
                return;
            }

            int nums[] = new int[5];
            int countOdd = 0;

            for(int i=0; i<5;i++){
                try{
                nums[i] = Integer.parseInt(args[i]);

                    if(nums[i]%2!=0){
                        countOdd++;
                        throw new OddException("Oops! "+nums[i]+" is a Odd Number");
                    }
            }
            catch(NumberFormatException nfe){
                System.out.println("Error "+nfe);
                return;
            }
            catch(OddException oe){
                System.out.println(oe.getMessage());
            }
            }

            System.out.println("Total Even Numbers are "+(5-countOdd));
            System.out.println("Total Odd Numbers are "+(countOdd));


        } catch (Exception e) {
            System.out.println("Unexpected Error "+ e);
        }

    }
}
