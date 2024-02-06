//binary  strings problem
//print all binary strings of size n without consecutive ones

public class MRecursion14 {
    public static void printBinaryStrings(int n,int lasatplace ,String str) {
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //work
        // if(lasatplace==0){
        //     //sit 0 on chair n
        //     printBinaryStrings(n-1, 0, str.append("0"));
        //     printBinaryStrings(n-1, 1, str.append("1"));

        // }else{
        //     printBinaryStrings(n-1, 0, str.append("0"));
        // }
        printBinaryStrings(n-1, 0, str+"0");
            if(lasatplace==0){
                printBinaryStrings(n-1, 1, str+"1");
            }
    }
    public static void main(String[] args) {
        printBinaryStrings(3, 0, new String(""));
    }
}
