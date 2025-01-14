package org.main.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCell {
    private int row;
    private int column;
    private GameSymbol symbol;
}
