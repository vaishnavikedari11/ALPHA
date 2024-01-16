//static -used to share same variable or method of given class
public class LOOPs12 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="jmv";

        Student s2=new Student();
        System.out.println(s2.schoolName);

        Student s3 =new Student();
        s3.schoolName="abc";
    }
}
class Student{
    String name;
    int roll;
    static String schoolName;

    void setNAme (String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
