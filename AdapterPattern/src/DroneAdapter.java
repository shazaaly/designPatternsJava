
public class DroneAdapter implements Duck {
	
	Drone drone;
	
	public DroneAdapter(Drone drone) {
		this.drone = drone;
		
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		drone.beep();
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		drone.spin_rotors();
		
		drone.take_off();
		
	}

}
