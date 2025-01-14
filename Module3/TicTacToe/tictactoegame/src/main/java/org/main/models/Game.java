package org.main.models;

import lombok.Getter;
import org.main.exceptions.InvalidCreateExceptions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
public class Game {

    private Game(){

    }
    public static Builder builder(){
        return new Builder();
    }

    private Board board;
    private List<Player> players = new ArrayList<>();
    private GameStatus status;
    private Player winner;

    public void start(){}
    public void makeMove(){}
    private Player checkWinner(){
        return null;
    }
    private Boolean checkDraw(){
        return true;
    }

    public static class Builder {
        private Game game;
        private Builder() {
            this.game = new Game();
        }

        public Builder withSize(int size) {
            game.board = new Board(size);
            return this;
        }
        public Builder withPlayers(Player player) {
            game.getPlayers().add(player);
            return this;
        }

        public Game build() throws InvalidCreateExceptions {
            Game newGame = new Game();
            if(!validate()){
                throw new InvalidCreateExceptions();
            }
            newGame.board=game.board;
            newGame.players=game.players;
            newGame.status=GameStatus.IN_PROGRESS;
            return newGame;

        }
        public boolean validate(){
            if(game.players.size()>2){
                return false;
            }
            Set<GameSymbol> set = game.players.stream().map(Player::getSymbol)
                    .collect(Collectors.toSet());
            if(set.size()>2){
                return false;
            }
            return true;
        }
    }

}
