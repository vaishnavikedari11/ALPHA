//making multiple inheritance 
public class LOOPs11 {
    public static void main(String[] args) {
        Bear b1=new Bear();
        b1.eat(); 
    }
}
interface Harbivore{
    void eat();
}
interface Canivore{
    void eat();
}
class Bear implements Harbivore,Canivore{
    public void eat(){
        System.out.println("Eats meat");
    }
}
