
public class Apple implements Mobile{
	private String processor;
	private String ram;
	
	// Constructor
	public Apple(String processor, String ram) {
		this.processor = processor;
		this.ram = ram;
	}
	
	// return String representation of Apple object
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		return String.format("Iphone XR\nProcessor: %s\nRAM: %s", processor, ram);
	}
}
