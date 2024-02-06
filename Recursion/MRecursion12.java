//remove duplicates in string

public class MRecursion12 {
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]) {
        //base case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        //work
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
        //caaling inner function

    }
    public static void main(String[] args) {
        String str=" appnnacollege ";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
