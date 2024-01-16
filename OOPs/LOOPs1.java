//classes and objects
public class LOOPs1 {
    public static void main(String[] args) {
    //public=access specifier 
    pen p1 =new pen(); //created new object
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    //p1.setColor("yellow");
    p1.color="yellow";
    System.out.println(p1.color);

    }
    
}
class pen{
    String color ;
    int tip;

    void setColor(String newcColor){
        color =newcColor;
    }

    void setTip(int newTip){
        tip =newTip;
    }

    BankAccount myAcc= new BankAccount();

}
class BankAccount{
    private String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

