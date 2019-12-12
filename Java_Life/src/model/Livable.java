package model;

public interface Livable {

	public boolean getState();
	public boolean getNextState();
	public void setState(boolean newState);
	public void setNextState(boolean nextState);
	public void updateState();
	
}
