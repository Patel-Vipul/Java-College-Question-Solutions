
class UnitFormatException extends Exception{

    public UnitFormatException(String msg) {
        super(msg);
    }
    
}

public class Main {
    public static void main(String[] args) {
        

        try {
            
            if(args.length!=2){
                System.out.println("Please pass 2 arguments(value-unit) from command-line-arguments");
                return;
            }

            float value;
            String unit;
            try {
                value = Float.parseFloat(args[0]);

                unit = args[1];
                if(!unit.equals("meter") && !unit.equals("centimeter")){
                    throw new UnitFormatException("Please pass 'meter' or 'centimeter' as second argument");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Please pass float/integer value as first argument!");
                return;
            }
            catch(UnitFormatException ufe){
                System.out.println("Error! "+ufe.getMessage());
                return;
            }

            if(unit.equals("meter")){
                System.out.println(value +" cm= "+value/100+" m");
            }else{
                System.out.println(value+" m= "+value*100+ " cm");
            }

        } catch (Exception e) {
            System.out.println("Unexpected Error try again");
        }

    }
}
