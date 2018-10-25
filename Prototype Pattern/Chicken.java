package Structural;

public class Chicken implements Animal{
	
	// constructor 
	public Chicken() {
		System.out.println("Chicken Made");
	}
	
	public Animal makeCopy() {
		System.out.println("Chicken is being made here...");
		
		Chicken chickenObject = null;
		
		try {
			// Calls the Animal super class clone()
			// Then casts the results to Chicken
			chickenObject = (Chicken)super.clone();
		} 
		// If Animal class did not extend Cloneable, this error is thrown
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return chickenObject;
	}
	
	@Override
	public String toString() {
		return "toString method in chicken class";
	}
}
