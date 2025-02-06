import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // Stream API - collection process
        // collection / group of object

        // 1. blank
        Stream<Object> emptyStream = Stream.empty();
//        emptyStream.forEach(e-> System.out.println(e));

        String names[] ={
                "Durgesh",
                "Uttam",
                "Ankit",
                "Divya"
        };
        Stream<String> names1 = Stream.of(names);
        names1.forEach(x-> System.out.println(x));

        List<Integer> list = Arrays.asList(1, 2, 3, 4);



    }
}
