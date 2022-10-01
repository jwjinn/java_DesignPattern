
public class current3 implements Observer, DisplayElement{
	
	WeatherData weatherData;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public current3(WeatherData weatherData ) {//주체(Weather)님 객체를 생성했습니다. 주체님을 구독하겠습니다.
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current3 - 온도: " + temperature + "습도: " +  humidity + "기압: " + pressure);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
	}

}
