import java.util.Scanner;

//make a function to add 2 numbers and return sum 
public class EFunction2 {
    public static int printSum(int a,int b) {
        int sum=a+b;
        System.out.println(sum);

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        printSum(a, b);
    }
}
