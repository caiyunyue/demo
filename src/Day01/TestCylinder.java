package Day01;

public class TestCylinder {
     public static void main(String[] args) {
    	 Cylinder c = new Cylinder();
    	 System.out.println(c.findArea());
    	 System.out.println(c.findVolume());
    	 
    	 c.setR(2);
    	 c.setHeight(2);
    	 
    	 System.out.println(c.findArea());
    	 System.out.println(c.findVolume());
    	
	}
}


