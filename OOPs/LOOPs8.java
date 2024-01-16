//Abstratction-hididng all unnecessary details and showing only importatant parts to user
//initialized using following 
//1-abstract classes


public class LOOPs8 {
    
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();

        System.out.println(h.color);

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
    }
}
abstract class Animal{
    String color;
    //constructor
    Animal(){
        color="brown";
        System.out.println("anumal constructor called");
    }
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color ="dark brown";

    }
    Horse(){
        System.out.println("horse constructor called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color ="white";
    }
    Chicken(){
        System.out.println("Chiken constructor called");
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
