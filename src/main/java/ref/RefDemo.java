package ref;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning method reference....");

        // provide the implementation of work inter

//        WorkInter workInter=()->{
//            System.out.println("this is do task new method");
//        };
//
        // for static method
//        workInter.doTask();
        //class name:: methodName
        WorkInter workInter=Stuff::doSuff;
        workInter.doTask();

        Runnable runnable = Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();

        // for non static method
        //referring non static method
        //Object :: methodName
        Stuff ob = new Stuff();
        Runnable runnable1 = ob::printNumber;
        Thread thread = new Thread(runnable1);
        thread.start();

    }
}
