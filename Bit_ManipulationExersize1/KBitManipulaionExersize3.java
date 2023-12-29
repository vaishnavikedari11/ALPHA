//This question is based on a trick, pleasedirectly look at the solution. 
//Convert uppercase characters to lowercase using bits
public class KBitManipulaionExersize3 {
    public static void main(String[] args) {
        //convert uppercase charactor to lowercase
        for(char ch='A';ch<='z'; ch++){
           System.out.println((char)(ch | ' '));
           //prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
