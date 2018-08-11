package com.sachin.businessgame;

public abstract class CellBlock {

	abstract int getValue();

	int value;
	boolean occupied = false;
	int position;

	public boolean isOccupied() {
		return occupied;
	}

	static CellBlock getCellBlock(String type) {
		switch (type) {
		case "J":
			return new JailCellBlock();
		case "H":
			return new HotelCellBlock();
		case "T":
			return new TreasureCellBlock();
		case "E":
			return new EmptyCellBlock();

		}
		return null;
	}
}