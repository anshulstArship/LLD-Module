package org.main.tictactoegame;

import org.junit.jupiter.api.Test;
import org.main.exceptions.InvalidCreateExceptions;
import org.main.models.*;
import org.main.strategies.RandomPlayingStrategy;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TictactoegameApplicationTests {

    @Test
    public void testCreateGame() throws InvalidCreateExceptions {

        Game game = Game.builder().withSize(3).
                withPlayers(HumanPlayer.builder().symbol(GameSymbol.O).user(new User()).build()).
                withPlayers(new BotPlayer(GameSymbol.X,GameLevel.EASY,new RandomPlayingStrategy())).
                build();

        assertEquals(2,game.getPlayers().size());
    }

    @Test
    public void testCreateBoard(){
        Board board = new Board(3);
        int rowSize = board.getCells().size();
        assertEquals(3,rowSize,"Row size is equal");
        int colSize = board.getCells().get(0).size();
        assertEquals(3,colSize,"Column size is equal");
    }

}
