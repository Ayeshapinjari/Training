import java.util.Scanner;
public class N_Queens {
    public static void solve(int[][] board, int row) {
        if (row == N) {//0==4 false 1==4 F
            //System.out.println("One "+row);
            printBoard(board);
            System.out.println();
            return;
        }

        
        for (int col = 0; col < N; col++) { // 0<4 ,1<4

            if (isSafe(board, row, col)) { // B 0 0 => T,B 1 0 => F, B 1 1 => F,B 1 2 => T,

                board[row][col] = 1;   

                solve(board, row + 1); // row=1 

                board[row][col] = 0;   // 
            }
        }
    }

    
    public static boolean isSafe(int[][] board, int row, int col) {

        // it check col => col no same rows are changing
        for (int i = 0; i < row; i++) {//0<0,0<1
            if (board[i][col] == 1)
                return false;// F
        }

       //upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) { //-1 -1 -1>0 
            if (board[i][j] == 1)
                return false;
        }

       // upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) { // -1 1 false
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    
    public static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();//4

        int[][] board = new int[N][N];//0 0 0 0 

        solve(board, 0);// row
    }

    
    
}