import java.util.Scanner;

//make a function to print table of given number n
public class EFunction7 {
    public static int printTable(int n) {
        for(int i=1;i<=10;i++){
            int result=n*i;
            System.out.println(n+"*"+i+ "="+result);
            
        }
        return n;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        printTable(n);
    }
}
