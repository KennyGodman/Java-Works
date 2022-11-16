package chapter9;

import chapter9.TicTacToe.Board;
import chapter9.TicTacToe.Mark;
import chapter9.TicTacToe.Players;
import chapter9.TicTacToe.TicTacToeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chapter9.TicTacToe.Mark.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayersTest {
    private Players player1;
    private Players player2;
    private Board board;
    @BeforeEach
    public void setUp(){
     player1 = new Players(X);
     player2 = new Players(O);
     board = new Board();


    }
    @Test
    public void testThatPlayersExist(){
        assertNotNull(player1);
        assertNotNull(player2);
    }
    @Test
    public void testThatPlayerMarkIsCorrect(){
        assertEquals(X, player1.getMark());
        assertEquals(O, player1.getMark());
    }
    @Test
    void testThatBoardSurfaceCanBeDisplayed() {
        board.displayBoardSurface();
        System.out.println();
    }

    @Test
    void testThatXAppearedOnThePositionPlayerOneSelected() {
        Mark[][] boardSurface = board.getBoardSurface();
        assertEquals(E, boardSurface[0][0]);
        player1.playGame(1, board);
        assertEquals(X, boardSurface[0][0]);
        board.displayBoardSurface();
        System.out.println();
    }

    @Test
    void testThatOAppearedOnThePositionPlayerTwoSelected() {
        Mark[][] boardSurface = board.getBoardSurface();
        assertEquals(E, boardSurface[0][1]);
        player2.playGame(2, board);
        assertEquals(O, boardSurface[0][1]);
        board.displayBoardSurface();
        System.out.println();
    }

    @Test
    void testThatExceptionIsThrownWhenPLayerAttemptsToPlayAtWrongPosition() {
        Mark[][] boardSurface = board.getBoardSurface();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> player1.playGame(51, board));
    }
    @Test
    void testThatPlayerCanOnlyPlayToAPositionThatIsEmpty(){
        Mark[][] boardSurface = board.getBoardSurface();
        assertEquals(E, boardSurface[0][0]);
        player1.playGame(1, board);
        assertEquals(X, boardSurface[0][0]);
        assertThrows(TicTacToeException.class, () ->player2.playGame(1, board));
        assertEquals(X, boardSurface[0][0]);

    }
}
