class MyThread extends Thread{

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
   public void run(){
     for(int i=1; i<=10; i++){
        System.out.println("X " + name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            return;
        }
    }
   }
}

public class Main {
    public static void main(String[] args){
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");
        MyThread t3 = new MyThread("Thread3");
        MyThread t4 = new MyThread("Thread4");
        MyThread t5 = new MyThread("Thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Hello");

    }
}
