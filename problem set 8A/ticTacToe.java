//Kiersten Chou, 12/5/24

//import java.util.Scanner;

class ticTacToe {

    static String[][] board = new String[3][3];
    static int round = 1;
    String playerMove = "";
    static boolean won = false;

    public static void display() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == null){
                    System.out.print("[ ]");
                } else if (board[r][c].equals("O")) {
                    System.out.print("[O]");
                } else if (board[r][c].equals("X")) {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
        if (round % 2 == 1) {
            System.out.print("X, make your move (row,col) : ");
        } else {
            System.out.print("O, make your move (row,col) : ");
        }
    }

    public static void placePieces(String str) {
        int row = Integer.parseInt(str.substring(0, 1));
        int column = Integer.parseInt(str.substring(1));
        for (int r = 0; r < board.length; r++) {
            if (board.length == row) {
                for (int c = 0; c < board[0].length; c++) {
                    if (board[0].length == column) {
                        board[r][c] = "X";
                    }
                }   
            }
        }
    }
}