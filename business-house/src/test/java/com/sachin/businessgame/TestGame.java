package com.sachin.businessgame;

import java.util.Collections;

import org.junit.Test;

public class TestGame {

	@Test
	public void validInputTest() {

		int noPlayers = 3;

		BoardGame game = new BoardGame();

		// Scanner scn= new Scanner(System.in);

		// int noPlayers= scn.nextInt();

		if (noPlayers < 2) {
			throw new IllegalArgumentException("No. of Player should be > 2");
		}

		// String cellPosition= scn.nextLine();
		// String[] cell=cellPosition.split(",");
		String cellPosition = "E,E,J,H,E,T,J,T,E,E,H,J,T,H,E,E,J,H,E,T,J,T,E,E,H,J,T,H,J,E,E,J,H,E,T,J,T,E,E,H,J,T,E,H,E";
		String[] cell = cellPosition.split(",");
		if (cellPosition.length() != 75) // 38 block + 37 comma
		{
			// throw new IllegalArgumentException("No. of CellSize should be =
			// 75");
		}

		// String diceRoll = scn.nextLine();

		int diceRoll[] = { 4, 4, 4, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11,
				10, 12 };

		int maxMoves = game.getMaxMoves();

		int validMoves = noPlayers * maxMoves + noPlayers * (maxMoves - 1);
		if (diceRoll.length != validMoves) {
			// throw new IllegalArgumentException("No. of Moves should be = " +
			// validMoves);
		}

		game.initialiseGame(noPlayers, cellPosition);

		int curPlayerIndex = 0;

		for (int diceRollPosition = 0, currBlockPos = 0; diceRollPosition < maxMoves
				* noPlayers; diceRollPosition++, currBlockPos++) {

			curPlayerIndex = diceRollPosition % noPlayers;

			Player currentPlayer = game.getPlayers().get(curPlayerIndex);
			currentPlayer.updatePosition(diceRoll[diceRollPosition]);

			if (game.getMAX_CELL_POSITION().equals(currBlockPos)) {
				currBlockPos = 0;
			}

			CellBlock cellBlock = CellBlock.getCellBlock(cell[currBlockPos]);
			currentPlayer.updateAmount(cellBlock.getValue());

			if (cell[currBlockPos].equalsIgnoreCase("H")) {
				cellBlock = game.getHotelBlocks().get(currBlockPos);

				currentPlayer.updateParameter((HotelCellBlock)cellBlock, currBlockPos);
			}
		}

		Collections.sort(game.getPlayers());

		for (Player play : game.getPlayers()) {
			System.out.println(play.toString());
		}

	}

}
