
public class Samsung implements Mobile{
	private String processor;
	private String ram;
	
	// Constructor
	public Samsung(String processor, String ram) {
		this.processor = processor;
		this.ram = ram;
	}
	
	// return String representation of Samsung object
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		return String.format("Samsung Galaxy\nProcessor: %s\nRAM: %s", processor, ram);
	}
}
