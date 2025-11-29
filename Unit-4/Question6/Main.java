class PrintNumber extends Thread{
    private int range;
    private boolean isEven;

    public PrintNumber(int range, boolean isEven){
        this.range = range;
        this.isEven = isEven;
    }

    public void run(){
        for(int i=0; i<=range; i++){
            if(isEven && i%2==0){
                System.out.println("Even "+i);
                try{
                    Thread.sleep(300);
                }catch(InterruptedException ie){}
            }
            if(!isEven && i%2!=0){
                System.out.println("Odd "+i);
                try{
                    Thread.sleep(300);
                }catch(InterruptedException ie){}
            }
        }
        System.out.println((isEven ? "Even" : "Odd") + " is Completed");
    }

}

public class Main{
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Please pass the range as the arguments!");
            return;
        }

        int range;
        try{
            range = Integer.parseInt(args[0]);
        }catch(NumberFormatException nfe){
            System.out.println("Invalid Input");
            return;
        }
        if(range<1){
            System.out.println("Range cannot be less than 1");
            return;
        }

        PrintNumber even = new PrintNumber(range, true);
        PrintNumber odd = new PrintNumber(range, false);

        even.start();
        odd.start();

        try {
            even.join();
            odd.join();
        } catch (Exception e) {
        }

        System.out.println("Both Thread are Completed!");

    }
}