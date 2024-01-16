//super keyword-used to refer immediate parent class object
public class LOOPs13 {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is callewe");
    }
}
class Horse extends Animal{
    Horse(){
        
        super.color="brown";
        System.out.println("horse constructor called");
    }
}