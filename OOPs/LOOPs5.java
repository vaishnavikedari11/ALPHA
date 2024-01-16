//polymorphism-many forms
//1-compilee time polymorphism/static-method overloading
//compiler run our code that time many forms are seen to compiler then compiler understand that forms 
//and if this forms are seen to user while runnung program is called rin time polymorphism.

public class LOOPs5 {
    //method overloading --multiple functions with the same name but different parameters
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));
        
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
