//interfaces

//it is blueprint of class 
//class is blueprint of object
//which features are held in any object that said by interfaces
//class said that features implimented and makes other objects
//making hierarchy interfaces used
//important work of interaces--
//1-implement- multiple inheritance(we have more than one parent class nd properties of that all parent class contain by child class)
//2-total abstraction-

//properties-defined by interface keyword                ;class define by class keyword
//           inherit interface we write implements       ;inherit class we write extends

//all methods are public ,abstract and without implementation
//used to achive total abstraction
//variables in interfaces are final(value will be remains as it is) ,public and static(variables created only once in class).

//1 -make interface->then make function ,which is by defualtpublic ,abstrct->then make class which implements interface
//->recreating function in class use public  ,and print .
//in main function make object of class  
public class LOOPs10 {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();
        
    }
}

interface ChessPlayer{
    void moves();
    
}
class Queen implements  ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all dirction)");
    }
    
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down ,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left ,right,diagonal(by 1 step) ");
    }
}
