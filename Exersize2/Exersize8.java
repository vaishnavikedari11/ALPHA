import java.util.Scanner;

//two numbers are enterd by user x and n .write a function to find value of one number raised to power of  another ,x^n
public class Exersize8 {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter x=");
        int x=sc.nextInt();
        System.out.println("Enter n=");
        int n=sc.nextInt();

        int result=1;
        for(int i=0;i<n;i++){
            result=result*x;
        }
        System.out.println("x to the power n is ="+result);


    }
}
