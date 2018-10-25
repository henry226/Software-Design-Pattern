
public class ProxyDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("New Year's Eve.png");
		
		// No cache yet
		image.display();
		System.out.println();
		
		// image cached
		image.display();
	}

}
