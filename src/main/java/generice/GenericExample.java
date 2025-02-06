package generice;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        //Generic
        List<String> list = new ArrayList<>();
        list.add("LCWD");

        //non generic
        List anotherlist = new ArrayList();
        anotherlist.add("LCWD");
        anotherlist.add(123);
        anotherlist.add(true);
        anotherlist.add(23.32);

        
        System.out.println("Generic "+list);
        System.out.println("Non generic "+anotherlist);

    }
}
