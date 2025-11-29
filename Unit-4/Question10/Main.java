class Thread1 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread1");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread2");
        }
    }
}


public class Main {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setPriority(8);
        t2.setPriority(4);

        t1.start();
        t2.start();
    }
}
