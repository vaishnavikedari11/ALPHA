//getters and setters
public class LOOPs2 {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}
class pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int tip){
        this.tip=tip;
    }

}
