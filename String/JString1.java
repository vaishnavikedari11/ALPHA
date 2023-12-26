import java.util.Scanner;

public class JString1 {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        //creating string
         String str="abcsdsakjyuiofjkghfyd";
         String str2=new String("xyz");

         Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();

        //finding length
        System.out.println(str.length());

        //concatenation

        String fname="Shradha";
        String lname="Khapra" ;
        String fullname=fname+" "+lname;
        //CharAt method
        // System.out.println(fullname.charAt(0));

         printLetters(fullname);

    }
}
