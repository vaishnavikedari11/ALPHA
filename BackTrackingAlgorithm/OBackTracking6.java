//check if problem can be solved and print only 1 solution to N queens
public class OBackTracking6 {
    public static boolean isSafe(char board[][],int row,int col) {
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //digonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueenss(char board[][],int row) {
        //base case
        if(row==board.length){
            printboard(board);
            return true;
        }
        
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueenss(board, row+1)){;//function call
                    return true;
                }
                board[row][j]='X';//backtracking step
                
            }

        } 
        return false;
    }

    public static void printboard(char board[][]) {
        System.out.println("-------chessboard------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';

            }
        }
       if( nQueenss(board, 0)){
        System.out.println("solution is possible");
        printboard(board);
       }else{
        System.out.println("solution is not possible");
       }
    }
}
