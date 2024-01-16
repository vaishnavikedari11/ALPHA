public class LOOPsExersize4 {
    public static void main(String[] args) {
        Vehicle obj1=new Car();
        obj1.print1();//error occurs 

        Vehicle obj2=new Vehicle();
        obj2.print();
    }
}
class Vehicle{
    void print(){
        System.out.println("Base class(vegicle)");
    }
    void print1(){
        System.out.println("fhkjhjhj");
    }
    
    
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived  clas (Car)");
    }
}

