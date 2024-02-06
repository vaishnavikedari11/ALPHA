//find permutation
public class OBackTracking3 {
    public static void findPermutations(String str,String ans) {
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            findPermutations(newstr, ans+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutations(str, "");

    }
}
