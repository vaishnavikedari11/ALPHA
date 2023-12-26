//string function --comapre---(.equals())
public class JString4 {
    public static void main(String[] args) {
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are  not equal");
        }
    }
}
