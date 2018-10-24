enum Location{
	DEFAULT, USA, JAPAN
}
public class JapanCarFactory {
	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
			case MICRO:
				car = new MicroCar(Location.JAPAN);
				break;
			
			case MINI:
				car = new MiniCar(Location.JAPAN);
				break;
				
			case LUXURY:
				car = new LuxuryCar(Location.JAPAN);
				break;
			
			default:
				break;
		}
		
		return car;
	}
}
