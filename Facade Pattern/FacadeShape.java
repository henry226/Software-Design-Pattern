package Structural.facade;

public class FacadeShape {
	private Shape circle;
	private Shape trangle;
	private Shape square;
	
	public FacadeShape() {
		circle = new Circle();
		trangle = new Trangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawTrangle() {
		trangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
