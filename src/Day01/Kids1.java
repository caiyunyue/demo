package Day01;

public class Kids1 extends ManKind {
	
	public int years;
	public void  employeed(){
		System.out.println("should study");
	}
	void  printAge(){
		System.out.println("yeas"+"=" + years);
    }
	
	
    public static void main(String[] args) {
    	Kids1 someKid = new Kids1();
    	someKid.sex = 1;
    	someKid.salary = 50;
    	someKid.years  = 18;
    	someKid.manOrWorman();
        someKid.employeed();
        someKid.printAge();
    		
	}
}
