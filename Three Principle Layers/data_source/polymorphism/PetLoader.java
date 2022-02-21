package polymorphism;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class PetLoader {
	
	public List<Pet> loadPets() {
		List<Pet> pets = null;

		try(Scanner in = new Scanner(new FileInputStream("pets.txt"))){
			pets = this.loadPetsFromFile(in);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Error loading pets", e);
		}
		System.out.println("Loaded " + pets.size() + " pets.");
		return pets;
	}

	private List<Pet> loadPetsFromFile(Scanner in) {
		List<Pet> pets = new ArrayList<Pet>();
		PetLogWriter logger = new PetLogWriter("petLog.txt");
		HashMap<String, Supplier<Pet>> petConstructionMap = new HashMap<>();
		petConstructionMap.put("Cat", () -> new Cat(in.next(), logger));
		petConstructionMap.put("Dog", () -> new Dog(in.next(),in.next(), logger));
		petConstructionMap.put("Fish", () -> new Fish(in.next(), in.nextInt()));
		
		while(in.hasNext()) {
			String petType = in.next();
			Pet constructedPet = petConstructionMap.get(petType).get();
			pets.add(constructedPet);
			
		}
		return pets;
	}

}
