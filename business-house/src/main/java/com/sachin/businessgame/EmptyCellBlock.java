package com.sachin.businessgame;

class EmptyCellBlock extends CellBlock {

	@Override
	int getValue() {
		return value;
	}

	public EmptyCellBlock(int value)
	{
		this.value = value;
	}
}