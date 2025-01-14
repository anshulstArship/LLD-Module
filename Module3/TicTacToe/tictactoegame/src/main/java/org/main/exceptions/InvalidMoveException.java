package org.main.exceptions;

public class InvalidMoveException extends RuntimeException{
    public InvalidMoveException(int row, int col) {
        super("Invalid move: " + row + ", " + col);
    }
}
