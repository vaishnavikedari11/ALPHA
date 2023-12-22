import java.util.Scanner;

//write a function that calculates greatest common divisor of 2 numbers
public class Exersize9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        while(n1 !=n2){
            if(n1>n2){
                n1=n2-n1;
            }else{
                n2=n2-n1;
            }
        }
        System.out.println("GCD is ="+n2);
    }
}
