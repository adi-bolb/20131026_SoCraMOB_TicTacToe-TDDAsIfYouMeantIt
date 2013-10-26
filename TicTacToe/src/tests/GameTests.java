package tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Game;

public class GameTests {

	private Game game;
	private String playerOne;
	private String oneByTwoBoard;
	private String oneByOneBoard;
	private String zeroByZeroBoard;
	
	@Before
	public void Setup(){
		playerOne = getPlayerOne();
		oneByTwoBoard = "one by two board";
		oneByOneBoard = "one by one board";
		zeroByZeroBoard = "zero by zero";
		game = new Game();
	}
	
	@Test
	public void givenAPlayerAndAn0By0BoardHeWins()
	{
		String inputBoard = "zero by zero";
		String winnerIs = playerOne;
		String typeOfWinningBoard = zeroByZeroBoard;
		
		String actualWinner = game.getWinner(inputBoard, typeOfWinningBoard);

		assertEquals(winnerIs, actualWinner);
	}
	
	@Test
	public void givenAPlayerAndAOneByOneBoardHeWins(){
		String inputBoard = "one by one board";
		String winnerIs = playerOne;
		String typeOfWinningBoard = oneByOneBoard;
		
		String actualWinner = game.getWinner(inputBoard, typeOfWinningBoard);
		
		assertEquals(winnerIs, actualWinner);
	}

	@Test
	public void givenTwoPlayersAndAThreeByThreeBoardGivenZeroPlaysBadFirstPlayerWins(){
		String winnerIs = getPlayerOne();
		String typeOfWinningBoard = "board with three Xs on column and two disparted zeros";
		String inputBoardWithXPlacingTokenToFinalizeColumn = "board with three Xs on column and two disparted zeros";
		String inputBoard = inputBoardWithXPlacingTokenToFinalizeColumn;
		
		String actualWinner = game.getWinner(inputBoard, typeOfWinningBoard); 
		
		assertEquals(winnerIs, actualWinner);
	}
	
	@Test
	public void givenAPlayerAndAOneByTwoBoardWeCannotDetermineWinner(){
		String inputBoard = "one by two board";
		String winnerIs = "error, you cannot have a winner when a draw";
		
		String errorMessage = game.getErrorMessage(inputBoard, oneByTwoBoard);
		
		assertEquals(winnerIs, errorMessage);
	}

	@Test
	public void givenAPlayerAndAOneByTwoBoardWeHaveADraw(){
		String inputBoard = "one by two board";
		String gameStatus = getDraw();
		String boardWhereThereIsDraw = oneByTwoBoard;
		
		String actualGameStatus = game.getStatus(inputBoard,boardWhereThereIsDraw);
		
		assertEquals(gameStatus, actualGameStatus);
	}

	
	@Test
	public void givenAPlayerAndATwoByOneBoardWeHaveADraw(){
		String twoByOneBoard = "two by one board";
		String gameStatus = getDraw();
		String inputBoard = "two by one board";
		String boardWhereThereIsDraw = twoByOneBoard;

		String actualGameStatus = game.getStatus(inputBoard, boardWhereThereIsDraw);
		
		assertEquals(gameStatus, actualGameStatus);
	}
	
	@Test
	public void givenAnyNumberOfPlayersAndOneByThreeBoardWeHaveADraw(){
		String oneByThreeBoard = "one by three board";
		String gameStatus = getDraw();
		String inputBoard = "one by three board";
		String boardWhereThereIsDraw = oneByThreeBoard;
		
		String actualGameStatus = game.getStatus(inputBoard, boardWhereThereIsDraw);
		
		assertEquals(gameStatus, actualGameStatus);
	}

	public static String getDraw() {
		return "Draw";
	}
	
	public static String getPlayerOne() {
		return "player1";
	}
}
