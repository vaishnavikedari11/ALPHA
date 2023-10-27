import java.util.Scanner;

//make a function to multiply 2 numbers and return the product
public class EFunction3 {
    public static int printProduct(int a,int b) {
        int product=a*b;
        System.out.println(product);
        return product;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();

        printProduct(a, b);
    }
}
