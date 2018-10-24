
public class Sony implements Mobile{
	private String processor;
	private String ram;
	
	// constructor
	public Sony(String processor, String ram) {
		this.processor = processor;
		this.ram = ram;
	}
	
	// return String representation of Sony object
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		return String.format("Sony Xperia\nProcessor: %s\nRAM: %s", processor, ram);
	}
}
