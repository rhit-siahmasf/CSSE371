
public class Main {

	public static void main(String[] args) {
		
		Coffee myCoffee = new WithMilk(new Espresso());
		
		System.out.println(myCoffee.description + " costs " + myCoffee.cost());
		
		System.out.println("If this line prints, you have figured out JAR!");
		
	}

}
