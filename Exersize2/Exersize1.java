import java.util.Scanner;

//1-Enters 3 numbers from the user and make a function to print their average.
public class Exersize1 {
    public static int printAverage(int a,int b,int c) {
        int average=(a+b+c)/3;
        System.out.println(average);
        return average;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        printAverage(a, b, c);
    }
}
