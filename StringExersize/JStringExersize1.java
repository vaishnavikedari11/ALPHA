import java.util.Scanner;

//Count how many times lowercase vowels occurred in a String entered by the user.

public class JStringExersize1 {
    public static void main(String[] args) {
        //user input string 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        int count=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
                count++;
            }

        }
        System.out.println("count of lowecase vowels occured in string ="+count);
        

    }
}
