package Day03;




/**
 *��������ComaparableCircle���󣬵���compareTo�����Ƚ�������İ뾶��С��
 *
 */
public class TestInterface {
	
	public static void main(String[] args) {
	
		
		ComparableCircle [] com = new ComparableCircle [5];
		
		com[0] = new ComparableCircle(3);
		com[1] = new ComparableCircle(4);
		com[2] = new ComparableCircle(5);
		com[3] = new ComparableCircle(6);
		com[4] = new ComparableCircle(7);


		for(int i=0;i<com.length-1 ;i++){
			
			System.out.println(com[i].compareTo(com[i+1])); 
			
		}
		
		
	}
	
     



}


