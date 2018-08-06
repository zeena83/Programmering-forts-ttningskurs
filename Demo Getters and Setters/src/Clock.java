
public class Clock {
	
	private int seconds;
	private int minutes;
	private int hours;
	
	
	public void tick() {
		setSeconds(seconds + 1);
	}
	
	
	
	public void setHours(int h) {
		if(h >= 0 && h <= 23) {
			hours = h;
		}else {
			//hours = 0;
			hours = h % 24;
			
		}
	}
	public void setMinuters(int m) {
		if(m >= 0 && m <= 59) {
			minutes = m;
		}else {
			//minutes = 0;
			minutes = m % 60;
			setHours(hours = m/60);
		}
	}
	public void setSeconds(int s) {
		if(s >= 0 && s <= 59) {
			seconds = s;
		}else {
			//seconds = 0;
			seconds = s % 60;
			setMinuters(minutes + s/60);
		}
	}
	public void setTime(int h, int m, int s) {
		setHours(h);
		setMinuters(m);
		setSeconds(s);
		
	}
	
	
	public int getSeconds() {
		return seconds;	
	}
	public int getminutes() {
		return minutes;
	}
	public int getHours() {
		return hours;
	}
	
	
	public void printClock() {
		System.out.println(hours+":"+minutes+":"+seconds);
	}
}
