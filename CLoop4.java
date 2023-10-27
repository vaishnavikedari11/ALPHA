import java.util.Scanner;

//menu driven program
public class CLoop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter first number");
        //int a=sc.nextInt();
       // System.out.println("Enter second number");
        //int b=sc.nextInt();
        int input;
        do {
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            }else if(marks>=60 && marks<=89){
                System.out.println("This is also Good");
            }else if(marks>=0 && marks<=59){
                System.out.println("This is Good as well");
            }else{
                System.out.println("invalid");
            }
            System.out.println("Want to comtinue?(yes(1)or no(0))");
            input=sc.nextInt();

        }while input==(1);     
    }
}
