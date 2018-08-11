package com.sachin.businessgame;
class HotelCellBlock extends CellBlock {

	public HotelCellBlock() {
	//	super(type);
		// TODO Auto-generated constructor stub
	}

	final int value = -50;

	int getCellBlock() {
		return value;
	}

	@Override
	int getPrice() {
		return value;
	}

}