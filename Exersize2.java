import java.util.Scanner;

//2-write a functiuon to print sum of all odd numbers from 1 to n
public class Exersize2 {
    public static int printOdd(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
            System.out.println(sum);
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printOdd(n);
    }
}
