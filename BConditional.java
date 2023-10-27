import java.rmi.Naming;
import java.util.Scanner;
//odd / even
public class BConditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Num is Even");
        }else{
            System.out.println("Num is Odd");
        }
    }
}
