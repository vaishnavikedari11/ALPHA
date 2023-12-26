import java.util.Arrays;

// Determine if 2 Strings are anagrams of each other. What are anagrams?
// If two strings contain the same characters but in a different order,
// they can be said to be anagrams. Consider race and care. In this case,
// race's characters can beformedintoastudy,
// or care's characters can be formed into race. 
//Below is a java program to check if twostrings are anagrams or not.
public class JStringExersize4 {
    public static void main(String[] args) {
        String str="race";
        String str1="care";
        //convert string to lowecase,so we do not want to check seperately for lower case
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        //first check -if the lengths are the same
        if(str.length()==str1.length()){
            //convert strings into char array
            char[] strcharArray=str.toCharArray();
            char[] str1charArray=str1.toCharArray();
            //sort the char array
            Arrays.sort(strcharArray);
            Arrays.sort(str1charArray);
            //if sorted char arryas are same or identical then string is anagram
            boolean result=Arrays.equals(strcharArray,str1charArray);
            if(result){
                System.out.println(str+ " and "+str1+" are anagram of each other");
            }else{
                System.out.println(str+" and "+str1+" are not  anagram of each other");

            }
        }else{
            //case when lengths are  not equal
            System.out.println(str+" and "+str1+" are not  anagram of each other");
        }
    }
}
