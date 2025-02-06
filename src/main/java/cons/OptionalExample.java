package cons;

import java.util.Optional;

public class OptionalExample {

//    String name;

    public static Optional<String> getName(){
        String name = "Durgesh";
        return Optional.ofNullable(name);
    }


    public static void main(String[] args) {

        String str = "Not null";
//        if(str==null){
//            System.out.println("This is null");
//        }else {
//            System.out.println(str.length());
//        }


        Optional<String> str1 = Optional.ofNullable(str); // create optional
        System.out.println(str1.isPresent());
//        System.out.println(str1.get());
        System.out.println(str1.orElse("Null"));


        Optional<String> name = getName();
        System.out.println(name.orElse("Function return null"));

    }
}
