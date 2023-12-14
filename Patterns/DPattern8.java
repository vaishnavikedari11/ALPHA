// 1
// 01
// 101
// 0101
// 10101
// 0-1 triangle
public class DPattern8 {
    public static void main(String[] args) {
        int r=5;

        //outer loop-for rows
        for(int i=1;i<=r;i++){
            //inner loop-for columns
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }
    }
}
