import java.util.Scanner;

public class CLoop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num =");
        int num=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(i*num);
        }
    }
}
