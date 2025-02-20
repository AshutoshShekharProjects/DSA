import java.util.ArrayList;
import java.util.List;

//public class NQueen {
    class NQueen {

        public boolean isSafe(int row, int col, char[][] board){
            //horizontal
            for(int c=0;c<board.length;c++){
                if(board[row][c]=='Q'){
                    return false;
                }
            }
            //vertical
            for(int c=0;c<board.length;c++){
                if(board[c][col]=='Q'){
                    return false;
                }
            }
            //upper-left
            int r=row;
            for(int c=col;c>=0 && r>=0;c--,r--){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            //upper-right
            r=row;
            for(int c=col;c<board.length && r>=0;c++,r--){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            //lower-left
            r=row;
            for(int c=col;c>=0 && r<board.length;c--,r++){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            //lower-right
            r=row;
            for(int c=col;c<board.length && r<board.length;c++,r++){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            return true;
        }

        public void saveBoard(char[][] board,List<List<String>> allboard){
            String row="";
            List<String> newboard=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                row="";
                for(int j=0;j<board.length;j++){
                    if(board[i][j]=='Q'){
                        row+='Q';
                    } else {
                        row+='.';
                    }
                }
                newboard.add(row);
            }
            allboard.add(newboard);
        }

        public  void setPlace(char[][] board, List<List<String>> allboard, int col){
            if(col==board.length){
                saveBoard(board,allboard);
                return;
            }
            for(int row=0;row<board.length;row++){
                if(isSafe(row,col,board)){
                    board[row][col]='Q';
                    setPlace(board,allboard,col+1);
                    board[row][col]='.';
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            List<List<String>> allboard= new ArrayList<>();
            char[][] board=new char[n][n];
            setPlace(board,allboard,0);
            return allboard;
        }
        public static void main(String[] args){
            NQueen s=new NQueen();
            System.out.println(s.solveNQueens(4));
        }
    }


//}
