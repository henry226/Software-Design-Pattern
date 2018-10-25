package Structural;

// Making this class cloneable, so here I am telling Java it is 
// fine to copy instances of this class.
public interface Animal extends Cloneable{
	public Animal makeCopy();
}
