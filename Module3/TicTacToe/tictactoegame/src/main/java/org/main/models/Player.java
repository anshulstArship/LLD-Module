package org.main.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public  abstract class Player {
    private GameSymbol symbol;

    public Player(GameSymbol symbol) {
        this.symbol=symbol;
    }
    public abstract BoardCell makeMove(Board board);


}
