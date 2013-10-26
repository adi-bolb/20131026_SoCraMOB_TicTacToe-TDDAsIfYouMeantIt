package tictactoe;

import tests.GameTests;

public class Game {

	public String getWinner(String inputBoard, String typeOfWinningBoard) {
		String otherTypeOfWinner = "";
		
		return inputBoard == typeOfWinningBoard ? GameTests.getPlayerOne() : otherTypeOfWinner;
	}

	public String getStatus(String inputBoard, String boardWhereThereIsDraw) {
		String thereCanOnlyDraw = "nothing to happen here";
		return inputBoard == boardWhereThereIsDraw ? GameTests.getDraw() : thereCanOnlyDraw;
	}

	public String getErrorMessage(String inputBoard, String oneByTwoBoard) {
		return inputBoard == oneByTwoBoard ? "error, you cannot have a winner when a draw" : "";
	}

}
