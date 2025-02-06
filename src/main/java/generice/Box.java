package generice;

public class Box<T> {
    //object class is top most parent class of all java class
    //Object doesn't provide type saftey

    // T is data type. And the first register data will be valid for rest of the object like obj give integer at first then all value will be taken as integer it will throw error if it will take string
    T container;


    public Box(T container){
        this.container=container;
    }

    public void performSomeTask(){
        if(container instanceof String){

            System.out.println("Length of "+ container + " is " +(((String) this.container).length()));

        }else if( container instanceof Integer){
            System.out.println("This is integer value " + container);
        }

    }

    public T getValue(){
        return this.container;
    }

}
