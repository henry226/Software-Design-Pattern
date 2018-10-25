package Structural.facade;

public class Demo {

	public static void main(String[] args) {
		FacadeShape f = new FacadeShape();
		
		f.drawCircle();
		f.drawSquare();
		f.drawTrangle();
	}

}
