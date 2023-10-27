// 1
// 12
// 123
// 1234
// 12345
//
public class DPattern6 {
    public static void main(String[] args) {
        int r=5;
    
        //outer loop-for rows
        for(int i=1;i<=r;i++){
            //inner loop -for columns
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
