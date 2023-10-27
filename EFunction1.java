import java.util.Scanner;

import javax.print.attribute.standard.PrinterName;

//print given name in function
public class EFunction1 {
    public static void printName(String name) {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        printName(name);
    }
}
