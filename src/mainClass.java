import main.MultiThreadThing;

public class mainClass {
    public static void main(String args[]){
//        MultiThreadThing threadClass = new MultiThreadThing();
//        MultiThreadThing threadClass2 = new MultiThreadThing();
//        System.out.println("Entrada 1");
//        threadClass.run();
//        System.out.println("Entrada 2");
//        threadClass2.run();
//        System.out.println("Entrada 3");
        for (int i = 0; i < 4; i++) {
            MultiThreadThing mtt = new MultiThreadThing(i);
            Thread thread = new Thread(mtt);
            //mtt.run();
            thread .start();
            System.out.println("Check thread : "+ thread.isAlive());
//            try{
//                thread.join();
//            }catch (InterruptedException e){
//
//            }

        }
        //throw new RuntimeException();
    }
}
