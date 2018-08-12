package com.sachin.businessgame;
class HotelCellBlock extends CellBlock {

	int playerId;
	@Override
	int getValue() {
		return -50;
	}

	public void setPlayerId(int id)
	{
		playerId =id;
		
	}
	
	public int getPlayerId()
	{
		return playerId;
	}
	void setOccupied()
	{
		occupied =true;
	}
}