package control;

import model.Livable;

public final class Rules {
	
	public static boolean calculateNextLifeState(Livable curCell, Livable[] neighbours) {
		
		boolean retBool;
		
		//If the cell being observed is dead
		if (!curCell.getState()) {
		
			int recreateNumber = 3;
			int liveNeighbourNum = Rules.getNumLivableMatchState(true, neighbours);
			if (recreateNumber == liveNeighbourNum) {
				retBool = true;
			} else retBool = false;
			
		} else { //What to do if curCell is alive
		
			int minLiveCell = 2; //The minimum number of living neighbours a cell
								 //can have and still live
			int maxLiveCell = 3; //The maximum number of living neighbours a cell
								 //can have and still live
			
			int numLivingNeighbours = Rules.getNumLivableMatchState(true, neighbours);
			if (numLivingNeighbours >= minLiveCell && numLivingNeighbours <= maxLiveCell) {
				retBool = true;
			} else retBool = false;
			
		}
		return retBool;
	}
	
	public static int getNumLivableMatchState(boolean checkState, Livable[] neighbours) {
		
		int retNum = 0;
		for (Livable l : neighbours) {
			if (l.getState() == checkState) {
				retNum++;
			}
		}
		return retNum;
	}
	
}
