import java.util.Scanner;

//take an array as input from user .search for given number x and print index at which it occurs.
public class FArrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers=sc.nextInt();
        int array[]=new int[ 9];
        //input
        for(int i=0;i<numbers;i++){
            array[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        //output
        for(int i=0;i<numbers;i++){
        System.out.println(array[i]);
        }
    }
}
