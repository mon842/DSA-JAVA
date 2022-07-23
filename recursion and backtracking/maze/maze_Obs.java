public class maze_Obs {
    public static void main(String[] args) {
        m2("",3,3);
        boolean board[][]={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        restrict("",board,0,0);
    }
    static void m2(String p, int r,int c) {
        if (r == 2 && c == 2) {
            return;
        }
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (c != 1) {
            m2(p + 'H', r, c - 1);
        }
        if (r != 1) {
            m2(p + 'V', r - 1, c);
        }
        if (c != 1 && r != 1) {
            m2(p + 'D', r - 1, c - 1);
        }
    }

    static void restrict(String p, boolean maze[][] , int r,int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (c <maze.length-1) {
            restrict(p + 'R',maze, r, c + 1);
        }
        if (r < maze[0].length-1) {
            restrict(p + 'D',maze, r + 1, c);
        }
    }
}
