//You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.
//  Use a recursive function to solve this problem. 
public class MRecursionExersize2 {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convertIntoString(int number) {
        //base case
        if(number==0){
            return;
        }
        //work
        int lastDigit=number%10;
        convertIntoString(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        convertIntoString(1234);
        System.out.println();
    }
}
