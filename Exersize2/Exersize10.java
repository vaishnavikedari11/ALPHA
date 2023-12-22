import java.util.Scanner;

//write program to print fib0maccy seies n terms where n input bt user 0 1 1 2 3 4 8 13 21....
//in fibonacci series ,a no. is sum of previous 2 no.that come before it.
public class Exersize10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");

        if(n>1){
            for(int i=2;i<=n;i++){
            System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    
    }
}
