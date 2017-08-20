package Day01;

public class Point {
	double x;
	double y;
	double z;
	Point(double x,double y,double z){
		this.x= x;
		this.y =y;
		this.z = z;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	double getDistance(Point p){
		return  (this.x - p.x)*(this.x - p.x)+(this.y - p.y)*(this.y - p.y)+(this.z - p.z)*(this.z - p.z);
	}
	
	public static void main(String args[]){
		Point point = new Point(3,4,5);
		Point p = new Point(0,0,0);
		System.out.println(point.getDistance(p));
		
		point.setX(1);
		
		System.out.println(point.getDistance(new Point(1,1,1)));
	}
}
