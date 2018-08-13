package com.sachin.businessgame;

public abstract class CellBlock {

	abstract int getValue();

	int value;
	private final static int TREASURE_CELL_PRICE = 200;
	private final static int JAIL_CELL_PRICE = -150;
	private final static int HOTEL_CELL_PRICE = -50;
	private final static int EMPTY_CELL_PRICE = 0;

	boolean occupied = false;
	int position;

	public boolean isOccupied() {
		return occupied;
	}

	static CellBlock getCellBlock(String type) {
		switch (type) {
		case "J":
			return new JailCellBlock(JAIL_CELL_PRICE);
		case "H":
			return new HotelCellBlock(HOTEL_CELL_PRICE);
		case "T":
			return new TreasureCellBlock(TREASURE_CELL_PRICE);
		case "E":
			return new EmptyCellBlock(EMPTY_CELL_PRICE);

		}
		return null;
	}
	
	
}