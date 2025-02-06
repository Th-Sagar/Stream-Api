package ref;

import java.time.LocalDate;

public class Stuff {
    static void doSuff(){
        System.out.println("Do suff");
        System.out.println("This is second line");
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());


    }

    public static void threadTask(){
        for(int i =1;i<=10;i++){
            System.out.println(i*2);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
