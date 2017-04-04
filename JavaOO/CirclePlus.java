package systemprj;

public class CylinderPlus {

	Circle cir;
	private double height;
	
	public CylinderPlus(Circle cir, double height) {
		this.cir = cir;
		this.height=height;
	}
	
	public static double getVolume(double Circlecom,double height) {
		return Circlecom*height;
	}
	
	public static void main(String[] args) {
		CylinderPlus cd=new CylinderPlus(new Circle(2.8),5.6);
		System.out.println("원통의 부피 = "+cd.getVolume(cd.cir.getArea(),cd.height));
	}
}
