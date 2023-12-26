//stringbuilder
public class JString7 {
    public static void main(String[] args) {
      StringBuilder sb=new StringBuilder("");
      for(char ch='a';ch<='z';ch++){
        sb.append(ch);
      }  //abcdefghijklmnopqrstuvw
      System.out.println(sb.length());
    }
}
