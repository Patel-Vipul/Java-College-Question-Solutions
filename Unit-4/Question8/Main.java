class Calculation implements Runnable{
    int start;
    int end;
    public Calculation(int s, int e){
        this.start = s;
        this.end = e;
    }

    @Override
    public void run(){
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum += i;
        }
        float avg = sum/10.f;
        System.out.println("Sum of "+start+" to "+end+" = "+sum);
        System.out.println("Average of "+start+" to "+end+" = "+avg);
    }

}

public class Main{
    public static void main(String[] args) {
        Calculation thread1 = new Calculation(1, 10);
        Calculation thread2 = new Calculation(11, 20);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both tasks are Completed!");
    }
}