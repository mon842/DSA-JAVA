import java.util.*;
public class n_queen {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];
        System.out.println(fun(board,0));
    }
    static int fun(boolean board[][],int row){
        if(row== board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
//      checking the rows and columns and placing Queens
        for (int col = 0; col < board.length; col++) {
//            placing queen if it is safe
            if (safe(board,row,col)) {
                board[row][col] = true;
                count += fun(board, row + 1);
                board[row][col] = false;
            }

        }
        return count;
    }
    private static boolean safe(boolean board[][],int row,int col){
        //vertically up
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }

//        diagonal left
        int maxLeft=Math.min(row,col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][col-i])
                return false;
        }

//        diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row-i][col+i])
                return false;
        }
        return true;
    }
    private static void display(boolean board[][]){
        for (boolean[] row: board){
            for (boolean element:row){
                if (element)
                    System.out.print("Q");
                else
                    System.out.print("X");
            }
            System.out.println();
        }
    }
}
