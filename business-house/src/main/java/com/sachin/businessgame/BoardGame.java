package com.sachin.businessgame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardGame {
	private Map<Integer, String> cellBlocks;
	private Map<Integer,HotelCellBlock> hotelBlocks;
	public Map<Integer, HotelCellBlock> getHotelBlocks() {
		return hotelBlocks;
	}

	private List<Player> players;

	private final int MAX_MOVES = 10;

	private final int MAX_CELL_POSITION = 38;

	public Integer getMAX_CELL_POSITION() {
		return MAX_CELL_POSITION;
	}

	public Integer getMaxMoves() {
		return MAX_MOVES;
	}

	public void initialiseGame(int noPlayers, String cellInfo) {
		initialisePlayers(noPlayers);
		initialiseCellBlock(cellInfo);
	}

	private void initialisePlayers(int noPlayers) {
		players = new ArrayList<Player>(noPlayers);

		for (int i = 0; i < noPlayers; i++) {
			players.add(new Player(i));
		}
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

	private void initialiseCellBlock(String cellInfo) {
		cellBlocks = new HashMap<Integer, String>();
		hotelBlocks = new HashMap<Integer,HotelCellBlock>();
		
		String[] cellType = cellInfo.split(",");

		int position = 0;
		for (String cell : cellType) {
			cellBlocks.put(position, cell);
			if(cell.equalsIgnoreCase("H"))
			{
				hotelBlocks.put(position, new HotelCellBlock());
			}
			position++;
		}
	}

	public static void main(String args[]) {

	}
}
