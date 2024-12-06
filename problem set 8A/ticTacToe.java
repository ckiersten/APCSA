//Kiersten Chou, 12/6/24

class ticTacToe {

    static String[][] board = new String[3][3];
    static int round = 1;
    static boolean won = false;
    static boolean validMove = true;

    public static void initializeBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = " ";
            }
        }
    }

    public static void display() {
        if (!won) System.out.println("Round " +round+ ":");
        else System.out.println("GAME COMPLETE!");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c].equals(" ")){
                    System.out.print("[ ]");
                } else if (board[r][c].equals("O")) {
                    System.out.print("[O]");
                } else if (board[r][c].equals("X")) {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
    }

    public static void promptMove() {
        if (!won) {
            if (round % 2 == 1) {
                System.out.print("X, make your move (row,col) : ");
            } else {
                System.out.print("O, make your move (row,col) : ");
            }    
        } else System.out.print("Play again? Y/N ");
    }

    public static void placePieces(String str) {
        int commaPlace = str.indexOf(",");
        if (commaPlace < 0) {
            validMove = false;
            return;
        }
        int row = Integer.parseInt(str.substring(0, commaPlace));
        int column = Integer.parseInt(str.substring(commaPlace+1));
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length) validMove = false;
        for (int r = 0; r < board.length; r++) {
            if (r == row) {
                for (int c = 0; c < board[0].length; c++) {
                    if (c == column) {
                        if (round % 2 == 1) {
                            if (board[r][c] == " ") {
                                board[r][c] = "X";
                                validMove = true;
                            }    
                            else validMove = false;
                        }
                        else {
                            if (board[r][c] == " ") {
                                board[r][c] = "O";
                                validMove = true;
                            }    
                            else validMove = false;
                        }
                    }
                }   
            }
        }
    }

    public static void checkWin() {
        for (int r = 0; r < board.length; r++) {
            if (!board[r][0].equals(" ") && board[r][0].equals(board[r][1]) && board[r][1].equals(board[r][2])) {
                won = true;
            }
        }
        for (int c = 0; c < board[0].length; c++) {
            if (!board[0][c].equals(" ") && board[0][c].equals(board[1][c]) && board[1][c].equals(board[2][c])) {
                won = true;
            }
        }
        if (!board[0][0].equals(" ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            won = true;
        }
        if (!board[0][2].equals(" ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            won = true;
        }
    }
}