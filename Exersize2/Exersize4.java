import java.util.Scanner;

//write a function that takes in the radius as input and returns circumference of circle
public class Exersize4 {
    public static double printCircumference(double radius) {
        double circumference=2 * 3.14 *radius ;
        return circumference;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextInt();
        
        System.out.println(printCircumference(radius));
    }
}
