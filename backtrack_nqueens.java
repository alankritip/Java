import java.util.*;
public class backtrack_nqueens{
    public static boolean isSafe(char board[][],int row,int col){
        //right diagonal up
        for(int i =row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //left diagonal up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        //vertical up
        for(int i=row-1;i>=0;i++){
             if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        //recursion
        if(row==board.length){
            printboard(board);
            return;
        }
        //column
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='.';
            }
        }
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.println(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of chess board:-");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
    }
}