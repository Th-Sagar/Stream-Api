import java.util.ArrayList;
import java.util.List;

public class StreamMain1 {
    public static void main(String[] args) {

        //creating a list and filter all even numbers from list
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10);

//        System.out.println(number);
        // without stream
        List<Integer> even = new ArrayList<>();

        for(Integer i : number){
            if(i%2==0){
                even.add(i);
            }
        }

        System.out.println(number);
        System.out.println(even);

        List<Integer> odd = number.stream().filter(x->x%2!=0).toList();
        System.out.println(odd);

    }
}
