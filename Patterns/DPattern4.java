// **** 
// *** 
// ** 
// *
public class DPattern4 {
    public static void main(String[] args) {
        int r=4;

        //outer loop -for rows
        for(int i=r;i>=1;i--){
            //inner loop -for columns
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
