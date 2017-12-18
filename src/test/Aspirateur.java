package test;

public class Aspirateur {
	
	private int x;
	private int y;
	private String orientation;
	
	
	public Aspirateur(int x, int y, String orientation) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	
	@Override
	public String toString() {
		return "Aspirateur [x=" + x + ", y=" + y + ", orientation=" + orientation + "]";
	}

	public void commandeD() {
		String orientation = null;
		if(this.orientation.equals("N")) {
			orientation="E";
		}
		if(this.orientation.equals("E")) {
			orientation="S";
		}
		if(this.orientation.equals("S")) {
			orientation="W";
		}
		if(this.orientation.equals("W")) {
			orientation="N";
		}
		this.setOrientation(orientation);
	}
	
	public void commandeG() {
		String orientation = null;
		if(this.orientation.equals("N")) {
			orientation="W";
		}
		if(this.orientation.equals("W")) {
			orientation="S";
		}
		if(this.orientation.equals("S")) {
			orientation="E";
		}
		if(this.orientation.equals("E")) {
			orientation="N";
		}
		this.setOrientation(orientation);
	}
	
	public void commandeA() {
		
		if(this.orientation.equals("N")) {
			this.setY(y+1);
		}
		if(this.orientation.equals("W")) {
			this.setX(x-1);
		}
		if(this.orientation.equals("S")) {
			this.setY(y-1);
		}
		if(this.orientation.equals("E")) {
			this.setX(x+1);
		}
		
		
	}
	
	

}
