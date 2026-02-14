package Multithreading;


class Thread8 implements  Runnable{
    public void run(){
        for(int i=0;i< 6;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class Threadex extends Thread{

    public void run(){
        for(int i=0;i< 6;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        

        Thread thread1 = new Thread(new Thread8());
        Thread thread2 = new Thread(new Thread8());
        thread1.start();
        thread2.start();

    }
}
