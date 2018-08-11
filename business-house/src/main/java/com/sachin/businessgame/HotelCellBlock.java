package com.sachin.businessgame;
class HotelCellBlock extends CellBlock {

	@Override
	int getValue() {
		return -50;
	}

	void setOccupied()
	{
		occupied =true;
	}
}