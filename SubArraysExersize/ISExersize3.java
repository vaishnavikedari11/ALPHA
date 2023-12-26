// Write a program to FindTransposeofa Matrix. 
//What is Transpose? 
//Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,
//Matrix a11    a12    a13 
//        a21    a22    a23
//Transposed Matrix 
//a11    a21 
//a12    a22
// a13    a23

public class ISExersize3 {
    public static void main(String[] args) {
        int row=2,col=3;
        int matrix[][]={{2,3,7},{5,6,7}};
        //display original matrix
        printMatrix(matrix);
        //transpose the matriux
        int transposse[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transposse[j][i]=matrix[i][j];
            }
        }
        //print transposed matrix
        printMatrix(transposse);
    }
    public static void printMatrix(int matrix[][]) {
        System.out.println("the matrix is=");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        
    }
}
