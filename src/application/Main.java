package application;

import chess.ChessMetch;
import chess.ChessPiece;
import chess.ChessPosition;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMetch chessMetch = new ChessMetch();

        while (true){
            UI.printBoard(chessMetch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMetch.performChessMove(source, target);
        }


    }
}