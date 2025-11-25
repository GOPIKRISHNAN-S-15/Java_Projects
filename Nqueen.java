public class Nqueen {
    static void printSolution(int[][] board, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }     
            }
            System.out.println();
             
        }
        System.out.println();
    }
    static boolean isSafe(int[][] board, int row, int col, int n){
        for(int  i=0;i<row;i++){
            if(board[i][col]==1)
                return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
    static boolean solveNQ(int[][] board, int row, int n){
        if(row == n){
            printSolution(board, n);
            return true;
        }
        boolean res = false;
        for(int col =0;col<n;col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 1;
                res = solveNQ(board, row+1, n) || res;
                board[row][col] = 0;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int n = 6;
        int[][] board = new int[n][n];
        if(!solveNQ(board, 0, n)){
            System.out.print("Solution does not exist");
        }
    }
}
