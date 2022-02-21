
public class CurrentConditionsObserver implements Observer {
	
	private int temp;
	private int humidity;

	public CurrentConditionsObserver(Subject weather) {
		weather.registerObserver(this);
	}

	@Override
	public void update(int temp, int humidity) {
		this.temp = temp;
		this.humidity = humidity;
		this.displayCurrent();
	}

	public void displayCurrent() {
		System.out.println("Current Temp: " + this.temp);
		System.out.println("Current Humidity: " + this.humidity);
		 
	}

}
