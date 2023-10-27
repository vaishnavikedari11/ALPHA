import java.util.Scanner;

public class CLoop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime= true;
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            if(num==1){
            System.out.println("This is neither prime not Composite");
        }else {
            System.out.println("This is Prime");
        }
        }else{
            System.out.println("This is not prime");
        }

    }
}
