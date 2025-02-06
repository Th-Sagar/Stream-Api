import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        // filter (predicate)
        //return boolean value function
        // e-> {
        //return true or false;
        //}



        //map (Function)
        //each element operation


        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");

        List<String> a = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);


        List<Integer> list = List.of(23, 4, 2, 5, 7, 4);
        List<Integer> collect = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);


        names.stream().forEach(e->{
            System.out.println(e);
        });
        a.stream().forEach(System.out::println);

        //sort

        list.stream().sorted().distinct().forEach(System.out::println);
        Integer i = list.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(i);

        Integer i1 = list.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(i1);


    }
}
