//         1
//       2   2
//      3  3  3
//     4  4  4  4
//    5  5  5  5  5
public class DPattern11 {
    public static void main(String[] args) {
        int r=5;

        //outer loop -rows
        for(int i=1;i<=r;i++){
            //inner loop-columns
            //spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
