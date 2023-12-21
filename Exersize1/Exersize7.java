import java.util.Scanner;

//write a program to enter numbers till user wants and at end it should display the count of positive ,negative and zeroes
public class Exersize7 {

    public static void main(String[] args) {
        int positive=0, negative=0,zeros=0;
        System.out.println("press 1 to continue and 0 to stop");

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        while(input==1){
            System.out.println("Eter your number");
            int number=sc.nextInt();
            if(number>0){
                positive ++;
            }else if(number<0){
                negative ++;
            }else{
                zeros ++;
            }
            System.out.println("press 1 to continue and 0 to stop");
            input =sc.nextInt();
        }
        System.out.println("positive="+positive);
        System.out.println("negative="+negative);
        System.out.println("zeros="+zeros);


    }
}
