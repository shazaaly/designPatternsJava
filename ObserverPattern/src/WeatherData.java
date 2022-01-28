import java.util.ArrayList;

public class WeatherData implements Subject{
/*	needed local variables*/
	
	private float temp;
	private float windSpeed;
	private float pressure;
	
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(i);
			}
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(temp, windSpeed, pressure);
			
		}
		
	}
	
	public void MeasurementsChanged() {
		notifyObservers();
	}
	
//	Make needed getters and setters for data needed:
	public void setMeasurments(float temp ,float windSpeed, float pressure)
	{
		temp = this.temp;
		pressure = this.pressure;
		windSpeed = this.windSpeed;
		
	}
	
	public float getTemp() {
		return temp;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public float getSpeedWind() {
		return windSpeed;
	}
}
