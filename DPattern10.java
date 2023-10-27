//rhombous
public class DPattern10 {
    public static void main(String[] args) {
        int r=5;

        //outer loop-rows
        for(int i=1;i<=r;i++){
            //inner loop-for columns
            int spaces=2*(r-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
