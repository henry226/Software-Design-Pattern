
public class MobileFactory {
	// Factory method design pattern used 
	public static Mobile createMobile(String type) {
		if(type.equals(Mobile.Apple)) { 
			return new Apple("A12", "8G");
		}
		else if(type.equals(Mobile.Samsung)) {
			return new Samsung("S9", "10G");
		}
		else if(type.equals(Mobile.Sony)) {
			return new Sony("Y9", "6G");
		}
		else 
			return null;
	}
}
