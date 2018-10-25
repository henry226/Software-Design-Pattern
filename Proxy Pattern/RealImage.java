
public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadCache(fileName);
	}
	
	@Override 
	public void display() {
		System.out.println("Display " + fileName);
	}
	
	private void loadCache(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
