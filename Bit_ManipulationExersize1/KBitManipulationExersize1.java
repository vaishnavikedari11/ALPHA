// What is the value of x^x for any valueof x?
//answer ==because of same operator (x),so x^x=0

// Swap two numbers without using any thirdvariable.

public class KBitManipulationExersize1 {
    //using x^x=0 property
    public static void main(String[] args) {
        int x=3,y=4;
        System.out.println("before swap : x="+ x +" and  y = "+y);
        //swap using xor;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap : x="+ x + " and y ="+y);
    }
}
