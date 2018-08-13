package com.sachin.businessgame;

class TreasureCellBlock extends CellBlock {

	@Override
	int getValue() {
		return value;
	}

	public TreasureCellBlock(int value)
	{
		this.value = value;
	}
}