
public class DuckType2 extends Duck {

	public DuckType2(FlyBehavior flyB) {
		super(flyB);
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}

}
