
public class Postion {
	private int x;
	private int y;
	
	//hämta
	public int getx() {
		return x;
	}
	
	
	public int gety() {
		return y; 
	}
	
	// ger ett värder till x
	public void setx(int x) {
		if(x >= 0) {
			this.x = x;	
		}else {
			this.x = 0;
		}
		
	}
	
	public void sety(int y) {
		if(y >= 0) {
			this.y = y;
		}else {
			this.y = 0;
		}
		
	}
	
	
	public void setPos(int x, int y) {
		//this.x = x;
		//this.y = y;
		setx(x);
		sety(y);
	}
	

}
