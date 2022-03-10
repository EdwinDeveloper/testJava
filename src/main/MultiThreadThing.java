package main;

//public class MultiThreadThing extends Thread {
public class MultiThreadThing implements Runnable{
    private int threadNumber;
    public  MultiThreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 1; i < 3; i++) {
            System.out.println("Number "+ i + " from thread " + threadNumber);
//
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
