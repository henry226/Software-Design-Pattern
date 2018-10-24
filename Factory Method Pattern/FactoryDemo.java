// This is a simple demo of factory design pattern used
public class FactoryDemo {
	public static void main(String[] args) {
		// create samsung object and output result
		Mobile samsung = MobileFactory.createMobile(Mobile.Samsung);
		System.out.println(samsung + "\n");
		
		// create apple object and output result
		Mobile apple = MobileFactory.createMobile(Mobile.Apple);
		System.out.println(apple + "\n");
		
		// create sony object and output result
		Mobile sony = MobileFactory.createMobile(Mobile.Sony);
		System.out.println(sony + "\n");
	}
}
