public class LOOPs6 {
    //method overiding-parent and child classes both contain same function with a different definition

    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }

}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}