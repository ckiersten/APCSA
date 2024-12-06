//Kiersten Chou, 12/6/24

import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputMove = "";
        ticTacToe.initializeBoard();
        while (!inputMove.toLowerCase().equals("n")) {
            ticTacToe.display();
            ticTacToe.promptMove();
            inputMove = in.nextLine();
            ticTacToe.placePieces(inputMove);
            ticTacToe.checkWin();
            while (!ticTacToe.validMove) {
                ticTacToe.promptMove();
                inputMove = in.nextLine();
                ticTacToe.placePieces(inputMove);
                ticTacToe.checkWin();
            }
            ticTacToe.round++;
            if (ticTacToe.won) {
                ticTacToe.display();
                ticTacToe.promptMove();
                inputMove = in.nextLine();
                if (inputMove.toLowerCase().equals("y")) {
                    ticTacToe.won = false;
                    ticTacToe.round = 1;
                    ticTacToe.validMove = true;
                    ticTacToe.initializeBoard();
                }
            }
        }
    }
}