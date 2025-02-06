package cons;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(14, 53, 52, 342, 252, 23);
        System.out.println(list);
//        list.stream().forEach(e-> System.out.println(e));
        list.stream().forEach(System.out::println);

    }
}
