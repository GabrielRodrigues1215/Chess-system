/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import boardgame.Board;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cast
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        while(true){
            try{
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.err.println();
            System.err.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capChessPiece = chessMatch.performChessMove(source, target);
            }
            catch(ChessException e){
                System.err.println(e.getMessage());
                sc.nextLine();
            }   
            catch(InputMismatchException e){
                System.err.println(e.getMessage());
                sc.nextLine();
            }
            
        }
        
    }
    
}
