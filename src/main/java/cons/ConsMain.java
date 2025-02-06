package cons;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("Learning constructor reference");

//        Provider provider = ()->{
//          return new Student();
//        };
//
//        Student student = provider.getStudent();
//        student.display();

        //constructor reference
        //ClassName:: new
        Provider provider = Student:: new;
        Student student = provider.getStudent();
        student.display();
    }
}
