import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

//Find factorial of number 
public class EFunction4 {
    public static int printFactorial(int factorial,int num ) {
        for(int i=num;i>=1;i--){
            
            factorial=factorial*i;
            System.out.println(factorial);
            
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        printFactorial(num,num);
    }
}
