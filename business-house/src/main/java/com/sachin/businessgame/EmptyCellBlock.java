package com.sachin.businessgame;
class EmptyCellBlock extends CellBlock {

	public EmptyCellBlock() {
//		super(type);
		// TODO Auto-generated constructor stub
	}

	final int value = 0;

	int getCellBlock() {
		return value;
	}

	@Override
	int getPrice() {

		return value;
	}

}