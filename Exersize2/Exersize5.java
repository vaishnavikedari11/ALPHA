import java.util.Scanner;

//write a function that takes in age as input and returns if that person is eelligible to vote/not
public class Exersize5 {
    public static boolean printVote(int age) {
        if(age>18){
            return true;
        }else{
            return false;

        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

       System.out.println( printVote(age));

    }
}
