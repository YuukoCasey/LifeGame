package model;

public class Cell implements Livable{

	private boolean isAlive;
	private boolean nextState;
	
	public Cell(){
		this.isAlive = true;
		this.nextState = true;
	}
	
	public Cell(boolean startState){
		this.isAlive = startState;
		this.nextState = startState;
	}
	
	public boolean getState() {
		return this.isAlive;
	}
	
	public boolean getNextState() {
		return this.nextState;
	}
	
	public void setState(boolean newState) {
		this.isAlive = newState;
	}
	
	public void setNextState(boolean nextState) {
		this.nextState = nextState;
	}
	
	public void updateState() {
		this.isAlive = this.nextState;
	}
	
}
