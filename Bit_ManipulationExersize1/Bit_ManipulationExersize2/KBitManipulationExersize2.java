import javax.swing.event.SwingPropertyChangeSupport;

//Add 1 to an integer using Bit Manipulation. 
//(Hint: try using Bitwise NOT Operator)
public class KBitManipulationExersize2 {
    public static void main(String[] args) {
        int x= 6;
        System.out.println(x + " + "+ 1 +" is " + -~x);
         x=-4;
        System.out.println(x+ " + "+1 +" is "+ -~x);
         x=0;
        System.out.println(x+"  + "+1+" is "+ -~x);
    }
}
