//Diamond
public class DPattern13 {
    public static void main(String[] args) {
        int r=4;

        //upper part
        for(int i=1;i<=r;i++){
            //spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //lower part
        for(int i=r;i>=1;i--){
            //sp[aces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
