//Kiersten Chou, 12/5/24

import java.util.Scanner;

class Driver {
    
    public static void main(String[] args) {
        ticTacToe test = new ticTacToe();
        Scanner in = new Scanner(System.in);
        String inputMove = "";
        while (!test.won) {
            test.display();
            inputMove = in.nextLine();
            test.placePieces(inputMove);
        }
    }
}