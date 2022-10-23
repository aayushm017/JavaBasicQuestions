import java.util.ArrayList;

public class BackTracking {
    public static void main(String[] args) {
        //System.out.println(count(4,4));
        //path("", 3,3);
        //System.out.println(pathRet("", 3,3));
        //System.out.println(pathRetDiagonal("", 3,3));

        boolean[][] board={
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        //pathRestrictions("", board, 0,0);
        allPath("", board, 0, 0);
    }
    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1, c);
        int right=count(r, c-1);
        return left+right;
    }

    public static void path(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p + 'D', r-1, c);
        }
        if(c>1){
            path(p + 'R', r, c-1);
        }
    }

    public static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>(); //local variable

        if(r>1){
            list.addAll(pathRet(p + 'D', r-1, c));
        }
        if(c>1){
            list.addAll(pathRet(p + 'R', r, c-1));
        }
        return list;
    }

    public static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>(); //local variable

        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p +'D', r-1, c-1));
        }
        if(r>1){
            list.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }
        return list;
    }

    public static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestrictions(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R', maze, r, c+1);
        }
    }

    public static void allPath(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        //I am considering this block in my path
        maze[r][c]=false;

        if(r<maze.length-1){
            allPath(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            allPath(p+'R', maze, r, c+1);
        }
        if(r>0){
            allPath(p+'U', maze, r-1, c);
        }
        if(c>0){
            allPath(p+'L', maze, r, c-1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c]=true;
    }
}
