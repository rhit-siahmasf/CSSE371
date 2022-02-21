package polymorphism;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * This program features a zookeeper feeding her pets.
 * 
 * TODO: Move the code FILES into the presentation/domain/datasource layers they most closely belong to.
 * TODO: Move code down to the appropriate layer.
 * TODO: Fix layering violations by pulling code up to the appropriate layer. 
 * 
 * @author Jason Yoder, Matt Boutell, Mark Hays, and their colleagues.
 *
 */
public class PetMain {
	private List<Pet> pets; 
	private Zookeeper zookeeper;
	private PetLoader petLoader = new PetLoader();
	
	public static void main(String[] args) {
		new PetMain();
	}

	public PetMain() {
		this.zookeeper = new Zookeeper("Mary");
		this.pets = this.petLoader.loadPets();
		feedPets();
		countPetsEating();
		showPetSpecialAbilities();
	}

	
	public void feedPets() {
		this.zookeeper.feedPets(this.pets);
	}
	
	public void countPetsEating() {
		int count = 0;
		for (Pet pet : this.pets) {
			if (pet.isEating()) {
				count++;
			}
		}
		System.out.printf("There are %d pets eating\n", count);
	}
	
	private void showPetSpecialAbilities() {
		for (Pet pet : this.pets) {
			pet.doSpecialAbility();
		}
		System.err.println("Pet special abilities written to petLog.txt.");
	}
}