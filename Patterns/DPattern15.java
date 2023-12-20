//hollow rhombus
public class DPattern15 {
    public static void main(String[] args) {
        int r=5;

        //outer loop-rowa
        for(int i=1;i<=r;i++){
            //inner loop -columns
            //spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
