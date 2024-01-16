//inheritanace-properties and methods of base class are passd on to a derived class
public class LOOPs4 {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();

        //
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
    
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println(" swims in water");
    }
}
//types of inheritance
//1-single level inheritance
//base class->dderived class   eg., Animal->Fish
//2-multi level inheritance
//base class-> dderived class->derived class  eg., Animal->mammals->dog

class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String bread;
}
//3-
//4-hybrid inheritrance-combination of every clas
//Animal->fish->tuna
       //->bird->peacock
