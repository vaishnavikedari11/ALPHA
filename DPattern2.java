// *****
// *   *
// *   *
// *****
public class DPattern2 {
    public static void main(String[] args) {
        int r=4;
        int c=5;

        //outer loop -for rows
        for(int i=1;i<=r;i++){
            //inner loop -for column
            for(int j=1;j<=c;j++){
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
