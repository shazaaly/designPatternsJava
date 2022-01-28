
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditions currentData = new CurrentConditions(weatherData);
		
		weatherData.setMeasurments(80, 65, 30);
		
		currentData.display();

	}

}
