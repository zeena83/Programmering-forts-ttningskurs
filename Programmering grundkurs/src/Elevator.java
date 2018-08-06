
public class Elevator {
	
	public int floor;
	
	public void upAfloor() {
		floor++;
	}
	
	public void downAfloor(){
		floor--;
	}
	
	public void setfloor(int f) {
		floor = f;
	}
	
	public boolean compareElevator(Elevator e) {
		return e.floor == floor;
		
		
		
	}

}
