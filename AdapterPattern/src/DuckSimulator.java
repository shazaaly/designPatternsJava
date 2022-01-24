
public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MallardDuck();
		Drone drone = new SuperDrone();
		testDuck(duck);
	
//	test turkey, we can not pass turkey to testDuck();
	
		Turkey turkey  = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Duck droneAdapter = new DroneAdapter(drone);
		
		testDuck(turkeyAdapter);
		testDuck(droneAdapter);
	
	

}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	static void testDuck(Drone drone) {
		drone.beep();
		drone.take_off();
	}
}
