import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // Stream API - collection process
        // collection / group of object

        // 1. blank
        Stream<Object> emptyStream = Stream.empty();
        // emptyStream.forEach(e-> System.out.println(e));


        //2 array, object, collection
        String names[] ={
                "Durgesh",
                "Uttam",
                "Ankit",
                "Divya"
        };

        Stream<String> names1 = Stream.of(names);
        names1.forEach(x-> System.out.println(x));
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        //3
        Stream<Object> build = Stream.builder().build();

        //4
        IntStream stream = Arrays.stream(new int[]{2, 4, 65, 3, 564});
        stream.forEach(x->
                System.out.println(x));


        //5. List, set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        Stream<Integer> stream1 = list2.stream();
        stream1.forEach(x-> System.out.println(x));



    }
}
