class Thread1 extends Thread{
    public void run(){
        for(int i=1; i<=4; i++){
            System.out.println("fybca "+getPriority());
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=1; i<=6; i++){
            System.out.println("sybca " + getPriority());
            // try{
            //     Thread.sleep(500);
            // }catch(InterruptedException ie){
            //     Thread.currentThread().interrupt();
            // }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
            Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }
        System.out.println("tybca ");
    }
}
