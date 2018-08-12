package com.sachin.businessgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardGame {
	private Map<Integer, String> cellBlocks;
	private Map<Integer, HotelCellBlock> hotelBlocks;
	private int diceRolls[];
	private List<Player> players;
	private final int MAX_MOVES_PER_PLAYER = 10;
	private final int MAX_CELL_POSITION = 38;

	public Integer getMAX_CELL_POSITION() {
		return MAX_CELL_POSITION;
	}

	public Map<Integer, HotelCellBlock> getHotelBlocks() {
		return hotelBlocks;
	}

	public Integer getMaxMovesPerPlayer() {
		return MAX_MOVES_PER_PLAYER;
	}

	public Map<Integer, String> getCellBlocks() {
		return cellBlocks;
	}

	public void setCellBlocks(Map<Integer, String> cellBlocks) {
		this.cellBlocks = cellBlocks;
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
			throw new IllegalArgumentException("No. of Player should be > 2");
		}

		if (cellPosition.length() != 75) // 38 block + 37 comma
		{
			// throw new IllegalArgumentException("No. of CellSize should be =
			// 75");
		}

		int maxMovesPerPlayer = getMaxMovesPerPlayer();

		int validMoves = noPlayers * maxMovesPerPlayer + noPlayers * (maxMovesPerPlayer - 1);
		if (diceRoll.length != validMoves) {
			// throw new IllegalArgumentException("No. of Moves should be = " +
			// validMoves);
		}

		diceRolls = diceRoll;
	}

	private void initialisePlayers(int noPlayers) {
		players = new ArrayList<Player>(noPlayers);

		for (int i = 0; i < noPlayers; i++) {
			players.add(new Player(i));
		}
	}

	private void initialiseCellBlock(String cellInfo) {
		cellBlocks = new LinkedHashMap<Integer, String>();
		hotelBlocks = new HashMap<Integer, HotelCellBlock>();

		String[] cellType = cellInfo.split(",");

		int position = 0;
		for (String cell : cellType) {
			cellBlocks.put(position, cell);
			if (cell.equalsIgnoreCase("H")) {
				hotelBlocks.put(position, new HotelCellBlock());
			}
			position++;
		}
	}

	public void playGame() {

		int noPlayers = players.size();
		int curPlayerIndex = 0;

		int maxMovesPerPlayer = getMaxMovesPerPlayer();
		int totalMoves = maxMovesPerPlayer * noPlayers;
		for (int diceRollPosition = 0, currBlockPos = 0; diceRollPosition < totalMoves; diceRollPosition++, currBlockPos++) {

			if (getMAX_CELL_POSITION().equals(currBlockPos)) {
				currBlockPos = 0;
			}

			curPlayerIndex = diceRollPosition % noPlayers;

			Player currentPlayer = getPlayers().get(curPlayerIndex);
			currentPlayer.updatePosition(diceRolls[diceRollPosition]);

			CellBlock cellBlock = CellBlock.getCellBlock(cellBlocks.get(currBlockPos));
			currentPlayer.updateAmount(cellBlock.getValue());

			if (cellBlocks.get(currBlockPos).equalsIgnoreCase("H")) {
				cellBlock = getHotelBlocks().get(currBlockPos);
				currentPlayer.updateParameter((HotelCellBlock) cellBlock, currBlockPos);
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

		Scanner scn= new Scanner(System.in);

		int noPlayers= scn.nextInt();

		String cellPosition= scn.nextLine();
		String diceRoll = scn.nextLine();

		scn.close();
		int diceRolls[] = new int[noPlayers* 10  ];
		
		int count=0;
		for(String roll:diceRoll.split(","))
		{
			diceRolls[count++] = (Integer.parseInt(roll));
			
		}
		
		game.initialiseGame(noPlayers, cellPosition, diceRolls);
		game.playGame();
		String result = game.displayResults();
		System.out.println(result);

		
	}

}
