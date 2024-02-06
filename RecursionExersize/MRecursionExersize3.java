// Write a program to ﬁndLength of aStringusing Recursion.
public class MRecursionExersize3 {
    public static int findLength(String str) {
        //base case
        if(str.length()==0){
            return 0;
        }
        //work
        return findLength(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(findLength(str));
    }
}
