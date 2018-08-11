package com.sachin.businessgame;
class TreasureCellBlock extends CellBlock {

	public TreasureCellBlock() {
		
	}

	final int value = 200;;

	int getCellBlock() {
		return value;
	}

	@Override
	int getPrice() {
		// TODO Auto-generated method stub
		return value;
	}

}