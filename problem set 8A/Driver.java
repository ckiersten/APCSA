//Kiersten Chou, 12/7/24

import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputMove = "";
        ticTacToe.initializeBoard();
        while (!inputMove.toLowerCase().equals("n")) {
            ticTacToe.display();
            do {
                ticTacToe.promptInput();
                inputMove = in.nextLine();
                ticTacToe.placePieces(inputMove);
                ticTacToe.checkWin();
            } while (!ticTacToe.validMove);
            ticTacToe.round++;
            if (ticTacToe.won) {
                ticTacToe.display();
                ticTacToe.promptInput();
                inputMove = in.nextLine();
                if (inputMove.toLowerCase().equals("y")) {
                    ticTacToe.reset();
                    ticTacToe.initializeBoard();
                }
            }
        }
    }
}