//   ***** 
//   *****
//   *****
//   *****
public class DPattern1 {
    public static void main(String[] args) {
        int r=4;
        int c=5;
            //outer loop-for rows
        for(int i=1;i<=r;i++){
            //inner loop-for columns
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
