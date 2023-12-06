import java.util.Scanner;

public class BConditional2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a =");
        int a=sc.nextInt();
        System.out.println("ENter b =");
        int b=sc.nextInt();

        //conditions
        //1-a=b
        if(a==b){
            System.out.println("a is equal to b");
        }else if(a>b){
            System.out.println("a is greater than b ");
        }else{
            System.out.println("a is less than b");
        }
    }
}
