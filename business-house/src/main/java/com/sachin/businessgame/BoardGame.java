package com.sachin.businessgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardGame {
	private List<CellBlock> cellBlocks;
	private List<Player> players;
	
	private final int MAX_MOVES = 10;

	private final int MAX_CELL_POSITION=38;
	
	public Integer getMAX_CELL_POSITION() {
		return MAX_CELL_POSITION;
	}


	public Integer getMaxMoves() {
		return MAX_MOVES;
	}


	public void initGame(int noPlayers, String cellInfo, String diceOutput) {
		players = new ArrayList<Player>(noPlayers);

		for(int i=0;i<noPlayers;i++)
		{
			players.add(new Player(i));
		}
		populateCellBlock(cellInfo);

	}

	
	public List<CellBlock> getCellBlocks() {
		return cellBlocks;
	}


	public void setCellBlocks(List<CellBlock> cellBlocks) {
		this.cellBlocks = cellBlocks;
	}


	public List<Player> getPlayers() {
		return players;
	}
	


	private void populateCellBlock(String cellInfo) {
		cellBlocks = new ArrayList<CellBlock>();

		String[] cellType = cellInfo.split(",");

		int position = 0;
		for (String cell : cellType) {
			CellBlock cellBlock = null;

			if (cell.equalsIgnoreCase("J"))
				cellBlock = new JailCellBlock();
			if (cell.equalsIgnoreCase("H"))
				
				cellBlock = new HotelCellBlock();
			if (cell.equalsIgnoreCase("E"))
				
				cellBlock = new EmptyCellBlock();
			if (cell.equalsIgnoreCase("T"))
				cellBlock = new TreasureCellBlock();

			cellBlocks.add(cellBlock);
		}
	}

	public static void main(String args[]) {

	}
}
