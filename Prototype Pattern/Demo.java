package Structural;

public class Demo {
	public static void main(String[] args){
		// Handles routing makeCopy() method calls to the right subclasses of Animal
		CloneFactory animalMaker = new CloneFactory();
		
		// Creates a new Chicken instance
		Chicken Cluck = new Chicken();
		
		// Creates a clone of Cluck and stores it in its own memory location
		Chicken cloneChicken = (Chicken) animalMaker.getClone(Cluck);
		
		//Output the result, exact copies of each other
		System.out.println(Cluck);
		System.out.println("Cluck HashCode: " + System.identityHashCode(System.identityHashCode(Cluck)));
		System.out.println();
		System.out.println(cloneChicken);
		System.out.println("CloneChicken HashCode: " + System.identityHashCode(System.identityHashCode(cloneChicken)));
	}
}
