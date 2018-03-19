
public class LastNumber extends java.util.Observable{
	
	private int num;
	
	public LastNumber() {
		this.num = 0;
	}
	
	public void setLastNumber(int newNum) {
		num = newNum;
		setChanged();
		notifyObservers();
	}
	
	public int getLastNumber() {
		return num;
	}

}
