
public class Main {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		current3 c3 = new current3(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		
		weatherData.setMeasurements(82, 70, 29.2f);
		
		System.out.println("conditionDisplay관계 청산");
		conditionsDisplay.disconnect();
		
		weatherData.setMeasurements(78, 90, 29.2f);
		
		
		
	}

}
