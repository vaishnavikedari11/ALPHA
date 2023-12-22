//you are given string s ,you need to reverse the string
public class FArrays10 {
    public static String reverseString(String str) {
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String str="Geeks";
       System.out.println( reverseString(str));
    }
}
