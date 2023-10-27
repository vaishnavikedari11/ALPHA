import java.util.Scanner;

public class BSwitch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a =");
        int a=sc.nextInt();
        System.out.println("Enter b =");
        int b=sc.nextInt();
        System.out.println("Enter operator");
        int operator=sc.nextInt();

        switch(operator){
            case 1:System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b==0){
                System.out.println("invalid division");
             }else{
                 System.out.println(a/b);
             }
            break;
            case 5:if(b==0){
                System.out.println("invalid division");
            }else{ System.out.println(a%b);
            }
        }
    }
}
