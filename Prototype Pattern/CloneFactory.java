package Structural;
//Receives any Animal, or Animal subclass and makes a copy of it
// and stores it in its own location in memory

// CloneFactory has no idea what these objects are except that they 
// are subclasses of Animal
public class CloneFactory {
	
	public Animal getClone(Animal animal) {
		
		// Polymorphism the chicken makeCopy() is called here instead of Animals
		return animal.makeCopy();
		
	}
}
