
public class CurrentConditions implements Observer , DisplayElement{
	private float temp;
	private float windSpeed;
	private float pressure;
	
	private Subject weatherData;
	
	public CurrentConditions(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" Current Temp is : " +" " +  temp +  "Wind Speed is "+ " " + windSpeed + "Presuure:  " + pressure);
		
	}

	@Override
	public void update(float temp, float windSpeed, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.windSpeed = windSpeed;
		this.pressure = pressure;
	
		
	}

}
