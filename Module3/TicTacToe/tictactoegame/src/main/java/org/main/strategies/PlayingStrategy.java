package org.main.strategies;

import org.main.models.Board;
import org.main.models.BoardCell;

public interface PlayingStrategy {
    BoardCell makeMove(Board board);
}
