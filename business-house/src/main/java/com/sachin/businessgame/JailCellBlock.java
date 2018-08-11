package com.sachin.businessgame;
class JailCellBlock extends CellBlock {

	public JailCellBlock() {

	}

	final int value = -150;

	int getCellBlock() {
		return value;
	}

	@Override
	int getPrice() {
		// TODO Auto-generated method stub
		return value;
	}

}