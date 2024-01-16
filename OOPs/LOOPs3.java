//encapsulation-wrapping up data and methods under single unit .it implements data hiding
//example--making class in that we define peroperties and functions.
public class LOOPs3 {
    public static void main(String[] args) {
        //object creation
        Student s2=new Student("Shradha");
        System.out.println(s2.name);

        Student s1=new Student();
        Student s3 =new Student(123);
        //Student s4=new Student(" aman",355);
        Student s5=new Student();
        s5.password="adbjlfkj";
       
    }
}
   //constructor-initialized an obbject,
class Student{
    String name;
    int roll;
    
    // //making function /constructor
    // Student(String name){
    //     this.name=name; 
    //     }

     //types of constuctor
     //1-non-parameterized constructor
     Student(){
        System.out.println("construxtor is called");
     } 
     //2-parameterized constructor
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }

    //3-copy constructor-made automatically-it can copy info of one object in other 
    String password;
    int marks;
    Student (Student s5){
    }




}
   
   
    

