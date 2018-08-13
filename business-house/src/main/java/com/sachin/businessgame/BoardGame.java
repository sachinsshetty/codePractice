package com.sachin.businessgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardGame {
	private Map<Integer, CellBlock> cellBlocks;
	private int diceRolls[];
	private List<Player> players;
	private final int MAX_MOVES_PER_PLAYER = 10;
	private final int MAX_CELL_POSITION = 38;
	private final int PLAYER_INITIAL_AMOUNT = 1000;
	private final int HOTEL_BUY_PRICE = 200;
	private final int HOTEL_RENT_PRICE = 50;
	
	public Integer getMAX_CELL_POSITION() {
		return MAX_CELL_POSITION;
	}

	public Integer getMaxMovesPerPlayer() {
		return MAX_MOVES_PER_PLAYER;
	}

	public Map<Integer, CellBlock> getCellBlocks() {
		return cellBlocks;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void initialiseGame(int noPlayers, String cellInfo, int[] diceRoll) {
		validateInput(noPlayers, cellInfo, diceRoll);
		initialisePlayers(noPlayers);
		initialiseCellBlock(cellInfo);
	}

	public void validateInput(int noPlayers, String cellPosition, int[] diceRoll) {
		if (noPlayers < 2) {
			throw new IllegalArgumentException("No. of Player should be >= 2");
		}

		int maxCellListWithComman = (getMAX_CELL_POSITION() + (getMAX_CELL_POSITION() - 1));
		if (cellPosition.length() != maxCellListWithComman) {
			throw new IllegalArgumentException(
					"No. of CellSize should be " + maxCellListWithComman + " but was " + cellPosition.length());
		}

		int maxMovesPerPlayer = getMaxMovesPerPlayer();

		int validMoves = noPlayers * maxMovesPerPlayer;
		if (diceRoll.length != validMoves) {
			throw new IllegalArgumentException("No. of Moves should be = " + validMoves);
		}

		diceRolls = diceRoll;
	}

	private void initialisePlayers(int noPlayers) {
		players = new ArrayList<Player>(noPlayers);

		for (int i = 0; i < noPlayers; i++) {
			players.add(new Player(i, PLAYER_INITIAL_AMOUNT, MAX_CELL_POSITION, HOTEL_BUY_PRICE, HOTEL_RENT_PRICE));
		}
	}

	private void initialiseCellBlock(String cellInfo) {
		cellBlocks = new LinkedHashMap<Integer, CellBlock>();
		String[] cellType = cellInfo.split(",");

		int position = 0;
		for (String cell : cellType) {
			cellBlocks.put(position, CellBlock.getCellBlock(cell));
			position++;
		}
	}

	public void playGame() {

		int noPlayers = players.size();

		int maxMovesPerPlayer = getMaxMovesPerPlayer();
		int totalMoves = maxMovesPerPlayer * noPlayers;
		for (int diceRollPosition = 0, currBlockPos = 0, curPlayerIndex = 0; diceRollPosition < totalMoves; diceRollPosition++) {

			curPlayerIndex = diceRollPosition % noPlayers;

			Player currentPlayer = getPlayers().get(curPlayerIndex);
			currBlockPos = currentPlayer.updatePosition(diceRolls[diceRollPosition]);

			CellBlock cellBlock = cellBlocks.get(currBlockPos);
			currentPlayer.updateAmount(cellBlock.getValue());

			if (cellBlock instanceof HotelCellBlock) {
				currentPlayer.updateParameter((HotelCellBlock) cellBlock, currBlockPos, players);
			}
		}

	}

	public String displayResults() {
		Collections.sort(getPlayers());

		StringBuilder sb = new StringBuilder();
		for (Player play : getPlayers()) {
			sb.append(play.toString() + "\n");
		}
		return sb.toString();

	}

	public static void main(String args[]) {

		BoardGame game = new BoardGame();

		Scanner scn = new Scanner(System.in);

		int noPlayers = scn.nextInt();

		String cellPosition = scn.nextLine();
		String diceRoll = scn.nextLine();

		scn.close();
		int diceRolls[] = new int[noPlayers * 10];

		int count = 0;
		for (String roll : diceRoll.split(",")) {
			diceRolls[count++] = (Integer.parseInt(roll));

		}

		game.initialiseGame(noPlayers, cellPosition, diceRolls);
		game.playGame();
		String result = game.displayResults();
		System.out.println(result);

	}

}
