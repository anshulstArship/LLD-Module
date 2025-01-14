package org.main.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Board {

    private int size;
    private List<List<BoardCell>> cell = new ArrayList<>();

    public Board(int size) {
        this.size = size;
        this.cell = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
        List<BoardCell> firstRow = Collections.nCopies(size, new BoardCell());
        List<List<BoardCell>> board = Collections.nCopies(size, firstRow);
        return board;
    }
    public List<List<BoardCell>> getCells() {
        return cell;
    }

    public boolean isEmpty(int row, int col) {
        return cell.get(row).get(col) == null;
    }

    public void update(BoardCell move) {
        cell.get(move.getRow()).get(move.getColumn()).setSymbol(move.getSymbol());
        BoardCell cell = getBoardCell(move.getRow(),move.getColumn());
        cell.setRow(move.getRow());
        cell.setColumn(move.getColumn());
    }

    private BoardCell getBoardCell(int row, int column) {
        return cell.get(row).get(column);
    }
}
