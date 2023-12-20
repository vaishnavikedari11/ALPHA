    //     1
    //    212
    //   32123
    //  4321234
    // 543212345    
public class DPattern12 {
    public static void main(String[] args) {
        int r=5;
        //outer loop -rows
        for(int i=1;i<=r;i++){
            //spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            //numbers-first part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //second part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
