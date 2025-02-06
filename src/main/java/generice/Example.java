package generice;

public class Example {
    public static void main(String[] args) {

//        Box box = new Box("water");

//        System.out.println(box.getValue());
        Box<String> box = new Box<String>("water");

        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer> box1 = new Box<Integer>(1);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

        box.performSomeTask();
        box1.performSomeTask();

    }
}
