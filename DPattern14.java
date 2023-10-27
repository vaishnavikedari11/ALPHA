//hollow butterfly
public class DPattern14 {
    public static void main(String[] args) {
        int r=5;

        //upper part
        for(int i=1;i<=r;i++){
            //spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
