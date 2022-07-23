public class N_nights {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];
        fun(board,0,0,4);
    }
    static void fun(boolean board[][],int row,int col,int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (col== board.length && row== board.length-1){
            return;
        }
        if (col== board.length){
            fun(board,row+1,0,knights);
            return;
        }
        // checking then placing the knight
        if (safe(board,row,col)){
            board[row][col]=true;
            fun(board,row,col+1,knights-1);
            board[row][col]=false;
        }
        fun(board,row,col+1,knights);
    }
    static boolean isvalid(boolean board[][],int row, int col){
        if (col >=0 && col< board.length && row>=0 && row< board.length){
            return true;
        }
        return false;
    }
    private static boolean safe(boolean board[][],int row,int col){
        if (isvalid(board,row-2,col-1)){
            if (board[row-2][col-1])
                return false;
        }
        if (isvalid(board,row-2,col+1)){
            if (board[row-2][col+1])
                return false;
        }
        if (isvalid(board,row-1,col-2)){
            if (board[row-1][col-2])
                return false;
        }
        if (isvalid(board,row-1,col+2)){
            if (board[row-1][col+2])
                return false;
        }

        return true;
    }
    private static void display(boolean board[][]){
        for (boolean[] row: board){
            for (boolean element:row){
                if (element)
                    System.out.print("k ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
