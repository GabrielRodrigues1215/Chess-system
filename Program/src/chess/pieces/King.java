/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author Cast
 */
public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }
    public String toString(){
        return "K";
    }
    
}
