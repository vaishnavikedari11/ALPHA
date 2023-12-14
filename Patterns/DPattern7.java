// 12345
// 1234
// 123
// 12
// 1
//floyds triangle
public class DPattern7 {
    public static void main(String[] args) {
        int r=5;

        //outer loop -for rows
        for(int i=1;i<=r;i++){
            //inner loop for column
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
