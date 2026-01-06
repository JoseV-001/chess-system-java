package application;

import chess.ChessMetch;

public class Main {
    public static void main(String[] args) {

        ChessMetch chessMetch = new ChessMetch();
        UI.printBoard(chessMetch.getPieces());

    }
}