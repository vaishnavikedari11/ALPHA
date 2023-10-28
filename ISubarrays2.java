import java.util.Scanner;

//spiral matrix
public class ISubarrays2 {
    public static void printSpiral(int matrix[][]){
        int startr=0;
        int startc=0;
        int endc=matrix.length-1;
        int endr=matrix[0].length-1;

        while(startr<=endr && startc<=endc){
            //top
            for(int j=startc;j<=endc;j++){
                System.out.print(matrix[startr][j]+" ");
            }
            //right
            for(int i=startr+1;i<=endr;i++){
                System.out.print(matrix[i][endc]+" ");
            }
            //bottm
            for(int j=endc-1;j>=startc;j--){
                if(startr==endr){
                    break;
                }
                System.out.print(matrix[endr][j]+" ");
            }
            //left
            for(int i=endr-1;i>=startr+1;i--){
                if(startc==endc){
                    return;
                }
                System.out.print(matrix[i][startc]+" ");
            }

            startc++;
            startr++;
            endc--;
            endr--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    printSpiral(matrix);

    }
}
