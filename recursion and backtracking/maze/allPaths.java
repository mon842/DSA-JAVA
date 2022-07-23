import java.util.Arrays;

public class allPaths {
    public static void main(String[] args) {
        boolean board[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        all("",board,0,0);
        int p[][]= new int[board.length][board[0].length];
        allPrint("",board,0,0,p,1);
    }
    static void all(String p, boolean maze[][] , int r,int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c]=false;
//        marking the paths that have been walked
        if (c <maze.length-1) {
            all(p + 'R',maze, r, c + 1);
        }
        if (r < maze[0].length-1) {
            all(p + 'D',maze, r + 1, c);
        }
        if (r > 0) {
            all(p + 'U',maze, r - 1, c);
        }
        if (c >0) {
            all(p + 'L',maze, r, c - 1);
        }
//        this is the line where the function is finished
//        so before the function is removed, clearing all the markings made previously
        maze[r][c]=true;
    }

    static void allPrint(String p, boolean maze[][] , int r,int c,int path[][] ,int step) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            path[r][c]=step;
            System.out.println(p);
            for (int arr[] : path){
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
//        marking the paths that have been walked
        if (c <maze.length-1) {
            allPrint(p + 'R',maze, r, c + 1,path,step+1);
        }
        if (r < maze[0].length-1) {
            allPrint(p + 'D',maze, r + 1, c,path,step+1);
        }
        if (r > 0) {
            allPrint(p + 'U',maze, r - 1, c,path,step+1);
        }
        if (c >0) {
            allPrint(p + 'L',maze, r, c - 1,path,step+1);
        }
//        this is the line where the function is finished
//        so before the function is removed, clearing all the markings made previously
        maze[r][c]=true;
        path[r][c]=0;
    }
}
