    //    * 
    //   ** 
    //  ***
    // ****
public class DPattern5 {
    public static void main(String[] args) {
        int r=4;
        
        //outer loop-for rows
        for(int i=1;i<=r;i++){
            //inner loop -for columns- space
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
