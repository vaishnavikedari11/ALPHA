import java.util.Scanner;

//make a function to check if a number is prime or not
public class EFunction5 {
    public static boolean printPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        if(isPrime(num)){
        System.out.println(num+"is prime");
        }else{
            System.out.println(num+"  is not prime");
        }
    printPrime(num);
    }
}
