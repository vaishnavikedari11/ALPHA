import java.util.Scanner;

//make a function to check given number is even or not
public class EFunction6 {
    public static int findEven(int num) {
        int result;
        result =num%2==0;
        return result;
        
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    findEven(num);
  }  
}
