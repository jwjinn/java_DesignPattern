
public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {//Weather Data의 주체가 주입된다.
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay - 온도: " + temperature + "습도: " +  humidity);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		
		display();
		
	}
	
	public void disconnect() {
		System.out.println("CurrentConditionsDisplay - observer와의 관계를 청산하겠습니다.");
		weatherData.removeObserver(this);
	}
	

}
