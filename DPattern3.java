// * 
// **
// *** 
// ****
public class DPattern3 {
    public static void main(String[] args) {
        int r=4;

        //outyer loop-for rows
        for(int i=1;i<=r;i++){
            //inner loop-for column
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
