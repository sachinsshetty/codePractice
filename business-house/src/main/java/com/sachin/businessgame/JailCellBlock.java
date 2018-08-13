package com.sachin.businessgame;
class JailCellBlock extends CellBlock {

	@Override
	int getValue() {
		return value;
	}
	
	public JailCellBlock(int value)
	{
		this.value = value;
	}

}