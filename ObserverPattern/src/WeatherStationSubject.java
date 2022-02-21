import java.util.ArrayList;
import java.util.List;

public class WeatherStationSubject implements Subject {

	private List<Observer> observers;
	private int temp, humidity;
	
	public WeatherStationSubject() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(o -> o.update(this.temp, this.humidity));
	}

	public void measurementsChanged(int temp, int humidity) {
		this.temp = temp;
		this.humidity = humidity;
		notifyObservers();
	}
}
