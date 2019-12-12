package model;

import control.Rules;
import model.Livable;
import model.Cell;

public class Board {

	private Livable[][] cellGrid; //NOTE: Replace Array with List
	//TODO: Replace Array with List
	
	public Board(){
		
		for (int i = 0; i < 16; i++)
			for (int j = 0; j < 16; j++)
				this.cellGrid[i][j] = new Cell(false);
	}
	
	public Board(int squNum){
		for (int i = 0; i < squNum; i++)
			for (int j = 0; j < squNum; j++)
				this.cellGrid[i][j] = new Cell(false);
	}
	
	public Board(int xSize, int ySize){
		for (int i = 0; i < xSize; i++)
			for (int j = 0; j < ySize; j++)
				this.cellGrid[i][j] = new Cell(false);
	}
	
}
